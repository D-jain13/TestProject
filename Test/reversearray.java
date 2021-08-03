package Arrays;
import java.util.*;
public class reversearray {
			
				//Function to reverse an array
	static void reverse(int[] a,int start,int end) {
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

	static void print(int[] a,int n) {
		//System.out.println("The array is :");
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter desired size: ");
		int size = scan.nextInt();
		int start = 0;
		int end = size-1;
		//Loop to take user input
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("Array before reversing : ");
		print(arr,size);
		reverse(arr,start,end);
		System.out.println("Array after reversing : ");
		print(arr,size);
	}

}
