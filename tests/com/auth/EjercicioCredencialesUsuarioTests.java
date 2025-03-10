package com.auth;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ejercicioCredenciales.Usuario;

class EjercicioCredencialesUsuarioTests {

	private static Usuario usuario1;
	private static Usuario usuario2;
	private static Usuario usuario3;
	
	@BeforeAll
	public static void crearUsuarios() {
		usuario1= new Usuario("Joaquín","Sánchez","9uyhasv");
		usuario2= new Usuario("Kilian","Mbappe","injsfadn@hotmail.fr", "kuhsfd");
		usuario3= new Usuario("Pedro","Dominguez","9uyhasvV");
	}
	
	@Test
	void testEsCuentaBloqueada() {
		assertFalse(usuario1.esCuentaBloqueada());
		usuario1.hacerLogin("asdgf", "ags");
		usuario1.hacerLogin("asdgf", "ags");
		usuario1.hacerLogin("asdgf", "ags");
		assertTrue(usuario1.esCuentaBloqueada());
		usuario2.hacerLogin("KiMb101", "kuhsfd");
	}

	@Test
	void testEsPasswordModificable() {
		assertFalse(usuario1.modificarPassword("9uyhasv", "adios", "hola"));
		assertTrue(usuario2.modificarPassword("kuhsfd", "adios", "hola"));
		assertFalse(usuario2.modificarPassword("hola", "hola", "adios"));
		assertFalse(usuario2.modificarPassword("hola", "adios", "adios"));
		assertFalse(usuario2.modificarPassword("adios", "adios", "adios"));
	}

	@Test
	void testPasswordSegura() {
		assertTrue(usuario3.esPasswordSegura());
		assertFalse(usuario2.esPasswordSegura());
		assertFalse(usuario1.esPasswordSegura());
	} 
	
	@Test
	void testToStringCuentaBloqueada() {
		usuario3.hacerLogin("asdgf", "ags");
		usuario3.hacerLogin("asdgf", "ags");
		usuario3.hacerLogin("asdgf", "ags");
		assertEquals("CUENTA BLOQUEADA", usuario3.toString());
		assertNotEquals("CUENTA BLOQUEADA", usuario2.toString());
	}

}
