import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
public class CalculatorUsingBoxLayout extends JFrame implements ActionListener
{
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	public CalculatorUsingBoxLayout()
	{
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Number 1: ");
		JLabel label2 = new JLabel("Number 2: ");
		JLabel label3 = new JLabel("Result  : ");
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		button1 = new JButton("ADD");
		button2 = new JButton("SUB");
		button3 = new JButton("Mul");
		button4 = new JButton("DIV");
		
		add(label1);
		add(textField1);

		add(label2);
		add(textField2);

		add(label3);
		add(textField3);
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		setSize(600,500);
		setTitle("Simple Calculator");
		setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new CalculatorUsingBoxLayout();
	}

	public void actionPerformed(ActionEvent e)
	{
		double numberOne = Double.parseDouble(textField1.getText());
		double numberTwo = Double.parseDouble(textField2.getText());
		if(e.getSource() == button1)
		{
			textField3.setText(String.valueOf(numberOne + numberTwo));
		}
		if(e.getSource() == button2)
		{
			textField3.setText(String.valueOf(numberOne - numberTwo));
		}
		if(e.getSource() == button3)
		{
			textField3.setText(String.valueOf(numberOne * numberTwo));
		}
		if(e.getSource() == button4)
		{
			textField3.setText(String.valueOf(numberOne / numberTwo));
		}
	}
}