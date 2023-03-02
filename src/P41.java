class P41
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j==i)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(j-i+7 + " ");
				}
			}
			System.out.println();
		}
	}
}
