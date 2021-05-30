package atm;

import java.util.Scanner;

public class Menu extends AppBanco{
	
	
	public Menu(String nU, String idU) {
		super(nU, idU);
		
	}
	
/**	public static void menuLogin() {
		System.out.println("Señor "+getNombreUsuario()+", escribe tu contraseña: ");
		login();
	}**/

	public static void menus() {

		char opcion = '\0';

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a CaixaBank " + getNombreUsuario());
		System.out.println("Tu id es: " + idUsuario);
		System.out.println("\n");
		System.out.println("A. Mirar el balance");
		System.out.println("B. Depositar");
		System.out.println("C. Retirar");
		System.out.println("D. Transaccion previa");
		System.out.println("E. Comprar acciones");
		System.out.println("F. Transferencia");
		System.out.println("G. Transferencia");
		System.out.println("H. Salir");

		do {
			System.out.println("================================================================================");
			System.out.println("Elige una opcion: ");
			System.out.println("================================================================================");
			opcion = sc.next().charAt(0);
			System.out.println("\n");

			switch (opcion) {

			case 'A':
				System.out.println("---------------------------------------");
				System.out.println("Balance: " + getBalance()+"$");
				System.out.println("---------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("---------------------------------------");
				System.out.println("Escribe una cantidad para depositar: ");
				System.out.println("---------------------------------------");
				int cantidad = sc.nextInt();
				if(cantidad>0) {
				deposito(cantidad);
				System.out.println("Se han depositado: "+cantidad+"$");
				System.out.println("\n");
				}else {
					System.out.println();
					System.out.println("Por favor introduzca una cantidad mayor a 10$");
				}
				break;

			case 'C':
				System.out.println("---------------------------------------");
				System.out.println("Escribe una cantidad para retirar: ");
				System.out.println("---------------------------------------");
				int cantidad2 = sc.nextInt();
				if(getBalance()>=cantidad2) {
				retirar(cantidad2);
				System.out.println();
				System.out.println("Se han retirado: "+cantidad2+"$");
				System.out.println("\n");
				}else
					System.out.println("No tienes suficiente dinero en la cuenta"+" Balance: "+getBalance()+"$");
				
				break;

			case 'D':
				System.out.println("---------------------------------------");
				getTransaccionPrevia();
				System.out.println("---------------------------------------");
				System.out.println("\n");
				break;
			case 'E':
				cAcciones(sc);
				break;
			case 'F':
				cBancariaTransferencia(sc);
				break;
			case 'G':
				System.out.println("---------------------------------------");
				getTransacciones();
				System.out.println("---------------------------------------");
				System.out.println("\n");
				break;
				
			default:
				if(opcion!='H')
				System.out.println("Opcion invalida, por favor intentalo de nuevo");
			}
			
		} while (opcion != 'H');
		System.out.println("Gracias por utilizar nuestros servicios");

	}
	
	private static void cAcciones(Scanner sc) {
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

	private static void cBancariaTransferencia(Scanner sc) {
		System.out.println("---------------------------------------");
		System.out.println("Escribe la cuenta bancaria del destinatario: ");
		System.out.println("---------------------------------------");
		String cBanca = sc.next();
		if(cBanca.charAt(0)=='C' && cBanca.charAt(1)=='B') {
		System.out.println("---------------------------------------");
		System.out.println("Escribe una cantidad para transferir: ");
		System.out.println("---------------------------------------");
		int cantidad3 = sc.nextInt();
		if(cantidad3<getBalance()) {
		retirar(cantidad3);
		transferencia(cantidad3);
		System.out.println();
		System.out.println("Se han retirado: "+cantidad3+"$");
		System.out.println();
		
		
		System.out.println("Se han transferido: "+cantidad3+"$"+" a la cuenta "+cBanca);
		System.out.println("\n");
		}else
			System.out.println("No tienes suficiente dinero en la cuenta"+" Balance: "+getBalance()+"$");
		
		}else
			System.out.println("Escribe bien la cuenta destinatario");
	}

}
