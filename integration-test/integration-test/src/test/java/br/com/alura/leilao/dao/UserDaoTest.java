package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import static org.assertj.core.api.Assertions.assertThat;

public class UserDaoTest {

    private EntityManager entityManager;
    private UserDao userDao;

    @Before
    public void beforeEach (){
        this.entityManager =  JpaUtil.getEntityManage();
        this.userDao = new UserDao(entityManager);
        this.entityManager.getTransaction().begin();
    }

    @After
    public void afterAll(){
        entityManager.getTransaction().rollback();
    }

    public User getValidUser(){
        User user = new User("Bryan", "gatonet@blinder.com", "789");
        return user;
    }

    @Test
    @DisplayName("Integration test to return user in database by name")
    public void givenGenericDAOEntity_whenFindByExistentName_thenReturn(){
        this.entityManager.persist(getValidUser());
        User foundUser = userDao.buscarPorUsername("Bryan");

        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getNome()).isEqualTo("Bryan");
        assertThat(foundUser.getSenha()).isEqualTo("789");
        assertThat(foundUser.getEmail()).startsWith("gatonet");

    }

    @Test
    @DisplayName("Integration test to return exception when try to find non existent user in database")
    public void givenGenericDAOEntity_whenFindByNonExistentName_thenThrowException(){
        this.userDao = new UserDao(entityManager);

        User user = new User("Bryan", "email@provider.com", "977");
        entityManager.persist(user);
        Assert.assertThrows(NoResultException.class, () -> this.userDao.buscarPorUsername("John Doe"));
    }
}
