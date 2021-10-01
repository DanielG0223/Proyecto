package contrtolador;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
;

/**
 * Servlet implementation class Servletlogin
 */
public class Servletlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servletlogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Login 
				String u,c;
				u=request.getParameter("user");
				c=request.getParameter("password");
				if (u.equals("admininicial")&& c.equals("admin123456")) {
					
					response.sendRedirect("PaginaInicio.jsp?dat="+u);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Datos incorrectos");
					response.sendRedirect("Login.jsp?dat="+u);
					
				}
	}

}
