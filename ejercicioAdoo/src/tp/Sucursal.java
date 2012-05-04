package tp;
import java.util.ArrayList;

public class Sucursal {
	
	private int nroSucursal;
	private ArrayList<CuentaCorriente> cuentasCorrientes;
	
	public Sucursal(int nroSucursal, ArrayList<CuentaCorriente> cuentasCorrientes) {
		this.nroSucursal = nroSucursal;
		this.cuentasCorrientes = cuentasCorrientes;
	}

	public int getNroSucursal() {
		return nroSucursal;
	}

	public void setNroSucursal(int nroSucursal) {
		this.nroSucursal = nroSucursal;
	}

	public ArrayList<CuentaCorriente> getCuentasCorrientes() {
		return cuentasCorrientes;
	}

	public void setCuentasCorrientes(ArrayList<CuentaCorriente> cuentasCorrientes) {
		this.cuentasCorrientes = cuentasCorrientes;
	}
	
	public void altaCuentaCorriente(CuentaCorriente cuentaCorriente){
		this.cuentasCorrientes.add(cuentaCorriente);
	}
	
	public void transaccion(CuentaCorriente cuentaCorriente, double importe, boolean credito){
		for(CuentaCorriente c : cuentasCorrientes){
			if(c.getNroCuenta() == cuentaCorriente.getNroCuenta()){
				if(credito){
					cuentaCorriente.acreditarSaldo(importe);
				}else{
					cuentaCorriente.debitarSaldo(importe);
				}
			}
		}
	}
		
}
