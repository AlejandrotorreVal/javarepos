package atm;

import java.util.Scanner;

public class AppBanco {
	private static int balance;
	public static int transaccionPrevia;
	protected static String nombreUsuario;
	public static String idUsuario;
	public static byte opcion1 = 0;
	public static int acciones;
	protected static AppBanco a1 = new AppBanco("Alfredo","XX0123");


	public AppBanco(String nU, String idU) {

		setNombreUsuario(nU);
		idUsuario = idU;
	}

	public static void deposito(int cantidad) {

		if (cantidad != 0) {
			setBalance(getBalance() + cantidad);
			transaccionPrevia = cantidad;
		}
	}

	public static void retirar(int cantidad) {

		if (cantidad != 0) {
			setBalance(getBalance() - cantidad);
			transaccionPrevia = -cantidad;
		}
	}
	
	
	public static void transferencia(int cantidad) {
		if(cantidad!=0) {
			setBalance(getBalance() - cantidad);
			transaccionPrevia = -cantidad;
			
			((AppBanco) AppBanco.a1).setBalance(((AppBanco) AppBanco.a1).getBalance() + cantidad);
		}
	}

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

	public static void getTransaccionPrevia() {

		if (transaccionPrevia > 0) {
			System.out.println("Depositado: " + transaccionPrevia);
		} else if (transaccionPrevia < 0) {
			System.out.println("Retirado: " + Math.abs(transaccionPrevia));
		} else
			System.out.println("No ha habido ninguna transaccion");
	}

	

	protected static void cAcciones(Scanner sc) {
		System.out.println("1. Tesla -- Precio: 700");
		System.out.println("2. Nvidia -- Precio: 500");
		System.out.println("3. Google -- Precio: 3000");
		System.out.println("4. Bitcoin -- Precio 34000");
		System.out.println("5. Salir");
		do {
			System.out.println(
					"================================================================================");
			System.out.println("Elige una accion para comprar o salir: ");
			System.out.println(
					"================================================================================");
			opcion1 = sc.nextByte();
			System.out.println("\n");
			switch (opcion1) {

			case 0:
				System.out.println("---------------------------------------");
				System.out.println("Ingrese una cantidad dinero para comprar: ");
				int cantidad3 = sc.nextInt();
				if (cantidad3 < getBalance()) {
					comprarAcciones(cantidad3);
					System.out.println("---------------------------------------");
					System.out.println("Acciones compradas de Tesla: " + acciones);
					System.out.println("\n");
				} else
					System.out.println("Usuario: " + getNombreUsuario() + " No tienes dinero en la cuenta"+" Balance: "+getBalance()+"$");
				System.out.println("\n");
				break;
			case 1:
				System.out.println("---------------------------------------");
				System.out.println("Ingrese una cantidad dinero para comprar: ");
				int cantidad4 = sc.nextInt();
				if (cantidad4 < getBalance()) {
					comprarAcciones(cantidad4);
					System.out.println("---------------------------------------");
					System.out.println("Acciones compradas de Nvidia: " + acciones);
					System.out.println("\n");
				} else
					System.out.println("Usuario: " + getNombreUsuario() + " No tienes dinero en la cuenta"+" Balance: "+getBalance()+"$");
				System.out.println("\n");
				break;
			case 2:
				System.out.println("---------------------------------------");
				System.out.println("Ingrese una cantidad dinero para comprar: ");
				int cantidad5 = sc.nextInt();
				if (cantidad5 < getBalance()) {
					comprarAcciones(cantidad5);
					System.out.println("---------------------------------------");
					System.out.println("Acciones compradas de Google: " + acciones);
					System.out.println("\n");
				} else
					System.out.println("Usuario: " + getNombreUsuario() + " No tienes dinero en la cuenta"+" Balance: "+getBalance()+"$");
				System.out.println("\n");
				break;
			case 3:
				System.out.println("---------------------------------------");
				System.out.println("Ingrese una cantidad dinero para comprar: ");
				int cantidad6 = sc.nextInt();
				if (cantidad6 < getBalance()) {
					comprarAcciones(cantidad6);
					System.out.println("---------------------------------------");
					System.out.println("Monedas compradas de Bitcoin: " + acciones);
					System.out.println("\n");
				} else {
					System.out.println("Usuario: " + getNombreUsuario() + " No tienes dinero en la cuenta"+" Balance: "+getBalance()+"$");
				System.out.println("\n");
				}
			default:
				if(opcion1!=5)
				System.out.println("Opcion invalida, por favor intentalo de nuevo");
			}

		} while (opcion1 != 5);
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		AppBanco.balance = balance;
	}

	public static String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public String getNombreUsuario1() {
		return nombreUsuario;
	}

	public static void setNombreUsuario(String nombreUsuario) {
		AppBanco.nombreUsuario = nombreUsuario;
	}

}
