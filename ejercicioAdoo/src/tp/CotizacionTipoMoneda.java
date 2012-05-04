package tp;

public class CotizacionTipoMoneda {
	
	private TipoMoneda tipoMoneda;
	private double valorCompra;
	private double valorVenta;
	
	public CotizacionTipoMoneda(TipoMoneda tipoMoneda, double valorCompra, double valorVenta) {
		this.tipoMoneda = tipoMoneda;
		this.valorCompra = valorCompra;
		this.valorVenta = valorVenta;
	}

	public TipoMoneda getTipoMoneda() {
		return tipoMoneda;
	}
	
	public void setTipoMoneda(TipoMoneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	
	public double getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public double getValorVenta() {
		return valorVenta;
	}
	
	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}
		
}
