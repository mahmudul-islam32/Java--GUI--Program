import javax.swing.JButton;
import javax.swing.JFrame;

public class CalculatorMM {
	
	public static void main(String[] args)
	{
		CalculatorSM calculatorSM = new CalculatorSM();
		calculatorSM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorSM.setSize(260,330);
		calculatorSM.setVisible(true);
		calculatorSM.setResizable(false);
	}

}
