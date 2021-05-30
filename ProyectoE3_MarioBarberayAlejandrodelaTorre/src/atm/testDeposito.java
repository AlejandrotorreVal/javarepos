package atm;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testDeposito {
	
	
	/**Test para ver si el deposito se hace correctamente
	 * 
	 */
	@Test
	void test() {
		AppBanco.deposito(500);
		assertEquals(500,AppBanco.getBalance());
	}

}
