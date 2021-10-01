package contrtolador;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Controlador {
	Connection cnn;
	
	public Connection conexionbd() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {JOptionPane.showMessageDialog(null, "error 1");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {cnn=DriverManager.getConnection("jdbc:mysql://localhost:3305/tienda","root","96022307441");
      
			
		} catch (Exception e) {JOptionPane.showMessageDialog(null, "error 2");
			
		}
		return cnn;
		
		
	}
	

}
