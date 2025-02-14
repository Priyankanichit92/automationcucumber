package test.automation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App 
{
	public static void main( String[] args )

	{
		
		int arr[]={2,10,50,6,30,2,30,0};
		int len1=arr.length;
		//Arrays.sort(arr);
		TreeSet<Integer> reduplicates=new TreeSet<>();
		for(int i=0;i<len1;i++) {
			reduplicates.add(arr[i]);
		}

		Integer[] uniqueArr = reduplicates.toArray(new Integer[0]);

		System.out.print("removed duplicates: ");
		for (int num : uniqueArr) {
			System.out.print(num + " ");
		}
		int temp;
		for(int i=0;i<len1;i++) {
			for(int j=i+1;j<len1;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}
		}


		System.out.println("Sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		int maxele = arr[len1-1]; 
		System.out.println("\nMaximum element: " + maxele);


		int len=arr.length;
		int max=arr[0];
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				max=arr[i];

			}
			// max = Math.max(max, arr[i]);
		}
		System.out.println( "MAX No. = "+max );
		String str="Priyanka";
		str=str.toLowerCase();
		char[] ch = str.toCharArray();
		int i=0;
		for(char c1:ch) {
			i++;	

		}
		System.out.println("length=  "+i);

		HashMap<Character,Integer> count= new HashMap<>();

		for(Character c:ch) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				// If the character is not in the map, add it with a count of 1
				count.put(c, 1);
			}   
		}
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			System.out.println("Character: " + entry.getKey() + " -> Count: " + entry.getValue());
		}
		System.out.println( "Count each character  : "+count );
		System.out.println(" string  : "+str );
		 String vowels = "aeiouAEIOU";
	        int vowelCount = 0;                
		 for (int l = 0; l< str.length(); l++) {
	            char currentChar = str.charAt(l); // Get the character at the current position
	            if (vowels.indexOf(currentChar) != -1) {  // Check if the character is a vowel
	                 vowelCount ++;               
	                System.out.print(currentChar + " ");  // Print the vowel
	            }
	        }
		 System.out.print(vowelCount + " ");
	}


}
