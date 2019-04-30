import javax.swing.JOptionPane;

public class Triangulo extends Figuras {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura, String cor) {
		this.setCor(cor);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return base * altura / 2;
	}

	@Override
	public String toString() {
		return "Triangulo"
				+ "\nCor" + getCor()
				+ "\nBase = " + getBase()
				+ "\nAltura = " + getAltura()
				+ "\nArea = " + area();
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}
}
