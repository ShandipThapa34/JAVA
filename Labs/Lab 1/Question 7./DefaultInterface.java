interface Man
{
	default public void eat()
	{
		System.out.println("I like eating.");
	}
}
class Human implements Man
{
	public static void main(String[] args)
	{
		Human human = new Human();
		human.eat();
	}
}