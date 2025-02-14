import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
//import java.util.regex.Pattern;
 class javapro  { 
	static void m() {
		System.out.println("The email address is invalid.");
	}
	public static void main(String[] args) { 
		String str = "Programming";
		String email="nichitprya@gmail.com";
        String result = "";
//        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,7}$";
//       // Pattern pattern = Pattern.compile(EMAIL_REGEX);
//        Matcher matcher = pattern.matcher(email);
//        if (matcher.matches()) {
//            System.out.println("The email address is valid.");
//        } else {
//            

//        }
		//char[] ch1=str.toCharArray();
		int len=str.length();
		String st="";
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			  if (st.indexOf(ch) == -1) { // indexOf returns -1 if the character is not found
	                st =st+ ch; // Append the character to st
	            }
			}
		
	    System.out.println(st);
	    m();
	    ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 9,3, 4, 5,1,6,0,5));
	    
   HashSet<Integer> set = new HashSet<>(a);
        
        // Convert HashSet back to ArrayList
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
//	    LinkedHashSet<Integer> reduplicates=new LinkedHashSet<>(a);
//	    
//	    ArrayList<Integer> uniqueList = new ArrayList<>(reduplicates);
//  Collections.sort(uniqueList);
		System.out.println(uniqueList);
		String name="abba";
		String rev="";
		char[] charcters=name.toCharArray();
		
		int lenstr=name.length();
		
		for(int i=lenstr-1;i>=0;i--) {
			rev=rev+charcters[i];
		}
		System.out.println(rev);
		if(name.equals(rev.toString())) {
			System.out.println(" pallin");
		}else {
				System.out.print("pallin not");
			}
		
//	String s1="123";
//	String s2="132";
		 int num1 = 1231;
	        int num2 = 2311;

	        // Convert numbers to strings
	        String s1 = Integer.toString(num1);
	        String s2 = Integer.toString(num2);
	 s1 = s1.toLowerCase();
     s2 = s2.toLowerCase();
	 System.out.println(s2);
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
     Arrays.sort(c1);
     Arrays.sort(c2);
    if (Arrays.equals(c1, c2)) {
        System.out.println("The strings are anagrams.");
    } else {
        System.out.println("The strings are not anagrams.");
    }
 }
	

 }
	


		
		
		
		

