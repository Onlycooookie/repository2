import java.util.Scanner;
//import java.util.Arrays;
import java.util.Random;

public class Maxblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows in the matrix:");
		int n=input.nextInt();
		int[][] a=new int[100][100];
		int[] res = new int[3];
		
		System.out.println("Enter the matrix row by row:");
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				Random x =new Random();
				a[i][j]=x.nextInt(2);
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		
		res = findLargestBlock(a);
		System.out.println("The maximum squire submatrix is at：("+res[1]+","+res[2]+")  "+"with size "+res[0]);
	}
	
    
	public static int[] findLargestBlock(int[][] m)
	{
		int maxn=1,x=0,y=0;
		int n = m.length;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(m[i][j]==1)
				{
					int mmin = Math.min(m[i - 1][j], m[i][j - 1]);
	                mmin = Math.min(m[i - 1][j - 1], mmin);//求出上 ，左，上左最小值
	                m[i][j] = mmin + 1;
	                if(maxn < m[i][j])
	                {
	                	maxn = m[i][j];
	                	x=i;y=j;//记录方阵右下位置
					}
				}
			}
		}
		int[] res = {maxn,x-maxn+1,y-maxn+1};//结果放在数组中
		return res;
	}

}
