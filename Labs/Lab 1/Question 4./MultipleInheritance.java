interface GrandParent
{
	public void grandParent();
}
interface Parent
{
	public void parent();
}
class Child implements GrandParent, Parent
{
	public void grandParent()
	{
		System.out.println("Child's GrandParent");
	}
	public void parent()
	{
		System.out.println("Child's Parent");
	}
	public static void main(String[] args)
	{
		Child child = new Child();
		child.grandParent();
		child.parent();
	}
}