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
        EntityManagerFactory factory =   Persistence.createEntityManagerFactory("dev");
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

    // Enregistrement d'un nouvel utilisateur
    public void createUsers( ) {
       User user = new User();
       user.setNom("DAGNOGO");
       user.setPrenom("kikson");
       user.setEmail("kiko123");
       
     //--- persistons ce user dans la base
      // EntityTransaction tx = manager.getTransaction();
       System.out.println( "Début de la transaction");
         System.out.println( "Ajout du user dans la base en cours..." );
         manager.persist(user );
         System.out.println( "Transaction validée");
       }
 
}
