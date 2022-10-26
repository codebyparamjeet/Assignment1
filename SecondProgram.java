
public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i<=n||i==n-1||j<=0||j<=n-1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
