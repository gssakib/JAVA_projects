package demo;

class summations{
	void s_method(){
		System.out.print("1 + 2 + 2 + 4 + 5 + 6 + 7 + 8 + 9: ");
		System.out.println(1 + 2 + 2 + 4 + 5 + 6 + 7 + 8 + 9);
	}
}

public class computations {

	public static void main(String[] args) {
		System.out.print("(9.5 x 4.5 - 2.5 x 3) / (45.5 - 3.5):   ");
		System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
		
		summations sum = new summations();
		sum.s_method();
		// TODO Auto-generated method stub

	}

}
