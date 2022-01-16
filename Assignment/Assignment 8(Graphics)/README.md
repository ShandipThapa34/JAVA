# ASSIGNMENT GIVEN: JAN 16, DEADLINE: JAN 17;

# Commonly used methods of Graphics class:
1. public abstract void drawString(String str, int x, int y): is used to draw the specified string.
2. public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
3. public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
4. public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
5. public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
6. public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
7. public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
8. public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
9. public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
10. public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
11. public abstract void setFont(Font font): is used to set the graphics current font to the specified font.

### Example of displaying graphics in swing:
```java
import java.awt.*;  
import javax.swing.JFrame;  
  
public class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) {  
        g.drawString("Hello",40,40);  
        setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
          
    }  
        public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}  
```
