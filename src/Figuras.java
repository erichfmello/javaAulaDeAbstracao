
public abstract class Figuras {
	private String cor;
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	
	public abstract void imprimirDados();
}
