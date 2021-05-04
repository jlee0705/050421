
public class Loop1 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		for (int i=0;i<arr.length;i++)		//for 문
		{
			System.out.println("1st" + arr[i] + " ");
		}
		System.out.println();
		
		int j=0;				//while 문
		while(j<arr.length)
		{
			System.out.println("2nd" + arr[j]+" ");
			j++;
		}
		System.out.println();
		
		int k=0;				//do while 문
		do {
			System.out.println("3rd" + arr[k] + " ");
			k++;
		}while (k<arr.length);
		
		for (int num: arr)		//향상된 for 문 
		{
			System.out.print("4th" + num + " ");
		}  
	}

}
