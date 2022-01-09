# Passing Parameters to Applets
In this article we will learn about passing parameters to applets using the param tag and retrieving the values of parameters using getParameter method.
Parameters specify extra information that can be passed to an applet from the HTML page. Parameters are specified using the HTML’s param tag.

## Param Tag
The <param> tag is a sub tag of the <applet> tag. The <param> tag contains two attributes: name and value which are used to specify the name of the parameter and the value of the parameter respectively. For example, the param tags for passing name and age parameters looks as shown below:
```
<param name=”name” value=”Ramesh” />
<param name=”age” value=”25″ />
 ```
Now, these two parameters can be accessed in the applet program using the getParameter() method of the Applet class.

## getParameter() Method
The getParameter() method of the Applet class can be used to retrieve the parameters passed from the HTML page. The syntax of getParameter() method is as follows:
String getParameter(String param-name)

Let’s look at a sample program which demonstrates the <param> HTML tag and the getParameter() method:

```java
import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet 
{
	String n;
	String a;
	public void init()
	{
		n = getParameter("name");
		a = getParameter("age");
	}
	public void paint(Graphics g)
	{
		g.drawString("Name is: " + n, 20, 20);
		g.drawString("Age is: " + a, 20, 40);
	}
}
/*
	<applet code="MyApplet" height="300" width="500">
		<param name="name" value="Ramesh" />
		<param name="age" value="25" />
	</applet>
*/
```
  
Output of the above program is as follows:
![Output Image](https://www.startertutorials.com/corejava/wp-content/uploads/2016/03/passing-parameters-to-applet.png)
