import java.applet.Applet;
import java.awt.Graphics;

public class LifecycleOfApplet extends Applet
{
	public void init()
	{
		System.out.println("Applet is initialized.")
	}
	public void start()
	{
		System.out.println("Applet is started.");
	}
	public void paint(Graphics g)
	{
		System.out.println("Painting Shapes.");
	}
	public void stop()
	{
		System.out.println("Applet is stopped.");
	}
	public void destroy()
	{
		System.out.println("Applet is destroyed.");
	}
}