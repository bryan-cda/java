package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.User;
import org.assertj.core.api.BDDAssertions;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;

public class UserDaoTest {

    private  EntityManager entityManager;
    private UserDao userDao;

    @Test
    public void findByNameTest(){
        this.entityManager = JpaUtil.getEntityManage();
        this.userDao = new UserDao(entityManager);

        User user = new User("Bryan", "gatonet@blinder.com", "789");
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();;
        User foundUser = userDao.buscarPorUsername("Bryan");
        BDDAssertions.assertThat(foundUser).isNotNull();
    }
}
