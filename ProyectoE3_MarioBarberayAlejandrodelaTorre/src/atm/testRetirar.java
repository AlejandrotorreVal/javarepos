package atm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testRetirar {

	/**Test para ver si el retiro de dinero se hace correctamente
	 * 
	 */
	@Test
	void test() {
		AppBanco.deposito(500);
		AppBanco.retirar(400);
		assertEquals(100,AppBanco.getBalance());
	}

}
