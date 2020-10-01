package State;

public class Colerico implements State {

	private Monje monje;

	@Override
	public void atacar(Monje monje2) {
		monje2.setVida(monje2.getVida() - monje.getDa�o());
		monje2.recibirAtaque(monje);
	}


	@Override
	public void recibirAtaque(Monje monje2) {
		monje.setState(new Berserker());
	}

	@Override
	public void meditar() {
		monje.setState(new Calmado());	
		this.monje.setDa�o(this.monje.getDa�o() / 2);
	}

	@Override
	public void setMonje(Monje monje) {
		this.monje = monje;
		this.monje.setDa�o(monje.getDa�o() * 2);
	}


	@Override
	public String getEstado() {
		return "Colerico";
	}
}
