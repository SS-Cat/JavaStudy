import java.util.Scanner;

public class prov1 {
	public static float media(float... v1) {
		int n1 = 0;
		for (float valor : v1) {
			n1 += valor;
		}

		return n1 / v1.length;
	}

	public static float m_m( float v1, float v2, float v3) {
		if ((v1 > v2) && (v1 > v3)) {
			return v1;
		} else {
			if (v2 > v3) {
				return v2;
			} else {
				return v3;
			}
		}
	}
	public static float m_n( float v1, float v2, float v3) {
		if ((v1 < v2) && (v1 < v3)) {
			return v1;
		} else {
			if (v2 < v3) {
				return v2;
			} else {
				return v3;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float v1, v2, v3;

		v1 = input.nextFloat();
		v2 = input.nextFloat();
		v3 = input.nextFloat();

		System.out.println(m_m(v1, v2, v3));
		System.out.println(m_n(v1, v2, v3));

		System.out.println(media(v1, v2, v3));

	}
}