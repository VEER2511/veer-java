import java.util.*;
class matrix
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		int [][] mat1=new int[3][3];
		int [][] mat2=new int[3][3];
		int [][] mat3=new int[3][3];
		int [][] mat4=new int[3][3];

		for(int i=0;i<3;i++)   		
		{
			for(int j=0;j<3;j++) 	
			{
				System.out.print("Enter the mat1[" + i + "][" + j +"]:");
				mat1[i][j]=st.nextInt();				
			}
		}
		for(int i=0;i<3;i++)   		
		{
			for(int j=0;j<3;j++) 	
			{
				System.out.print("Enter the mat2[" + i + "][" + j +"]:");
				mat2[i][j]=st.nextInt();

				mat3[i][j]=mat1[i][j] + mat2[i][j];	
				mat4[i][j]=mat1[i][j] - mat2[i][j];		
			}	
		}

		//output code
		System.out.println("Matrix 1 data:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat1[i][j] + " ");		
			}
			System.out.println();
		}	
		System.out.println("Matrix 2 data:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat2[i][j] + " ");		
			}
			System.out.println();
		}	
		System.out.println("Matrix 3 data Addition of matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat3[i][j] + " ");		
			}
			System.out.println();
		}
		System.out.println("Matrix 4 data Substraction of matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat4[i][j] + " ");		
			}
			System.out.println();
		}		
	}
}