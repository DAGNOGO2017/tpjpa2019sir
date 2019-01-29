package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;

@WebServlet(name="userServlet", urlPatterns={"/userServlet"})
public class userServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {
	    response.setContentType("text/html");
	    
	    PrintWriter out = response.getWriter(); 
	    
	    User user = new User();
	    user.setNom(request.getParameter("nom"));
	    user.setPrenom(request.getParameter("prenom"));
	    user.setEmail(request.getParameter("email"));
	    
	    userServlet test = new userServlet();
	    EntityManagerFactory factory =   Persistence.createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            manager.persist(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        manager.close();
        System.out.println(".. done");
	    }
}
