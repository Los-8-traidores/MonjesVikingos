package State;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonjeTest {

	@Test
	void recibeUnAtaque() {
		Monje ragnar = new Monje(100);
		Monje loki = new Monje(100);
		
		assertEquals(100,loki.getVida());
		assertEquals("Normal",loki.getEstado());
		assertEquals(10,loki.getDaño());
		
		ragnar.atacar(loki);
		
		assertEquals(90,loki.getVida());
		assertEquals("Colerico",loki.getEstado());
		assertEquals(20,loki.getDaño());
	}
	
	@Test
	void recibeDosAtaques() {
		Monje ragnar = new Monje(100);
		Monje loki = new Monje(100);
		
		assertEquals(100,loki.getVida());
		assertEquals("Normal",loki.getEstado());
		assertEquals(10,loki.getDaño());
		
		ragnar.atacar(loki);
		ragnar.atacar(loki);
		
		assertEquals(80,loki.getVida());
		assertEquals("Berserker",loki.getEstado());
		assertEquals(30,loki.getDaño());
	}

	@Test
	void medita() {
		Monje ragnar = new Monje(100);
		Monje loki = new Monje(100);
		
		assertEquals(100,loki.getVida());
		assertEquals("Normal",loki.getEstado());
		assertEquals(10,loki.getDaño());
		
		ragnar.atacar(loki);
		ragnar.atacar(loki);
		
		assertEquals(80,loki.getVida());
		assertEquals("Berserker",loki.getEstado());
		assertEquals(30,loki.getDaño());
		
		loki.meditar();
		
		assertEquals("Calmado", loki.getEstado());
	
	}
	
}
