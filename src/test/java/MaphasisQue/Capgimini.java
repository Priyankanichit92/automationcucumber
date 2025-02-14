package MaphasisQue;

import java.util.HashMap;
import java.util.Map;

public class Capgimini {

	public static void main(String[] args) {

		String str="Capgeminic",rev="";
		char[] ch=str.toCharArray();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i] ;
		}

		System.out.println("rev string = "+rev);


		HashMap<Character,Integer>  seqchar=new HashMap<>();

		for(Character c1:ch) {
			char c = Character.toLowerCase(c1);
			if(seqchar.containsKey(c))
			{
				seqchar.put(c,seqchar.get(c)+1);
			}else {
				seqchar.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer>entry:seqchar.entrySet()){
			System.out.println("Character - "+entry.getKey()+" "+ "value - "+entry.getValue());  
		}
	} 






}


