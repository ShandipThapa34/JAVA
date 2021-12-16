class Animal
{
	final int numberOfAnimal = 10;//we can't change it's value it is constant
	public void walk()
	{
		System.out.println("Walking...");
	}
}
class Dog extends Animal
{
	public int numberOfDog;
	public Dog(int numberOfDog)
	{
		this.numberOfDog = numberOfDog;
	}
	public void walk()
	{
		System.out.println("Dog is walking...");
	}
	public void show()
	{
		super.walk();
		walk();
	}
}
class Keywords
{
	public static void main(String[] args)
	{
		Dog dog = new Dog(3);
		System.out.println("The number of animal is:" + dog.numberOfAnimal);
		System.out.println("The number of dog is:" + dog.numberOfDog);
		dog.show();
	}
}