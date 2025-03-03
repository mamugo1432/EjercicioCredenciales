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
	}
	
	@Test
	public void esPassSeguraTest() {
		assertFalse(credencial.esPasswordSegura());
		credencial.setPassword("12345678m");
		assertTrue(credencial.comprobarPassword("12345678m"));
	}
	
	
	
	
}
