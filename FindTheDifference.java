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
        int charCodeS = 0;
        int charCodeT = 0;
        
        for(int i = 0; i < s.length(); i++) 
        {
        	charCodeS=charCodeS + (int)(s.charAt(i));
        }
        
        for(int i = 0; i < t.length(); i++) {
        	charCodeT=charCodeT + (int)(t.charAt(i));
           
        }
        System.out.println((char)(charCodeT - charCodeS));
       return (char)(charCodeT - charCodeS);
    }
}
