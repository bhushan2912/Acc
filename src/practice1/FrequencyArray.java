package practice1;

import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class FrequencyArray {

	public static void main(String[] args) {
		int arr[]= {01,45,85,47,58,45,01,78,25,58,45,28,25,96,35,14,25,96,25,28,23,01,78,25,01,28,35,35,14};
		
		System.out.println("Frequency :"+FrequencyArray.freq(arr));
		
	}
	
	public static String freq(int a[]) {
		
		Arrays.sort(a);
		int fr[]=new int[a.length];
		
		int visited=-1;
		
		for (int i=0;i<a.length;i++) {
			int count =1;
			
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					count++;
					
					fr[j]=visited;
				}
			}
			
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		
		for(int i=0; i<a.length;i++) {
			
			if(fr[i]!=visited) {
				System.out.println(a[i]+"      |       "+fr[i]);
			}
		}
		return "";
	}

}
