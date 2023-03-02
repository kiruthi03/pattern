class P49 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 7; i++)
		{
			char c1 = 'P';
			for(int j = 1; j <= i; j++, c1++)
			{
				if(j == 1 || j == i)
				{
					System.out.print(c1 + " ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
