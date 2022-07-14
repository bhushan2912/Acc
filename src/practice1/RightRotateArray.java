package practice1;

public class RightRotateArray {
	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50};
		
		System.out.print("Original array :");
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		int n=3;
		
		for (int i=0;i<n;i++) {
			int j,last;
			
			last=ar[ar.length-1];
			
			for(j=ar.length-1;j>0;j--) {
				ar[j]=ar[j-1];
			}
			
			ar[j]=last;
		}
		
		System.out.print("After Left Rotate array: ");
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
