package demo;
import javax.swing.*;
public class Welcome {

	public static void main(String[] args) {
		/*System.out.println("Welcome to JAVA!!");
		System.out.print("alalalala");
		JOptionPane.showMessageDialog(null, "Welcome to Java!", "saldkgh", JOptionPane.INFORMATION_MESSAGE);
		*/
		String first_name ;
		first_name = JOptionPane.showInputDialog("First Name: ");
		
		String family_name ;
		family_name = JOptionPane.showInputDialog("Family Name: ");
		
		String full_name;
		full_name = "Welcome to JAVA,   " + first_name + family_name ; 
		
		JOptionPane.showMessageDialog(null, full_name, "Welcome sign", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
				
		// TODO Auto-generated method stub

	}

}