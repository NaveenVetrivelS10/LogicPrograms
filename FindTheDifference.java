package logicPros;

public class FindTheDifference {

   public static void main(String[] args) 
   {
		String a = "xyz";
		   String b = "xyza";
	   FindTheDifference findTheDifference = new FindTheDifference();
	   findTheDifference.findTheDifferences(a, b);
   }
   
    public char findTheDifferences(String s, String t) 
    {
        int charCodeA = 0;
        int charCodeB = 0;
        
        for(int i = 0; i < s.length(); i++) 
        {
        	charCodeA=charCodeA + (int)(s.charAt(i));
        }
        
        for(int i = 0; i < t.length(); i++) {
        	charCodeB=charCodeB + (int)(t.charAt(i));
           
        }
        System.out.println((char)(charCodeB - charCodeA));
       return (char)(charCodeB - charCodeA);
    }
}
