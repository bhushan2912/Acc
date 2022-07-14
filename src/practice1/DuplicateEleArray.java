package practice1;

public class DuplicateEleArray {

	public static void main(String[] args) {
		int ar[]= {12,56,12,47,58,47,85,7,325,36,56,85};
		
		
		
		for(int i=0;i<ar.length;i++) {
			for (int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[j]);
				}
			}
			
		}

	}

}
