class CommandLineArguments
{
	public static void main(String[] args)
	{
		int x,y,summation,difference;
		x = Integer.parseInt(args[0]);//first argument
		y = Integer.parseInt(args[1]);//second argument
		summation = x + y;
		difference = x - y;
		System.out.println("The summation of two number is:" + summation);
		System.out.println("The difference of two number is:" + difference);
		//you must enter two value while running this program
		//for ex: java CommandlineArguments 2 3
	}
}