class  a
{
	public static void main(String[] args) 
	{
		loop1:
		for (int i=0;i<2 ;i++ )
		{
			System.out.println("loop1 begin ");
			for (int j=0;j<5 ;j++ )
			{
			System.out.println("loop2 begin ");
			if (j>2)
			{
				continue loop1;//label is used to execute the loop after continue/break example here loop1 will execute first
			} // labeling works only if it is nested for loop,it was introduced in the java 1.5
			System.out.println("loop2 end");
		}
		System.out.println("loop1 end");
		}
		System.out.println("main end!");
	}
}