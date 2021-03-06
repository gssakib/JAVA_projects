package demo;
import java.util.ArrayList;

public class MyString1 {
	private char[] chars;
	public MyString1(char[] chars){
		this.chars=chars;
	}
	public char charAt(int index){
		return chars[index];
	}
	public int length(){
		return chars.length;
	}
	//  begin is inclusive, end is not
	public MyString1 substring(int begin, int end){
		char[] newChars= new char[end-begin];
		for(int i=begin,j=0;i<end;i++,j++){
			newChars[j]= chars[i];
		}
		return new MyString1(newChars);
	}
	public MyString1 toLowerCase(){
		for(int i=0;i<chars.length;i++){
			if(chars[i]-'A'>0 && 'Z'-chars[i]>0){
				chars[i]+=32;
			}
		}
		return this;
	}
	public boolean equals(MyString1 s){
		if(this.length()!=s.length())
			return false;
		for(int i=0;i<chars.length;i++){
			if(chars[i]!=s.charAt(i))
				return false;
		}
		return true;
	}
	public MyString1 valueOf(int i){
		char[] newChars={chars[i]};
		return new MyString1(newChars);
	}
	public MyString1[] split(String s){
		ArrayList<MyString1> ssr=new ArrayList<MyString1>();
		MyString1 s2=new MyString1(s.toCharArray());
		int length=s.length(), index=0;
		for(int i=0;i<chars.length-length;i++){
			if(this.substring(i, i+length).equals(s2)){
				ssr.add(this.substring(index, i));
				index=i+length;
			}
		}
		MyString1[] ssr2=new MyString1[ssr.size()];
		int i=0;
		for(MyString1 sr:ssr){
			ssr2[i++]=sr;
		}
		return ssr2;
	}
	public static void main(String[] args){
		MyString1 test = new MyString1("abcddabcfd".toCharArray());
		MyString1[] chicken = test.split("abc");
		
		for(MyString1 c : chicken){
			for(int i =0; i<c.length(); i++){
				System.out.print(c.charAt(i));
			}
			System.out.println();
		}
	}
}