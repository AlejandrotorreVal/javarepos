package atm;

import java.util.Scanner;

public class Menu extends AppBanco{
	
	
	public Menu(String nU, String idU) {
		super(nU, idU);
		
	}

	public static void Menus() {

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
		System.out.println("G. Salir");

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
				
				
				System.out.println("Se han transferido: "+cantidad3+"$"+" a "+ AppBanco.a1.getNombreUsuario1());
				System.out.println("\n");
				}else
					System.out.println("No tienes suficiente dinero en la cuenta"+" Balance: "+getBalance()+"$");
				break;
				
			default:
				if(opcion!='G')
				System.out.println("Opcion invalida, por favor intentalo de nuevo");
			}
			
		} while (opcion != 'G');
		System.out.println("Gracias por utilizar nuestros servicios");

	}

}
