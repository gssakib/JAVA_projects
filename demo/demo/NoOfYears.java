package demo;
import javax.swing.JOptionPane;

public class NoOfYears {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null,"Please enter the total minutes:","Input Box", JOptionPane.QUESTION_MESSAGE);
		double mins = Double.parseDouble(input);
		
		double years = mins / (24.0 * 365 * 60);
		double rem = mins % (24.0 * 365 * 60);
		double days = rem / (24.0 * 60);
		
		JOptionPane.showMessageDialog(null, (int)mins + " minutes is approximately " + (int)years + " years and " + (int)days + " days." );
		
		
		

	}

}
