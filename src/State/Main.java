package State;

public class Main {
	
	public static void main(String[] args) {
		Monje ragnar = new Monje(100);
		Monje loki = new Monje(100);
		
		System.err.println(loki.getEstado());
		ragnar.atacar(loki);
		System.out.println("Loki");
		System.err.println("Vida: " + loki.getVida());
		System.err.println("Daño: " + loki.getDaño());
		System.err.println(loki.getEstado());
		
		
		
//		loki.atacar(ragnar);
//		System.out.println("Ragnar");
//		System.err.println("Vida: " + ragnar.getVida());
//		System.err.println("Daño: " + ragnar.getDaño());
//		System.err.println(ragnar.getEstado());
//		
//		
//		loki.atacar(ragnar);
//		System.out.println("Ragnar");
//		System.err.println("Vida: " + ragnar.getVida());
//		System.err.println("Daño: " + ragnar.getDaño());
//		System.err.println(ragnar.getEstado());
//		
//		ragnar.atacar(loki);
//		System.out.println("Loki");
//		System.err.println("Vida: " + loki.getVida());
//		System.err.println("Daño: " + loki.getDaño());
//		System.err.println(loki.getEstado());
//
//		ragnar.atacar(loki);
//		System.out.println("Loki");
//		System.err.println("Vida: " + loki.getVida());
//		System.err.println("Daño: " + loki.getDaño());
//		System.err.println(loki.getEstado());
//		
//		loki.meditar();
//		System.out.println("Loki");
//		System.err.println("Vida: " + loki.getVida());
//		System.err.println("Daño: " + loki.getDaño());
//		System.err.println(loki.getEstado());
	}
}
