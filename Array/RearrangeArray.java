package Array;
import java.util.Scanner; 

public class RearrangeArray {

	private static void rearrange(int[] arr,int n) {
		int minIndex = 0,maxIndex = n-1;
		int[] temp = new int[n]; 
		for(int i=0;i<n;i++) {
			temp[i] = arr[i]; 
		}
		for(int i=0;i<n;i+=2) {
			arr[i] = temp[maxIndex]; 
			if(i+1 < n) {
				arr[i+1] = temp[minIndex]; 
			}
			maxIndex--; 
			minIndex++; 
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont = 1; 
		do {
			System.out.println("Enter Array Size   : ");
			int n = s.nextInt(); 
			if(n <= 0) {
				System.out.println("Size should be greater than 0"); 
			}else {
				int[] input = new int[n];
				System.out.println("Enter Sorted Array : ");
				for(int i=0;i<n;i++) {
					input[i] = s.nextInt(); 
				}
				rearrange(input,n); 
				System.out.println("Rearranged array : "); 
				for(int i=0;i<n;i++) {
					System.out.print(input[i] + " ");
				}
				System.out.println(); 
			}
			System.out.println("Want to input another array, press 1 else 0");
			cont = s.nextInt(); 
		}while(cont == 1); 
		s.close();
	}

}
