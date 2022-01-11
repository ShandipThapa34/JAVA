import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class CheckOddEven extends Frame
{
	Label label1 = new Label("Enter Number:");
	Label label2 = new Label("Odd or Even :");

	TextField textField1 = new TextField();
	TextField textField2 = new TextField();

	Button checkNumber = new Button("Check Number"); 

	public CheckOddEven()
	{
		label1.setBounds(50,50,100,30);
		label2.setBounds(50,100,100,30);

		textField1.setBounds(130,50,100,30);
		textField2.setBounds(130,100,100,30);

		checkNumber.setBounds(75,140,100,30);

		add(label1);
		add(label2);

		add(textField1);
		add(textField2);

		add(checkNumber);

		setTitle("Check Odd or Even");
		setLayout(null);
		setVisible(true);
		setSize(400,350);

		checkNumber.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				int number = Integer.parseInt(textField1.getText());
				if(number%2 == 0)
				{
					textField2.setText(String.valueOf("Even Number"));
				}
				else
				{
					textField2.setText(String.valueOf("Odd Number"));
				}
			}
		});
	}
	
	public static void main(String[] args)
	{
		new CheckOddEven();
	}
}