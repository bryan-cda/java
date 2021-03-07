package br.com.alura.leilao.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("tests");
    public static EntityManager getEntityManage(){
        return factory.createEntityManager();
    }
}
