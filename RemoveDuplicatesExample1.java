package logicPros;

import java.util.Arrays;
 
class RemoveDuplicatesExample1    
	{   
	    static void removeDuplicate(char str[], int length)   
	    {   
	        int index = 0;   
	        for (int i = 0; i < length; i++)   
	        {   
	              
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            } 
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	    }   
	    public static void main(String[] args)   
	    {   
	        String info = "HubinoTechnologies";  
	         
	        char str[] = info.toCharArray();  
	        System.out.println	(str);
	          
	        int len = str.length;   
	        System.out.println(len);
	          
	        removeDuplicate(str, len);   
	    }   
	}  

