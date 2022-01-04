# Java Swing Tutorial
Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.
Unlike AWT, Java Swing provides platform-independent and lightweight components.

The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc.

## Difference between AWT and Swing
There are many differences between java awt and swing that are given below.
|No.|                   Java AWT                  |                    Java Swing                  |
|---|--------------------------------------------:|-----------------------------------------------:|
|1) | AWT components are platform-dependent.      | Java swing components are platform-independent.|
|2) | AWT components are heavyweight.             | Swing components are lightweight.              |
|3) | AWT doesn't support pluggable look and feel.| Swing supports pluggable look and feel.        |
|4) | AWT provides less components than Swing.    | Swing provides more powerful components.       |

## Hierarchy of Java Swing classes
The hierarchy of java swing API is given below.

![Swing Hierarchy](https://static.javatpoint.com/images/swinghierarchy.jpg)

## Commonly used Methods of Component class
The methods of Component class are widely used in java swing that are given below.

Method
1. public void add(Component c)	add a component on another component.
2. public void setSize(int width,int height)	sets size of the component.
3. public void setLayout(LayoutManager m)	sets the layout manager for the component.
4. public void setVisible(boolean b)	sets the visibility of the component. It is by default false.

There are two ways to create a frame:
1. By creating the object of Frame class (association)
2. By extending Frame class (inheritance)
We can write the code of swing inside the main(), constructor or any other method.


