import javax.swing.JOptionPane;

public class Quadrado extends Retangulo {
	public Quadrado(double lado1, String cor) {
		super(lado1, lado1, cor);
	}

	@Override
	public String toString() {
		return "Quadrado" 
				+ "\nCor = " + getCor() 
				+ "\nLado = " + getLado1() 
				+ "\nArea = " + area();
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null, toString());
	}	
}
