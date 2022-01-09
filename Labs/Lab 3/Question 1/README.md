# Introduction to Applet Life Cycle
Applet life cycle defined as how the object created, started, stopped and destroyed during the entire execution of the application is said to applet life cycle. Applet life cycle has 5 methods init(), start(), stop(), aint() and destroy().These methods are invoked by the browser to execute. Applet works on the client side so, less processing time.

## Methods of Applet Life Cycle
Applet life cycle has 5 methods. Methods are init(), start(), paint(), stop() and destroy().
1. init():  init() method is used to initialize an applet. It is invoking only once at the time of initialization. Initialized objects are created by the web browser. We can compare this method with a Thread class born state.
2. start(): start() method is used to start the applet. It is invoking after the init()method invoked. It is invoking each time when browser loading or refreshing. Until init() method is invoked start() method is inactive state. We can compare this method with Thread class start state
3. stop(): stop() method is used to stop the applet. It is invoked every time when browser stopped or minimized or abrupt failure of the application. Afterstop()method called, we can also start() method whenever we want. This method mainly deals with clean up code. We can compare this method with Thread class blocked state
4. destroy(): destroy() method is used to destroy the application once we have done with our applet work. It is invoked only once. Once applet is destroyed we can’t start()the applet. We can compare this method with Thread class dead state
5. paint(): paint() method is used for painting any shapes like square, rectangle, trapezium, eclipse, etc. paint() method has parameter as ClassGraphics. This Graphics class gives painting features in an applet. We can compare this method with Thread class runnable state.

## How does Applet Life-Cycle Works in Java?
1. Applet is a Java application that runs in any web browser and working at a client-side window. As it is running in the browser so, it doesn’t have a main () method so Applet is designed to be placed within an HTML page.
2. java.applet.Appletclass provides init(), start(), stop() and destroy() methods.
3. java.awt.Componentclass provides another method of paint().
4. In Java, if any class wants to become Applet Class, it must inherit the Applet class.
5. init() method
6. start() method
7. stop() method
8. destroy() method
9. paint() method
10. All of the above methods are automatically called by the browser. We no need to call explicitly. Even though each method has its own specification to full fill the requirement as we discussed above.
11. Entire Applet Life Cycle

Syntax:
```
Class MyLifeCycle extends Applet
{
  public void init()
  {
    //initialized objects
  }
  public void start()
  {
    //start the applet code
  }
  public void paint(Graphics graphics)
  {
    //any shapes code
  }
  public void stop()
  {
    //stop the applet code
  }
  public void destroy()
  {
    //destroy the applet code
  }
}
```
12. Applet life cycle is managed by Java Plug-in software.
13. There are 2 ways to run the applet.
    * By using an HTML file.
    * By using the applet viewer tool, this is for testing the application but real-time we simply used it with HTML file only.
