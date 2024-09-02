class ArrayIndexExcepTest1
{
	public static void main(String args[])
	{
		int[] n={1,2,3};
		try
		{
			for(int i=0;i<=n.length;i++)
			{
				System.out.println(n[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of the Range, Change the code");
		}
		System.out.println("Quit");
	}
}