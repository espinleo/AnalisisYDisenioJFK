package tp;

public class Domicilio {
	
	private String provincia;
	private String calle;
	private String altura;
	private String codigoPostal;
	
	public Domicilio(String provincia, String calle, String altura, String codigoPostal) {
		this.provincia = provincia;
		this.calle = calle;
		this.altura = altura;
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
		
}
