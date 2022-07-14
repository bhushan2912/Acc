package practice1;

public class ArrayOperation {

	public static void main(String[] args) {
		int ar[]= {12,56,47,58,7,32,36,85};
//		System.out.println("Largest Number :"+ArrayOperation.largestNum(ar));
//		System.out.println("Smallest Number :"+ArrayOperation.smallestNum(ar));
//		System.out.println("Sum of Element :"+ArrayOperation.sumOfEle(ar));
//		System.out.println("Third Largest Number :"+ArrayOperation.thirdLargeNum(ar));
		System.out.println("Second Largest Number :"+ArrayOperation.secondLargeNum(ar));
		
//		System.out.println("Second Smallest Number :"+ArrayOperation.secondSmallestNum(ar));
//		ArrayOperation.ascendingOrder(ar);
//		ArrayOperation.descendingOrder(ar);
	}
	public static int largestNum(int a[]) {
		for (int i=0;i<a.length;i++) {
			int temp=0;
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[0];
	}
	public static int smallestNum(int a[]) {
		for (int i=0;i<a.length;i++) {
			int temp=0;
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-1];
	}
	public static int sumOfEle(int a[]) {
		int sum=0;
		for (int i=0;i<a.length;i++){
			sum=sum+a[i];
			}
		return sum;
	}
	public static int thirdLargeNum(int a[]) {
		for (int i=0;i<a.length;i++) {
			int temp=0;
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[2];
	}
	public static int secondLargeNum(int a[]) {
		for (int i=0;i<a.length;i++) {
			int temp=0;
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	public static int secondSmallestNum(int a[]) {
		for (int i=0;i<a.length;i++) {
			int temp=0;
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-2];
	}
	public static void ascendingOrder(int a[]) {
		System.out.print("Sort array in Ascending: ");
		for (int i=0;i<a.length;i++) {
			int temp;
			for (int h=i+1;h<a.length;h++) {
				if(a[i]>a[h]) {
					temp=a[i];
					a[i]=a[h];
					a[h]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void descendingOrder(int a[]) {
		System.out.print("Sort array in Descending: ");
		for (int i=0;i<a.length;i++) {
			int temp;
			for(int k=i+1;k<a.length;k++) {
				if(a[i]<a[k]) {
					temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	

}
