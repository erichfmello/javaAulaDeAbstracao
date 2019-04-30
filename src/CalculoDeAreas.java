import javax.swing.JOptionPane;
public class CalculoDeAreas {

	public static void main(String[] args) {
		String controlador;
		String cor;
		
		double lado1;
		double lado2;
		double base;
		double altura;
		double raio;
		
		int j = 0;
		
		Figuras[] fig = new Figuras[200];
		
		do {
			
			controlador = JOptionPane.showInputDialog("Escola qual a figura" +
					"\n\n1 - Retangulo" +
					"\n2 - Quadrado" +
					"\n3 - Triangulo" +
					"\n4 - Circulo" +
					"\n\n9 - Sair");
			
			switch (controlador) {
			case "1":
				cor = JOptionPane.showInputDialog("Qual a cor da figura?");
				lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado"));
				lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));
						
				Retangulo ret = new Retangulo(lado1, lado2, cor);
				fig[j] = ret;
				fig[j].imprimirDados();
				break;
				
			case "2":
				cor = JOptionPane.showInputDialog("Qual a cor da figura?");
				lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado"));
				
				Quadrado qua = new Quadrado(lado1, cor);
				
				fig[j] = qua;
				fig[j].imprimirDados();
				break;
				
			case "3":
				cor = JOptionPane.showInputDialog("Qual a cor da figura?");
				base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));
				
				Triangulo tri = new Triangulo(base, altura, cor);
				
				fig[j] = tri;
				fig[j].imprimirDados();
				break;
				
			case "4":
				cor = JOptionPane.showInputDialog("Qual a cor da figura?");
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
				
				Circulo circ = new Circulo(raio, cor);
				
				fig[j] = circ;
				fig[j].imprimirDados();
				break;

			case "9":
				controlador = "9";
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!!");
				break;
			}

			j += 1;
		} while (controlador != "9");
		
		for (int i = 0; i < fig.length; i++) {
			if (fig[i] != null) {
				fig[i].imprimirDados();				
			} else {
				break;
			}
		}
	}
}
