package package_June14;

public class MyActivity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 1; i <= 10; i++ )
		{
			for ( int j = 1; j <= 10; j++)
			{
				if (j == 10)
				{
					System.out.printf("%4s", i*j);
				}
				else 
				{
					System.out.printf("%3s", i*j);
				}
			}
			System.out.println();
		}
	}

}
