package Tasks2;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

	public class Practese//frequencycountingproblem
	{

		public static void main(String[] args) 
		{
			String string ="Hubino";
			int count;
			char ch;
			HashMap<Character, Integer> hashMap =new HashMap<Character, Integer>();
			for(int i=0;i<string.length();i++)	
			{
				ch=string.charAt(i);
			if(hashMap.containsKey(ch))
			{
				count =hashMap.get(ch);
				count++;
				hashMap.replace(ch, count);
			}
			else 
			{
				hashMap.put(ch,1);
			}
		    }
		for(Character key:hashMap.keySet())
		{
			System.out.println(key+" ="+hashMap.get(key));
		}
			TreeMap<String, Integer> hashMap1= new TreeMap<>();
			hashMap1.putAll(hashMap1);
			
			
			for (Map.Entry<String, Integer> entry : hashMap1.entrySet())
			{
				
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
	}

