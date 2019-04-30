import javax.swing.JOptionPane;

public class Circulo extends Figuras {
	private double raio;

	public Circulo(double raio, String cor) {
		this.setCor(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		return "Circulo"
				+ "\nCor = " + getCor()
				+ "\nRaio = " + getRaio()
				+ "\nArea = " + area();
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
