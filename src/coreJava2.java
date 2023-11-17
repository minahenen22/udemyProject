import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr2 = {1,2,4,5,6,7,8,9,10,122};
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i] + " is not multiple of2");
			}
		}
		
		ArrayList <String> a = new ArrayList<String>();
		a.add("Mina");
		a.add("Tina");
		a.add("Eilora");
		a.add("Sierra");
		
		System.out.println(a.get(2));
				
		for (int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		
		for( String bb : a) {
			System.out.println(bb);
		}
		System.out.println("***********************");
		//List<int[]> arr3 = Arrays.asList(arr2);
		/*
		 * 
		 */

	}

}
