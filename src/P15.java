class P15
{
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 5; i++)
		{
			for (int j = 1; j <= 6; j++)
			{
				if( i == 0 || i == 5 || j == 1 || j == 6 )
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}

			}
		System.out.println();
		}
	}
}

