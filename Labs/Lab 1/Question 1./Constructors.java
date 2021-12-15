class Constructor{
	private int number;
	public Constructor(){
		number = 10;
	}

	public Constructor(int num){
		number = num;
	}

	public int showValue(){
		return number;
	}

	public static void main(String[] args)
	{
		Constructor constructor = new Constructor();
		Constructor constructor1 = new Constructor(5);
		System.out.println("The value of number is:" + constructor.showValue());
		System.out.println("The value of number is:" + constructor1.showValue());
	}
}