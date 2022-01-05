import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class AwtEventOutsideClassWithInheritance extends Frame
{
	TextField textField1;
	TextField textField2;
	TextField textField3;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	AwtEventOutsideClassWithInheritance()
	{
		Frame frame = new Frame();
		Label label1 = new Label("Number 1: ");
		Label label2 = new Label("Number 2: ");
		Label label3 = new Label("Result  : ");
		textField1 = new TextField();
		textField2 = new TextField();
		textField3 = new TextField();
		button1 = new Button("ADD");
		button2 = new Button("SUB");
		button3 = new Button("Mul");
		button4 = new Button("DIV");
		
		label1.setBounds(100,100,100,30);
		label2.setBounds(100,200,100,30);
		label3.setBounds(100,300,100,30);
		
		textField1.setBounds(150,100,200,30);
		textField2.setBounds(150,200,200,30);
		textField3.setBounds(150,300,200,30);
		
		button1.setBounds(100,400,80,30);
		button2.setBounds(200,400,80,30);
		button3.setBounds(300,400,80,30);
		button4.setBounds(400,400,80,30);
		
		add(label1);
		add(label2);
		add(label3);

		add(textField1);
		add(textField2);
		add(textField3);

		add(button1);
		add(button2);
		add(button3);
		add(button4);	

		button1.addActionListener(new OutsideClass(this));
		button2.addActionListener(new OutsideClass(this));
		button3.addActionListener(new OutsideClass(this));
		button4.addActionListener(new OutsideClass(this));

		setSize(700,600);
		setTitle("Simple Calculator");
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new AwtEventOutsideClassWithInheritance();
	}

	
}

class OutsideClass implements ActionListener
{
	AwtEventOutsideClassWithInheritance obj;
	public OutsideClass(AwtEventOutsideClassWithInheritance obj)
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