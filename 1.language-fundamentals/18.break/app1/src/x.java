class  x
{
	public static void main(String[] args) 
	{
		for (int i=0;i<10 ;i++ )
		{
			System.out.println("loop begin (i value)"+i);
			if (i>5)
			{
				break;//break should be the last statement in loop
				System.out.println("end! if");//continue also
			}
			System.out.println("loop end (i value)"+i);
		}
		System.out.println("main end!");
	}
}