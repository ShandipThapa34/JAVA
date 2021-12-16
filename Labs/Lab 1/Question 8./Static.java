class Calculate
{
	static int count = 0;//static variable
	public Calculate()
	{
		count++;
	}
	public void view()
	{
		System.out.println("The value of count is:" + count);
	}
	static public int square(int number)
	{
		return number*number;
	}
	public static void main(String[] args)
	{
		int result = Calculate.square(3);
		System.out.println("The square of given number is:" + result);
		Calculate calculate1 = new Calculate();
		calculate1.view();
		Calculate calculate2 = new Calculate();
		calculate2.view();
		Calculate calculate3 = new Calculate();
		calculate3.view();
	}
}