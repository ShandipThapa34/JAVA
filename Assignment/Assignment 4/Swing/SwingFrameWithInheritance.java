import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
class SwingFrameWithInheritance extends JFrame
{
	public static void main(String[] args)
	{
		SwingFrameWithInheritance frame = new SwingFrameWithInheritance();
		JLabel label1 = new JLabel("Number 1: ");
		JLabel label2 = new JLabel("Number 2: ");
		JLabel label3 = new JLabel("Result  : ");
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		JTextField textField3 = new JTextField();
		JButton button1 = new JButton("ADD");
		JButton button2 = new JButton("SUB");
		JButton button3 = new JButton("Mul");
		JButton button4 = new JButton("DIV");
		
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

		frame.setSize(700,600);
		frame.setTitle("Simple Calculator");
		frame.setLayout(null);
		frame.setVisible(true);
	}
}