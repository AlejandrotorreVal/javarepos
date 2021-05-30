package atm;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testNombre {
	
	
	

	/**Test para ver que el nombre el nombre se modifica correctamente
	 * 
	 */
	@Test
	void test() { 
		AppBanco.setNombreUsuario("Francisco");
		assertEquals("Francisco",AppBanco.getNombreUsuario());
		
	}

	

}
