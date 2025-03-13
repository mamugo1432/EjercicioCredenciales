package com.auth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ejercicioCredenciales.Credencial;



class EjercicioCredencialesCredencialesTests {

	private static Credencial credencial;
	
	@BeforeAll
	public static void crearCredenciales() {
		credencial = new Credencial("Antonio", "Sanchez", "1234");
	}
	
	@Test
	public void comprobarPassword() {
		assertTrue(credencial.comprobarPassword("1234"));
		assertFalse(credencial.comprobarPassword(null));
		assertFalse(credencial.comprobarPassword(" 1234"));
		assertFalse(credencial.comprobarPassword("1234 "));
		assertFalse(credencial.comprobarPassword(" 1 2 3 4"));
		assertFalse(credencial.comprobarPassword("4568"));
	}
	
	@Test
	public void esPassSeguraTest() {
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword("12345678m");
		assertTrue(credencial.esPasswordSegura());
		credencial.setPassword("12345678M");
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword("12345678");
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword(null);
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword("KSGDKLAVLM");
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword("123M");
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword("12345678m");
	}
	
	@Test
	public void getUsernameTest() {
		assertEquals("AntSan100",credencial.getUsername());
		assertNotEquals("AnSa101",credencial.getUsername());
		assertNotEquals(null,credencial.getUsername());
		assertEquals("AntSan100"+"",credencial.getUsername());
		assertNotEquals("AntSan100"+" ",credencial.getUsername());
		assertNotEquals("AntSan100"+"\n",credencial.getUsername());
	}
	
	@Test
	public void testToString() {
		assertEquals("Credencial [username=AntSan100, password=****]", credencial.toString());
		assertNotEquals("Credencial [username=AntSan101, password=****]", credencial.toString());
		assertNotEquals("Credencial [username=AntSan100, password=*****]", credencial.toString());
	}
}
