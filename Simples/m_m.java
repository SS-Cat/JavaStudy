import java.util.Scanner;
import java.util.Random;

public class m_m {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long l = System.currentTimeMillis();
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0 ;
		for( int i = 0; i < 1000000 ; i++){
			switch(dado()){
				case 1:
				n1++;
				break;
				case 2:
				n2++;
				break;
				case 3:
				n3++;
				break;
				case 4:
				n4++;
				break;
				case 5:
				n5++;
				break;
				case 6:
				n6++;
				break;
			}
			
		}System.out.println(n1+"-"+n2+"-"+n3+"-"+n4+"-"+n5+"-"+n6);
		System.out.println(System.currentTimeMillis() - l);
	}

	public static float maior2(float v1, float v2) {
		if (v1 > v2)
			return v1;
		else
			return v2;
	}

	public static float menor2(float v1, float v2) {
		if (v1 < v2)
			return v1;
		else
			return v2;
	}

	public static float maior3(float v1, float v2, float v3) {
		float n1, n2;
		n1 = Math.max(v1, v2);
		n2 = Math.max(v2, v3);
		if (n1 > n2)
			return n1;
		else
			return n2;

	}

	public static float menor3(float v1, float v2, float v3) {
		float n1, n2;
		n1 = Math.min(v1, v2);
		n2 = Math.min(v2, v3);
		if (n1 < n2)
			return n1;
		else
			return n2;

	}

	public static int dado() {
		int n2;
		Random n1 = new Random();
		n2 = n1.nextInt(6) +1;
		return n2;

	}


}