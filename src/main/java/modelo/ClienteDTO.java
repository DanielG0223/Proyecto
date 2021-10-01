package modelo;

public class ClienteDTO {
	private long cedulacliente ;
	private String direccioncliente;
	private String emailcliente;
	private String nombrecliente;
	private String telefonocliente;
	
	public ClienteDTO(long cedulacliente, String  nombrecliente , String direccioncliente , String telefonocliente,
			String emailcliente  ) {
		this.cedulacliente = cedulacliente;
		this.nombrecliente = nombrecliente;
		this.direccioncliente = direccioncliente;
		this.telefonocliente = telefonocliente;
		this.emailcliente = emailcliente;
		
		
	}

	public ClienteDTO(long cedulacliente) {
		this.cedulacliente = cedulacliente;
	}

	public long getCedulacliente() {
		return cedulacliente;
	}

	public void setCedulacliente(long cedulacliente) {
		this.cedulacliente = cedulacliente;
	}

	public String getDireccioncliente() {
		return direccioncliente;
	}

	public void setDireccioncliente(String direccioncliente) {
		this.direccioncliente = direccioncliente;
	}

	public String getEmailcliente() {
		return emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getTelefonocliente() {
		return telefonocliente;
	}

	public void setTelefonocliente(String telefonocliente) {
		this.telefonocliente = telefonocliente;
	}
	
	
}
