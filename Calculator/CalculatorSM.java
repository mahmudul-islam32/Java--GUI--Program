import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class CalculatorSM extends JFrame implements ActionListener {
	
	private JButton[] buttons;
	private JTextField textField;
	private final String[] buttonOrder = {"7","8","9","4","5","6","1","2","3",".","0"," "};
	private final String[] operator = {"+","-","*","/","="};
	private final String[] clear = {"C"};
	private static final Font font = new Font("monospaced", Font.PLAIN,20);
	
	
	
	
	 public CalculatorSM() {
		// TODO Auto-generated constructor stub
		super("Calculator By Somrat");
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,buttonOrder.length,5,5));
		for(int count= 0 ;count< buttonOrder.length;count++)
		{
			String key = buttonOrder[count];
			JButton b = new JButton(key);
			if(key.equals(" "))
			{
				b.setEnabled(false);
			}
			else
			{
				
			}
			b.setFont(font);
			buttonPanel.add(b);
			
		}
		
		
		
		JPanel operatorPanel = new JPanel();
		operatorPanel.setLayout(new GridLayout(5,operator.length,5,5));
		for(int count =0;count <operator.length; count++)
		{
			JButton o = new JButton(operator[count]);
			o.setFont(font);
			//o.setBackground(Color.ORANGE);
			operatorPanel.add(o);
			
		}
		
		
		
		JPanel clearPanel = new JPanel();
		clearPanel.setLayout(new FlowLayout());
		JButton clearButton = new JButton(clear[0]);
		clearButton.setFont(font);
		clearPanel.add(clearButton);
		
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		textField = new JTextField("0",17);
		textField.setEditable(true);
		textField.setHorizontalAlignment(textField.RIGHT);
		textField.setFont(font);
		textPanel.add(textField);
		
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout(5,5));
		content.add(textPanel,BorderLayout.NORTH);
		content.add(buttonPanel,BorderLayout.WEST);
		content.add(operatorPanel,BorderLayout.EAST);
		content.add(clearPanel,BorderLayout.SOUTH);
		content.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		this.setContentPane(content);
	
		
		
	}
	 
	 
	 

	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
	
	}

	

}
