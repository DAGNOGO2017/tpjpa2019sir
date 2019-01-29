package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="userServlet",
urlPatterns={"/userServlet"})
public class userServlet extends HttpServlet{
//	 @Override
//	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//	            throws ServletException, IOException {
//	            
//	        PrintWriter p = new PrintWriter(resp.getOutputStream());
//	        p.print("Hello world SIR");
//	        p.flush();
//	        
//	    }

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {
	    response.setContentType("text/html");
	    
	    PrintWriter out = response.getWriter();  
	    out.println("<HTML>\n<BODY>\n" +
	                "<H1>Recapitulatif des informations</H1>\n" +
	                "<UL>\n" +            
	        " <LI>Nom: "
	                + request.getParameter("nom") + "\n" +
	                " <LI>Prenom: "
	                + request.getParameter("prenom") + "\n" +
	                " <LI>Age: "
	                + request.getParameter("email") + "\n" +
	                "</UL>\n" +                
	        "</BODY></HTML>");
		}
}
