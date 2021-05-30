package atm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Alejandro y Mario
 * @version 3.0 30/05/2021
 *
 */

public class AppBanco {
	protected static double balance;
	public static int transaccionPrevia;
	public static String nombreUsuario;
	public static String idUsuario;
	public static byte opcion1 = 0;
	public static double acciones;
	public static ArrayList<String> transa = new ArrayList<String>();
	public static int contraseña = 1234;
	public static Scanner sc = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("0.00000");

	/**
	 * Constuctor de appbanco
	 * 
	 * @param nU String
	 * @param idU String
	 */
	public AppBanco(String nU, String idU) {

		setNombreUsuario(nU);
		idUsuario = idU;
	}

	/**
	 * Permite al usuario acceder a su cuenta
	 * 
	 * 
	 */

	public static void login() {
		int scan;
		do {
			scan = sc.nextInt();
			if (contraseña == scan) {
				System.out.println();
				Menu.menus();
			} else if (contraseña != scan) {
				System.out.println("Contraseña incorrecta\n");
			}

		} while (contraseña != scan);
	}

	/** Deposita la cantidad en la cuenta
	 * @param cantidad int
	 */
	public static void deposito(int cantidad) {

		if (cantidad != 0) {
			setBalance(getBalance() + cantidad);
			transaccionPrevia = cantidad;
			transa.add("Deposito: $" + transaccionPrevia);
		
		}
	}

	/**
	 * Retira la cantidad en la cuenta
	 * 
	 * @param cantidad int
	 */
	public static void retirar(int cantidad) {

		if (cantidad != 0) {
			setBalance(getBalance() - cantidad);
			transaccionPrevia = -cantidad;
			transa.add("Retiro: $" + transaccionPrevia);
			
		}
	}

	public static void transferencia(int cantidad) {
		if (cantidad != 0) {
			setBalance(getBalance() - cantidad);
			transaccionPrevia = -cantidad;
			transa.add("Transferencia: $" + transaccionPrevia);

		}
	}

	/**
	 * Compra acciones
	 * 
	 * @param cantidad double
	 */
	public static void comprarAcciones(double cantidad) {
		 double ac0 = 700;
		 double ac1 = 500;
		 double ac2 = 3000;
		 double ac3 = 34000;
		if (opcion1 == 1) {
			setBalance(getBalance() - cantidad);
			cantidad =  cantidad / ac0;
			acciones = cantidad;
		} else if (opcion1 == 2) {
			setBalance(getBalance() - cantidad);
			cantidad = cantidad / ac1;
			acciones = cantidad;
		} else if (opcion1 == 3) {
			setBalance(getBalance() - cantidad);
			cantidad = cantidad / ac2;
			acciones = (double)cantidad;
		} else if (opcion1 == 4) {
			setBalance(getBalance() - cantidad);
			cantidad = cantidad / ac3;
			acciones = cantidad;
		}

	}

	public static void getTransacciones() {
		System.out.println(transa);
	}

	/**
	 * Te enseña la transaccion previa
	 * 
	 */
	public static void getTransaccionPrevia() {

		if (transaccionPrevia > 0) {
			System.out.println("Depositado: " + transaccionPrevia);
		} else if (transaccionPrevia < 0) {
			System.out.println("Retirado: " + Math.abs(transaccionPrevia));
		} else
			System.out.println("No ha habido ninguna transaccion");
	}

	/**
	 * Nos devuelve el valor del balance
	 * 
	 * @return balance
	 */
	public static int getBalance() {
		return (int) balance;
	}

	/**
	 * Modifica el valor del balance
	 * 
	 * @param d double
	 */
	public static void setBalance(double d) {
		AppBanco.balance = d;
	}

	/**
	 * Nos devuelve el nombre de usuario
	 * 
	 * @return nombreUsuario
	 */
	public static String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Modifica el nombre de usuario
	 * 
	 * @param nombreUsuario String
	 */
	public static void setNombreUsuario(String nombreUsuario) {
		AppBanco.nombreUsuario = nombreUsuario;
	}
	
	/** Devuelve el valor de acciones
	 * @return acciones 
	 */
	public static double getAcciones() {
		return acciones;
	}

	/** Modifica el valor de acciones
	 * @param acciones double 
	 */
	public static void setAcciones(double acciones) {
		AppBanco.acciones = acciones;
	}
	
	/** Devuelve el valor de opcion1
	 * @return opcion1 byte
	 */
	public static byte getOpcion1() {
		return opcion1;
	}

	/** Modifica el valor de opcion1
	 * @param opcion1 byte
	 */
	public static void setOpcion1(byte opcion1) {
		AppBanco.opcion1 = opcion1;
	}

}
