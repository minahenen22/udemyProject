
public class CoreJavaString {
public static void main (String [] args) {
	
	
	String s = "Rahul Shetty Academy";
	String [] splittedString = s.split("Shetty");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	//System.out.println(splittedString[2]);
	System.out.println(splittedString[1].trim());
	for (int i =0;i<s.length();i++) {
		System.out.print(s.charAt(i));
	}
	
	System.out.println("****************");
	
	for (int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	}
}
