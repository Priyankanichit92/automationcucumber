import java.util.ArrayList;
import java.util.Arrays;

public class javapro  { 
	
	public static String duplicatremove(String str) {
		//char[] ch1=str.toCharArray();
		int len=str.length();
		String st="";
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			  if (st.indexOf(ch) == -1) { // indexOf returns -1 if the character is not found
	                st += ch; // Append the character to st
	            }
				
			
			
		}
		
		return st;
		
		
	}
	
	public static void main(String[] args) { 
//		static int a=20; 
//		int b= a + 10; 
//		System.out.println(b); 
//		}
//		 ArrayList<Integer> a = new ArrayList<>();
//		 a.add(1);
//		 a.add(2);
//		 a.add(3);
//		 a.add(4); // Corrected line
//		 a.removeAll(new ArrayList<>(Arrays.asList(1, 3, 4, 5)));
//		 System.out.println(a);
//		
		//javapro jp = new javapro(); 
		String input = "Programming";
        String result = duplicatremove(input);
        System.out.println(result);
		
}
}