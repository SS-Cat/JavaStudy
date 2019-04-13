import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conversao {
	public static void main(String[] args) {

		float t;
		int v1;
		String op, op2;

		//JOptionPane.showMessageDialog(null,"Sua temperatura é Farenheit ou Celsius?\n Digite '1' para Farenheit e '2' para Celsius");
		op = JOptionPane.showInputDialog("Sua temperatura é Farenheit ou Celsius?\n Digite '1' para Farenheit e '2' para Celsius");
		v1 = Integer.parseInt(op);

		switch (v1) {
		case 1:
			op = JOptionPane.showInputDialog("Digite a temperatura");
			t = Float.parseFloat(op.trim());
			op2 = op.format(" %.2f Farenheit são %.2f Celcius.", t, FarenheitForCelsius(t));
			JOptionPane.showMessageDialog(null,op2);
			break;
		case 2:
			op = JOptionPane.showInputDialog("Digite a temperatura");
			t = Float.parseFloat(op.trim());
			op2 = op.format(" %.2f Celcius são %.2f Farenheit.", t, CelsiusForFarenheit(t));
			JOptionPane.showMessageDialog(null,op2);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}


	}

	public static float CelsiusForFarenheit(float t) {
		float c = 5 * (t - 32) / 9;
		return c;
	}

	public static float FarenheitForCelsius(float t) {
		float f = (9 * t / 5) + 32;
		return f;
	}
}