package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import domain.User;

public class JpaTest {

	/**
	 * @param args
	 */
	private EntityManager manager;
	
	public JpaTest(EntityManager manager) {
        this.manager = manager;
    }

	
    public static void main(String[] args) {
        EntityManagerFactory factory =   Persistence.createEntityManagerFactory("example");
        EntityManager manager = factory.createEntityManager();
        JpaTest test = new JpaTest(manager);

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            test.createUsers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();

       // test.listUsers();
            
        manager.close();
        System.out.println(".. done");
    }

    private void createUsers() {
        int numOfUsers = manager.createQuery("Select u From User u", User.class).getResultList().size();
        manager.persist(new User("Jakab Gipsz"));
    }


}
