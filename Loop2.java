
public class Loop2 {

	public static void main(String[] args) 
	{// 2x1=2 3x1=3 4x1=4 ... 9x1=9
	 // 2x2=4 3x2=6 4x2=8 ... 9x2=18
	 // ...
	 // ...
	 // 2x9=18 3x9=27 ... 	  9x9=81
		
		for (int i=1;i<10;i++) //기준 
		{
			for(int j=2;j<10;j++)
			{
				System.out.printf("%dx%d=%d\t", j, i, j*i);
								
			}
			System.out.println();
		}
	}

}
