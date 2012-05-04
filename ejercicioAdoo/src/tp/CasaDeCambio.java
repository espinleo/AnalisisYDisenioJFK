package tp;
import java.util.ArrayList;

public class CasaDeCambio extends EntidadFinanciera {
	
	private ArrayList<CotizacionTipoMoneda> cotizacionMonedas;
		
	public CasaDeCambio(long codigoUnico, Domicilio domicilio, Certificado certificado) {
		super(codigoUnico, domicilio, certificado);
		CotizacionTipoMoneda cotizacionDolar = new CotizacionTipoMoneda(TipoMoneda.DOLAR, 4.40, 4.44);
		CotizacionTipoMoneda cotizacionEuro = new CotizacionTipoMoneda(TipoMoneda.EURO, 5.80, 5.94);
		cotizacionMonedas = new ArrayList<CotizacionTipoMoneda>();
		cotizacionMonedas.add(cotizacionDolar);
		cotizacionMonedas.add(cotizacionEuro);
	}
		
	/**
	 * Devuelve la cotización de la moneda según el tipo de cambio solicitado (compra o venta)
	 * 
	 * @param tipoMoneda el tipo de moneda
	 * @param compra 'true' si es compra, 'false' si es venta 
	 */
	public double getCotizacionMoneda(TipoMoneda tipoMoneda, boolean compra){
		for(CotizacionTipoMoneda ctm : cotizacionMonedas){
			if(ctm.getTipoMoneda().equals(tipoMoneda)){
				if(compra){
					return ctm.getValorCompra();
				}else{
					return ctm.getValorVenta();
				}
			}
		}

		return 0;
	}
	
	public void comprarMoneda(CuentaCorriente cuentaCorriente, TipoMoneda tipoMoneda, double importe){
		cuentaCorriente.acreditarSaldo(getCotizacionMoneda(tipoMoneda, true) * importe);
	}
	
	public void venderMoneda(CuentaCorriente cuentaCorriente, TipoMoneda tipoMoneda, double importe){
		cuentaCorriente.debitarSaldo(getCotizacionMoneda(tipoMoneda, false) * importe);
	}	
		
}
