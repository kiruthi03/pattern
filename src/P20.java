class P20
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 5; j >= 0; j--)
			{
				if(i == 1 || i == 6 || j == 5 || j == 0)
				{
					System.out.print("0 ");
				}
				else	
				{
					System.out.print(((j-i+2) >= 1 ? (j-i+2) : 1) + " ");
				}
				
			}
			System.out.println();
		}
	}
}


