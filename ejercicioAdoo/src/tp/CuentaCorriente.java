package tp;

public class CuentaCorriente {
	
	long nroCuenta;
	TipoMoneda tipoMoneda;
	double saldo;
	
	public CuentaCorriente(long nroCuenta, TipoMoneda tipoMoneda, double saldo) {
		this.nroCuenta = nroCuenta;
		this.tipoMoneda = tipoMoneda;
		this.saldo = saldo;
	}

	public long getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(long nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public TipoMoneda getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(TipoMoneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void acreditarSaldo(double importe) {
		this.saldo += importe;
	}
	
	public void debitarSaldo(double importe) {
		this.saldo -= importe;
	}
		
}
