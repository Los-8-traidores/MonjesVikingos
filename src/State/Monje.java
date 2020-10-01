package State;

public class Monje {
	private int vida;
	private int da�o;
	private State estado;

	public Monje(int vida) {
		this.vida = vida;
		this.da�o = 10;
		this.setState(new Normal());
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDa�o() {
		return da�o;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}

	public String getEstado() {
		 return this.estado.getEstado();
	}

	public void setState(State estado) {
		this.estado = estado;
		this.estado.setMonje(this);
	}
	
	public void atacar(Monje monje2) {
		this.estado.atacar(monje2);
	}
	
	public void recibirAtaque(Monje monje2) {
		this.estado.recibirAtaque(monje2);
	}
	
	public void meditar() {
		this.estado.meditar();
	}
	
}
