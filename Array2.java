import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		//1. 입력받는 값의 범위 1~65535
		//2. int 배열크기 16으로 사용하여 각각의 공간에 이진수 0,1 저장
		//3. 10진수를 2진수로 변경하여 2번 배열에 저장하여 출력
		//4. 8을 입력하면 00001000 출력
		//   255를 입력하면 11111111 출력
		//   256을 입력하면 00000001 00000000
		int[] binArr = new int[16];
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력(1~65535):");
		int num = s.nextInt();
		int index = 0;
		while(num != 1)
		{
			binArr[index++]= num %2;
			num /= 2;
		}
		binArr[index] = num;
		
		for (int i=7;i>=0;i--)
		{
			System.out.print(binArr[i] + " ");
			
		}
	}
}