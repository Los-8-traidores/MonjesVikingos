package State;

public class Berserker implements State {

	private Monje monje;
	

	@Override
	public void atacar(Monje monje2) {
		monje2.recibirAtaque(monje);
	}

	@Override
	public void recibirAtaque(Monje monje2) {
		monje.setVida(monje.getVida() - monje2.getDa�o());
	}

	@Override
	public void meditar() {
		monje.setState(new Calmado());
		this.monje.setDa�o(this.monje.getDa�o() / 3);
	}

	@Override
	public void setMonje(Monje monje) {
		this.monje = monje;
		this.monje.setDa�o((monje.getDa�o() / 2) * 3);
	}

	@Override
	public String getEstado() {
		return "Berserker";
	}

}
