import java.util.Scanner;

public class Equacao{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a, b, c, delta;

		System.out.println("Enter 3 Numbers");
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();

		while(isZero(a)){
			System.out.println("Enter 'a' again");
			a = input.nextInt();
		}

		delta = delta(a, b, c);

		if(isPositive(delta)){
			System.out.printf("O x1 vale %.2f e o x2 vale %.2f\n", (-b +Math.sqrt(delta))/(2*a), (-b -Math.sqrt(delta))/(2*a) );
		}else{
			delta = Math.abs(delta);
			System.out.printf("O x1 vale %.2f + i*%.2f\n", -b/(2*a), Math.sqrt(delta)/(2*a) );
			System.out.printf("O x1 vale %.2f - i*%.2f\n", -b/(2*a), Math.sqrt(delta)/(2*a) );
		}

	}

	public static boolean isPositive(float num){
		if(num >0)
			return true;
		else
			return false;
	}

	public static boolean isZero(float num){
		if(num == 0)
			return true;
		else
			return false;
	}

	public static float delta (float a, float b, float c){
		float delta;
		delta = (b*b) - 4*a*c;
		return delta;
	}
}