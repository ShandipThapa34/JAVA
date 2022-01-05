class TryCatchException
{
	public static void main(String[] args)
	{
		int number1 = 2;
		int number2 = 0;
		int result;
		try{
			result = number1/number2;
			System.out.println("The result is:"+result);
		}catch(ArithmeticException e){
			System.out.println("Error!! "+ e.getMessage());
		}
	}
}