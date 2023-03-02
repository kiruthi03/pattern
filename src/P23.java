class P23 

{
	public static void main(String[] args) 
	{
		for(char i = 'A'; i <= 'F' ; i++)
		{
			for(char j = i; j <= (i+5); j++)
			{
				System.out.print( j +" ");
			}
			System.out.println();
		}
	}
}
