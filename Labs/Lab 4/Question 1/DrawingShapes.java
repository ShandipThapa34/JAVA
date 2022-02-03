import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

class DrawingShapes extends JFrame
{
	public DrawingShapes()
	{
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		//for circle
		g.setColor(Color.RED);
		g.drawOval(80,80,50,50);

		//for ellipse
		g.setColor(Color.BLUE);
		g.drawOval(160,80,60,40);

		//for triangle
		int x1[] = {250,250,300};
		int y1[] = {80,160,160};
		Polygon triangle = new Polygon(x1,y1,3);
		g.setColor(Color.BLACK);
		g.drawPolygon(triangle);

		//for hexagon
		int x2[] = {80,120,160,200,160,120};
		int y2[] = {240,200,200,240,280,280};
		Polygon hexagon = new Polygon(x2,y2,6);
		g.setColor(Color.PINK);
		g.drawPolygon(hexagon);

		//for pentagon
		int x3[] = {300,340,320,280,260};
		int y3[] = {200,240,280,280,240};
		Polygon pentagon = new Polygon(x3,y3,5);
		g.setColor(Color.GREEN);
		g.drawPolygon(pentagon);
	}
	public static void main(String[] args)
	{
		new DrawingShapes();
	}
}