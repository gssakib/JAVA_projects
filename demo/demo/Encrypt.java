package demo;

public class Encrypt {

	public static void main(String[] args) {
		System.out.println(encrypt("sampletext"));
		reverse("The quick brown fox jumps over the lazy dog.");
	}
	public static String encrypt(String x){
		String arry= "";
		for(int i =0; i< x.length(); i++){
			if(x.charAt(i) == 'y'){
				arry = arry + Character.toString('a');
			}else if(x.charAt(i) == 'z'){
				arry = arry + Character.toString('b');
			}else{
				arry = arry + Character.toString((char)(x.charAt(i)+ 2));
			}
		}
		return arry;
	}
 public static void reverse(String x){
	 char[] arry = new char[x.length()];
	 for(int i = 0; i < arry.length; i++){
		 arry[i] = x.charAt(x.length()-1 - i);
	 }
	 for(int j =0; j < arry.length; j++){
		 
		 System.out.print(arry[j]);
		 
	 }
	 
 }
}
