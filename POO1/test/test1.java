public class test1{
	
	public static void main(String[] args) {
		test3 t3 = new test3(3);
		test2 t2 = new test2(t3);


		System.out.println(t2.testantoInterface());
		System.out.println(t2.getClass());
		System.out.println(t2.toString());
		System.out.println(t2.hashCode());
		System.out.println(System.in);
	}
}