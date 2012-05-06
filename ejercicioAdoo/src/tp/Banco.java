//Agrego un comentario para leo que lo mira por t.v
//ahora comprendo je!
//5765
//abcd
// actualice primero desde aca
package tp;
import java.util.ArrayList;

public class Banco extends EntidadFinanciera {
	
	private Sucursal casaCentral;
	private ArrayList<Sucursal> sucursales;
	
	public Banco(long codigoUnico, Domicilio domicilio, Certificado certificado, Sucursal casaCentral, ArrayList<Sucursal> sucursales) {
		super(codigoUnico, domicilio, certificado);
		this.casaCentral = casaCentral;
		this.sucursales = sucursales;		
	}

	public Sucursal getCasaCentral() {
		return casaCentral;
	}

	public void setCasaCentral(Sucursal casaCentral) {
		this.casaCentral = casaCentral;
	}

	public ArrayList<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(ArrayList<Sucursal> sucursales) {
		this.sucursales = sucursales;
	} 
	
	public void transaccion(int nroSucursal, CuentaCorriente cuentaCorriente, double importe, boolean credito){
		for(Sucursal s : sucursales){
			if(s.getNroSucursal() == nroSucursal){
				s.transaccion(cuentaCorriente, importe, credito);
			}
		}
	}
		
}
