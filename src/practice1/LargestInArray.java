package practice1;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		arr[0]=10126;
		arr[1]=1235;
		arr[2]=78921;
		arr[3]=15478;
		arr[4]=1000;
		
		System.out.println("largest value :"+LargestInArray.getLargest(arr));
		System.out.println("Largest Value using sort :"+LargestInArray.getLargestUsingSort(arr));
		
		int a=50;
		int b=70;
		int large;
		System.out.println("find largest between a and b without If else and without array: ");
		
		large=a>b?a:b; //ternary operator
		
		System.out.println(large);
	}
	public static int getLargest(int a[]) {
		
		int temp;
		int large=a.length-1;
		for (int i=0; i<a.length;i++) {
			
			for (int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[large];
	}
	public static int getLargestUsingSort(int a[]) {
		int largest= a.length-1;
		Arrays.sort(a);
		return a[largest];
	}
	

}
