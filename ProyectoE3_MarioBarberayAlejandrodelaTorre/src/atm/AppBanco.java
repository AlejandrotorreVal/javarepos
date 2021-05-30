package atm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Alejandro y Mario
 * @version 1.0 30/05/2021
 *
 */

public class AppBanco {
	private static int balance;
	public static int transaccionPrevia;
	public static String nombreUsuario;
	public static String idUsuario;
	public static byte opcion1 = 0;
	public static int acciones;
	public static ArrayList<String> transa = new ArrayList<String>();
	public static int contraseña = 1234;
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Constuctor de appbanco
	 * 
	 * @param nU
	 * @param idU
	 */
	public AppBanco(String nU, String idU) {

		setNombreUsuario(nU);
		idUsuario = idU;
	}

	/**
	 * Deposita la cantidad en la cuenta
	 * 
	 * @param cantidad
	 */

	/**public static void login() {
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
	}**/

	public static void deposito(int cantidad) {

		if (cantidad != 0) {
			setBalance(getBalance() + cantidad);
			transaccionPrevia = cantidad;
			transa.add("Deposito: $" + transaccionPrevia);
			System.out.println(transa);
		}
	}

	/**
	 * Retira la cantidad en la cuenta
	 * 
	 * @param cantidad
	 */
	public static void retirar(int cantidad) {

		if (cantidad != 0) {
			setBalance(getBalance() - cantidad);
			transaccionPrevia = -cantidad;
			transa.add("Retiro: $" + transaccionPrevia);
			System.out.println(transa);
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
	 * @param cantidad
	 */
	public static void comprarAcciones(int cantidad) {
		int ac0 = 700;
		int ac1 = 500;
		int ac2 = 3000;
		int ac3 = 34000;
		if (opcion1 == 1) {
			setBalance(getBalance() - cantidad);
			cantidad = cantidad / ac0;
			acciones = cantidad;
		} else if (opcion1 == 2) {
			setBalance(getBalance() - cantidad);
			cantidad = cantidad / ac1;
			acciones = cantidad;
		} else if (opcion1 == 3) {
			setBalance(getBalance() - cantidad);
			cantidad = cantidad / ac2;
			acciones = cantidad;
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
	 * Nos devuelve el balance
	 * 
	 * @return balance
	 */
	public static int getBalance() {
		return balance;
	}

	/**
	 * Modifica el balance
	 * 
	 * @param balance
	 */
	public static void setBalance(int balance) {
		AppBanco.balance = balance;
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
	 * @param nombreUsuario
	 */
	public static void setNombreUsuario(String nombreUsuario) {
		AppBanco.nombreUsuario = nombreUsuario;
	}

}
