
public class IneuronPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 10;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)// For I
			{
				if(i==0 || i==(n-1)|| j== (n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++)// For N
			{
				if(i==j || j==0 && i!= 0 || j==n-1 && i!=n-1) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++)// For E
			{
				if(i==0 || i==(n-1)|| i== (n-1)/2 || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) // For U
			{
				if((j==0 && i!= n-1) || (j==(n-1) && i!=n-1) || (i==n-1 && j>0 && j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++)//For R
			{
				if(j==0 || i==0 && j<(n-1) || i==(n-1)/2 && j<(n-1)|| j==(n-1) && i<(n-1)/2 && i>0 || (i-j == (n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) // For O
			{
				if((j==0 && i!= n-1 && i!=0) || (j==(n-1) && i!=n-1 && i!=0) || (i==n-1 && j>0 && j<n-1) || (i==0 && j>0 && j<n-1)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) // For N
			{
				if(i==j || j==0 && i!= 0 || j==n-1 && i!=n-1) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}

}
}