package tp;

public abstract class EntidadFinanciera {
	
	private long codigoUnico;
	private Domicilio domicilio;
	private Certificado certificado;
		
	public EntidadFinanciera(long codigoUnico, Domicilio domicilio, Certificado certificado) {
		this.codigoUnico = codigoUnico;
		this.domicilio = domicilio;
		this.certificado = certificado;
	}

	public long getCodigoUnico() {
		return codigoUnico;
	}
	
	public void setCodigoUnico(long codigoUnico) {
		this.codigoUnico = codigoUnico;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public Certificado getCertificado() {
		return certificado;
	}
	
	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}
		
}
