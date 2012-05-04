package tp;
import java.util.ArrayList;


public class Test {
	
	public static void main(String args[]){
		
		/****************************************Test Para Casa de Cambio*******************************************/
	
		CuentaCorriente cuentaCorrientePesos = new CuentaCorriente(1, TipoMoneda.PESO, 1000);
		
		System.out.println("Saldo de la cuenta corriente en pesos antes de comprar d�lares: " + cuentaCorrientePesos.getSaldo());
		
		CasaDeCambio casaDeCambio = new CasaDeCambio(200, new Domicilio("Cordoba", "Calle A", "S/N", "CBA1015"), new Certificado("Correlato A"));
		/* el propietario de la cuenta compra 100 d�lares a la casa de cambio.
		   Dado que la casa de cambio est� vendiendo d�lares, utiliza la cotizaci�n de venta de d�lares ($ 4.44).
		   Al propietario se le debitan de su cuenta $ 444 (100 * 4.44), quedando un total de $ 556 (1000 - 444).	
		 */
		casaDeCambio.venderMoneda(cuentaCorrientePesos, TipoMoneda.DOLAR, 100);
		
		System.out.println("Saldo luego de comprar 100 d�lares a la casa de cambio (cotizaci�n venta dolar $ 4.44): " + cuentaCorrientePesos.getSaldo());
		
		/* el propietario decide vender 50 d�lares a la casa de cambio.
		   Dado que la casa de cambio est� comprando d�lares, utiliza la cotizaci�n de compra ($ 4.40).
		   Al propietario se le acreditan en su cuenta $220 (50 * 4.40), quedando un total de $ 776 (556 + 220).
		 */
		casaDeCambio.comprarMoneda(cuentaCorrientePesos, TipoMoneda.DOLAR, 50);
		System.out.println("Saldo luego de venderle 50 d�lares a la casa de cambio (cotizaci�n venta dolar $ 4.40): " + cuentaCorrientePesos.getSaldo());
		System.out.println("---------------------------------------------------------------------------------------------");
		
		/****************************************Test Para Banco*******************************************/
		
		// creo el domicilio y el certificado
		Domicilio domicilio = new Domicilio("Mendoza", "Calle B", "1230", "MZA1015");
		Certificado certificado = new Certificado("Correlato B");
		
		// creo cuentas corrientes de moneda extranjera y se las asocio a la casa central (es una sucursal)
		ArrayList<CuentaCorriente> cuentasCorrientesCasaCentral = new ArrayList<CuentaCorriente>();
		cuentasCorrientesCasaCentral.add(new CuentaCorriente(2, TipoMoneda.DOLAR, 100));
		cuentasCorrientesCasaCentral.add(new CuentaCorriente(3, TipoMoneda.EURO, 10));
		Sucursal casaCentral = new Sucursal(300, cuentasCorrientesCasaCentral);
		
		// creo cuentas corrientes de moneda extranjera y se las asocio a otra sucursal
		ArrayList<CuentaCorriente> cuentasCorrientesSucursalA = new ArrayList<CuentaCorriente>();
		CuentaCorriente cuentaCorrienteDolaresSucursalA = new CuentaCorriente(4, TipoMoneda.DOLAR, 110);
		cuentasCorrientesSucursalA.add(cuentaCorrienteDolaresSucursalA);
		cuentasCorrientesSucursalA.add(new CuentaCorriente(5, TipoMoneda.EURO, 11));
		Sucursal sucursalA = new Sucursal(301, cuentasCorrientesSucursalA);
		ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
		
		// agrego las sucursales creadas a una lista de sucursales (incluyendo la casa central, que es una sucursal)
		sucursales.add(casaCentral);
		sucursales.add(sucursalA);
		
		// creo el banco
		Banco banco = new Banco(201, domicilio, certificado, casaCentral, sucursales);
		
		System.out.println("Saldo de la cuenta corriente en d�lares de la sucursal A del banco: " + cuentaCorrienteDolaresSucursalA.getSaldo());
		
		/* el propietario realiza un dep�sito de 500 d�lares en la cuenta de d�lares de la sucursal A,
		   por lo cual el banco deber� realizar la correspondiente transacci�n para acreditarle ese valor.
		   El saldo total de la cuenta en d�lares ser� de 610 (110 + 500).
	     */
		banco.transaccion(sucursalA.getNroSucursal(), cuentaCorrienteDolaresSucursalA, 500, true);
		System.out.println("Luego de realizar un dep�sito de 500 d�lares: " + cuentaCorrienteDolaresSucursalA.getSaldo());
						
	}
	
}
