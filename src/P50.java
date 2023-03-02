class P50
{
	public static void main(String[] args) 
	{
		for(char i = 'P'; i <= 'T'; i++)
		{
			for(char j = i; j >= 'P'; j--)
			{
				if(j == i || j == 'P')
				{
					System.out.print(j + " ");
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


