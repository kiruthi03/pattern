class P35 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 8; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j==1||j==i||i==8)
				{
					System.out.print(1 + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}


	}
}
