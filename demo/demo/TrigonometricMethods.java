package demo;

public class TrigonometricMethods {

	public static void main(String[] args) {
		System.out.println("Degree    Sin          Cos" );
		for (int i=0; i<=360; i += 10){
			
			System.out.printf("  %.0f     %.4f       %.4f%n", (float)i,Math.sin((Math.PI / 180) * i),Math.cos((Math.PI / 180) * i));
			//System.out.println("   "+ i + "    " + Math.sin((Math.PI / 180) * i) + "   " + Math.cos((Math.PI / 180) * i));
		}

	}

}
