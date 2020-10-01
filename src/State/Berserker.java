package State;

public class Berserker implements State {

	private Monje monje;
	

	@Override
	public void atacar(Monje monje2) {
		monje2.recibirAtaque(monje);
	}

	@Override
	public void recibirAtaque(Monje monje2) {
		monje.setVida(monje.getVida() - monje2.getDaño());
	}

	@Override
	public void meditar() {
		monje.setState(new Calmado());
		this.monje.setDaño(this.monje.getDaño() / 3);
	}

	@Override
	public void setMonje(Monje monje) {
		this.monje = monje;
		this.monje.setDaño((monje.getDaño() / 2) * 3);
	}

	@Override
	public String getEstado() {
		return "Berserker";
	}

}
