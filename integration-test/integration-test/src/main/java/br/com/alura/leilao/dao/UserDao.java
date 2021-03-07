package br.com.alura.leilao.dao;

import javax.persistence.EntityManager;

import br.com.alura.leilao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	private EntityManager em;

	@Autowired
	public UserDao(EntityManager entityManager){
		this.em = entityManager;
	}

	public User buscarPorUsername(String username) {
		return em.createQuery("SELECT u FROM User u WHERE u.nome = :username", User.class)
				.setParameter("username", username)
				.getSingleResult();
	}

	public void deletar(User user) {
		em.remove(user);
	}

}
