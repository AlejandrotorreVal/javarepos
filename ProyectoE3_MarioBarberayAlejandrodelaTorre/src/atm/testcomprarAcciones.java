package atm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcomprarAcciones {

	
	/** Test para comprobar si la compra de acciones se hace correctamente
	 * 
	 */
	@Test
	void test() {
		AppBanco.deposito(1000);
		AppBanco.setOpcion1((byte)1);
		AppBanco.comprarAcciones(1000);
		assertEquals(1.4285714285714286,AppBanco.getAcciones());
	}

}
