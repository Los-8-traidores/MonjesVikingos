package Condicionales;

public class Monje {
	private int vida;
	private int da�o;
	private String estado;
	private int golpesRecibidos;

	public Monje(int vida) {
		this.vida = vida;
		this.da�o = 10;
		this.golpesRecibidos = 0;
		this.estado = "Normal";
	}

	public int ataca() {

		if (this.estado == "Colerico")
			return this.da�o * 2;

		if (this.estado == "Calmado")
			this.estado = "Normal";

		if (this.estado == "Berserker")
			return this.da�o * 3;

		return this.da�o;
	}

	public void recibieGolpeDe(int da�oSufrido) {

		if (this.estado == "Colerico") {
			this.vida -= da�oSufrido * 2;
		}

		if (this.estado == "Berserker") {
			this.vida -= da�oSufrido * (0.5);
		}
		
		if(this.estado == "Normal")
			this.vida -= da�oSufrido;

		this.golpesRecibidos++;
		
		if (this.golpesRecibidos == 1)
			this.estado = "Colerico";
		if(this.golpesRecibidos>=2)
			this.estado = "Berserker";
	}

	public void meditar() {
		this.golpesRecibidos = 0;
		if (this.estado == "Normal" || this.estado == "Calmado")
			this.estado = "Calmado";
		else
			this.estado = "Normal";
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "[vida=" + vida + ", estado=" + estado + ", golpesRecibidos=" + golpesRecibidos
				+ "]";
	}

}
