abstract class Animal
{
	abstract public void eat();
	abstract public void sound();
	public void walk()
	{
		System.out.println("Walking..");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog can eat.");
	}
	public void sound()
	{
		System.out.println("Dog barks!!");
	}
}

class AnimalDemo
{
	public static void main(String[] args)
	{
		Animal dog = new Dog();
		dog.eat();
		dog.sound();
		dog.walk();
	}
}