class  s
{
	public static void main(String[] args) 
	{
		int i=0;
		if ((i++ == 1) & (i++ == 1))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end main");
		System.out.println(i);
	}
}
