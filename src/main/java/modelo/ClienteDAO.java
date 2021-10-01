package modelo;

import java.sql.*;


import contrtolador.Controlador;

public class ClienteDAO {
	
	Controlador cn= new Controlador();
	Connection cnn=cn.conexionbd();
	PreparedStatement ps;
	ResultSet rs;
	ClienteDTO usdto=null;
	
	public boolean insertarcliente(ClienteDTO us) {
		int c;
		boolean d=false;
		try {
			ps=cnn.prepareStatement("INSERT INTO clientes VALUES(?,?,?,?,?)");
			ps.setLong(1, us.getCedulacliente());
			ps.setString(2,us.getNombrecliente());
			ps.setString(3,us.getDireccioncliente());
			ps.setString(4,us.getTelefonocliente());
			ps.setString(5,us.getEmailcliente());
		
			c=ps.executeUpdate();
			if (c>0) {
				d=true;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	public ClienteDTO consultarcliente(ClienteDTO us) {
		try {
			ps=cnn.prepareStatement("SELECT * FROM clientes where Cedula=? ");
			ps.setLong(1, us.getCedulacliente());
			rs=ps.executeQuery();
			if(rs.next()) {
				usdto= new ClienteDTO(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			else {
				return null;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usdto;
	}
	
	public int actualizarcliente(ClienteDTO us) {
		int x=0;
		try {
			ps=cnn.prepareStatement("UPDATE clientes SET Direccion=?,CorreoElectronico=?,NombreCompleto=?,Telefono=? WHERE Cedula=?");
			ps.setString(1, us.getDireccioncliente());
			ps.setString(2,us.getEmailcliente());
			ps.setString(3, us.getNombrecliente());
			ps.setString(4, us.getTelefonocliente());
			ps.setLong(5, us.getCedulacliente());
			x=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
	}
	public int eliminarcliente(ClienteDTO us) {
		int x=0;
		try {
			ps=cnn.prepareStatement("DELETE FROM clientes WHERE Cedula=?");
			ps.setLong(1, us.getCedulacliente());
			x=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;

	}
	

}
