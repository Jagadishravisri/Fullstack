class  k
{
	public static void main(String[] args) 
	{
		for (int i=0;i<2 ;i++ )
		{
			System.out.println("loop1 begin "+ "i: -"+i);
			for (int j=0;j<5 ;j++ )
			{
			System.out.println("loop2 begin "+ "i: -"+i +"j:"+j);
			if (i>5)
			{
				break;
			}
			System.out.println("loop2 end");
		}
		System.out.println("loop1 end");
		}
		System.out.println("main end!");
	}
}