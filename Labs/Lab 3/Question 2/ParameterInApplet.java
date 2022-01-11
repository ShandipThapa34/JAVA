import java.applet.Applet;
import java.awt.Graphics;

public class ParameterInApplet extends Applet 
{
	String name;
	String age;

	public void init()
	{
		name = getParameter("Name");
		age = getParameter("Age");
	}

	public void paint(Graphics g)
	{
		g.drawString("Reading parameters passed to this applet -", 20, 20);
		g.drawString("Name -" + name, 20, 40);
		g.drawString("Age -" + age, 20, 60);
	}

}