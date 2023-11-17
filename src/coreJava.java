
public class coreJava {
	public static void main (String [] args) {
		int mynum = 5;
		String website = "google";
		char letter = 'C';
		double dec = 5.25;
		boolean myCard = true;
		
		System.out.println(mynum + " is the value stored in the myNum variable");
		//Arrays--
		
		int [] arr = new int [5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int []arr2= {1,2,4,5,6};
		System.out.println(arr2[2]);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String [] names = {"Mina","Eilora","Tina"};
		
		/*
		 * for (int i =0;i<names.length;i++) {
		 * System.out.println(names[i]);
		 * ]
		 */
			
		
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
