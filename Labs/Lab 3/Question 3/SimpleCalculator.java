import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class SimpleCalculator extends JFrame implements ActionListener
{
	JLabel label1 = new JLabel("Number 1:");
	JLabel label2 = new JLabel("Number 2:");
	JLabel label3 = new JLabel("Result  :");
	JTextField textField1 = new JTextField();
	JTextField textField2 = new JTextField();
	JTextField textField3 = new JTextField();
	JButton add = new JButton("ADD");
	JButton sub = new JButton("SUB");
	public SimpleCalculator()
	{
		label1.setBounds(50,50,100,30);
		label2.setBounds(50,100,100,30);
		label3.setBounds(50,150,100,30);

		textField1.setBounds(130,50,100,30);
		textField2.setBounds(130,100,100,30);
		textField3.setBounds(130,150,100,30);

		add.setBounds(50,200,100,30);
		sub.setBounds(140,200,100,30);

		add(label1);
		add(label2);
		add(label3);

		add(textField1);
		add(textField2);
		add(textField3);

		add(add);
		add(sub);

		add.addActionListener(this);
		sub.addActionListener(this);

		setTitle("Simple Calculator");
		setLayout(null);
		setVisible(true);
		setSize(400,350);
	}

	public void actionPerformed(ActionEvent event)
	{
		double number1 = Double.parseDouble(textField1.getText());
		double number2 = Double.parseDouble(textField2.getText());
		if(event.getSource() == add)
		{
			textField3.setText(String.valueOf(number1 + number2));
		}
		if(event.getSource() == sub)
		{
			textField3.setText(String.valueOf(number1 - number2));
		}
	}

	public static void main(String[] args)
	{
		new SimpleCalculator();
	}
}