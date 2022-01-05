import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class SwingEventOutsideClassWithAssociation
{
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	SwingEventOutsideClassWithAssociation()
	{
		JFrame frame = new JFrame();
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
		
		label1.setBounds(100,100,100,30);
		label2.setBounds(100,200,100,30);
		label3.setBounds(100,300,100,30);
		
		textField1.setBounds(180,100,200,30);
		textField2.setBounds(180,200,200,30);
		textField3.setBounds(180,300,200,30);
		
		button1.setBounds(100,400,80,30);
		button2.setBounds(200,400,80,30);
		button3.setBounds(300,400,80,30);
		button4.setBounds(400,400,80,30);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);

		frame.add(textField1);
		frame.add(textField2);
		frame.add(textField3);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);	

		button1.addActionListener(new OutsideClass(this));
		button2.addActionListener(new OutsideClass(this));
		button3.addActionListener(new OutsideClass(this));
		button4.addActionListener(new OutsideClass(this));

		frame.setSize(700,600);
		frame.setTitle("Simple Calculator");
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		new SwingEventOutsideClassWithAssociation();
	}

	
}

class OutsideClass implements ActionListener
{
	SwingEventOutsideClassWithAssociation obj;
	public OutsideClass(SwingEventOutsideClassWithAssociation obj)
	{
		this.obj = obj;
	}
	public void actionPerformed(ActionEvent e)
	{
		double numberOne = Double.parseDouble(obj.textField1.getText());
		double numberTwo = Double.parseDouble(obj.textField2.getText());
		if(e.getSource() == obj.button1)
		{
			obj.textField3.setText(String.valueOf(numberOne + numberTwo));
		}
		if(e.getSource() == obj.button2)
		{
			obj.textField3.setText(String.valueOf(numberOne - numberTwo));
		}
		if(e.getSource() == obj.button3)
		{
			obj.textField3.setText(String.valueOf(numberOne * numberTwo));
		}
		if(e.getSource() == obj.button4)
		{
			obj.textField3.setText(String.valueOf(numberOne / numberTwo));
		}
	}
}