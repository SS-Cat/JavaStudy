import javax.swing.JOptionPane;

public class baskhara2 {
	public static void main(String[] args) {


		float a , b, c,
		      delta,
		      sqrtdelta,
		      x1, x2;
		String a1, b1, c1, d;

		JOptionPane.showMessageDialog(null, "Vamos calcular uma equacao do segundo grau");

		a1 = JOptionPane.showInputDialog("Escreva A");
		a = Float.parseFloat(a1.trim());
		b1 = JOptionPane.showInputDialog("Escreva B");
		b = Float.parseFloat(b1.trim());
		c1 = JOptionPane.showInputDialog("Escreva C");
		c = Float.parseFloat(c1.trim());

		d = String.format("Os valores são: \n %.2f; \n %.2f; \n %.2f.", a, b, c);
		JOptionPane.showMessageDialog(null, d);

		if (a != 0) {

			delta = (b * b) - (4 * a * c);
			sqrtdelta = (float)Math.sqrt(delta);

			d = String.format("O valor de delta é: %.2f", delta);
			JOptionPane.showMessageDialog(null, d);

			if (delta > 0) {
				x1 = (-b + sqrtdelta) / (2 * a);
				x2 = (-b - sqrtdelta) / (2 * a);

				d = String.format("O valor da raiz quadrada de delta é: %.2f", sqrtdelta);
				JOptionPane.showMessageDialog(null, d);
				d = String.format("\n Deu os valores %.2f e %.2f", x1, x2);
				JOptionPane.showMessageDialog(null, d);
			} else {
				delta = -delta;
				sqrtdelta = (float)Math.sqrt(delta);
				d = String.format("O valor da raiz quadrada de delta é: %.2f", sqrtdelta);
				JOptionPane.showMessageDialog(null, d);
				d = String.format("\nO valor de x1 é %.2f +i* %.2f", (-b) / (2 * a), (sqrtdelta) / (2 * a));
				JOptionPane.showMessageDialog(null, d);
				d = String.format("\nO valor de x2 é %.2f -i* %.2f", (-b) / (2 * a), (sqrtdelta) / (2 * a));
				JOptionPane.showMessageDialog(null, d);
			}
		}
	}
}
