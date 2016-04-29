import java.util.Scanner;

public class DDArray
	{
		static int row;
		static int col;
		static int num;
		public static void main(String[] args)
			{
			doDDArray1();
			doDDArray2();
			doDDArray3();
			doDDArrayEC();
			}
		
		public static void doDDArray1()
			{
			int DDArray1 [][] =  {{10, 20}, {30, 40}, {50, 60}};
			for(int row = 0; row < 3; row++ )
				{
				System.out.println();	
				for(int col = 0; col < 2; col++)
					{
					System.out.print(DDArray1[row][col]+" ");
					num = num + 10;
					}
				}
			}
		
		public static void doDDArray2()
		{
		String DDArray2 [][] = new String [3][3];
		for(int row = 0; row < 3; row++)
			{
			System.out.println();
			for(int col = 0; col < 3; col++)
				{
				System.out.print("MHS ");	
				}
			}
		}
		
		public static void doDDArray3()
		{
		int DDArray3 [][] = new int [3][3];
		int i = 0;
		for (int row = 0; row < 3; row ++ )
			{
			System.out.println();
			for (int col = 0; col < 3; col++ )
				{
				i++;
				DDArray3[row][col] = i;
				System.out.print(i + " ");
				}
			}
		System.out.println(DDArray3[0][0] + DDArray3[0][2] + DDArray3[2][0] + DDArray3[2][2]);
		}
		
		public static void doDDArrayEC()
		{
			int DDArrayEC [][][] = new int [3][3][3];
			int i = 0;
			int sum = 0;
			for (int row = 0; row < 3; row ++ )
				{
				System.out.println();
				for(int level = 0; level < 3; level++)
				for (int col = 0; col < 3; col++ )
					{
					i++;
					sum = sum + i;
					DDArrayEC[row][col][level] = i;
					//System.out.print(i + " ");
					}
				}
			System.out.println(sum);
		}

	}
