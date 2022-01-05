import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class AwtEventAnonymousClassWithAssociation
{
	TextField textField1;
	TextField textField2;
	TextField textField3;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	AwtEventAnonymousClassWithAssociation()
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

		frame.setSize(700,600);
		frame.setTitle("Simple Calculator");
		frame.setLayout(null);
		frame.setVisible(true);

		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				double numberOne = Double.parseDouble(textField1.getText());
				double numberTwo = Double.parseDouble(textField2.getText());
				textField3.setText(String.valueOf(numberOne + numberTwo));
			}
		});
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				double numberOne = Double.parseDouble(textField1.getText());
				double numberTwo = Double.parseDouble(textField2.getText());
				textField3.setText(String.valueOf(numberOne - numberTwo));
			}
		});
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				double numberOne = Double.parseDouble(textField1.getText());
				double numberTwo = Double.parseDouble(textField2.getText());
				textField3.setText(String.valueOf(numberOne * numberTwo));
			}
		});
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				double numberOne = Double.parseDouble(textField1.getText());
				double numberTwo = Double.parseDouble(textField2.getText());
				textField3.setText(String.valueOf(numberOne / numberTwo));
			}
		});
	}

	public static void main(String[] args)
	{
		new AwtEventAnonymousClassWithAssociation();
	}
}