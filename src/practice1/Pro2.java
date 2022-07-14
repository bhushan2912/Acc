package practice1;

public class Pro2 {

	public static void main(String[] args) {
		int ar[]= {1,48,256,17,85,25,62,15,26,32,52,14,97,23,69,99,112,98,12,03};
		
		//print even number at even number of index of array
		
		
		for (int i=1;i<ar.length;i++) {
			if(i%2==0) {
				if(ar[i]%2==0) {
					System.out.print(ar[i]+" ");
				}
			}
		}
		

	}

}
