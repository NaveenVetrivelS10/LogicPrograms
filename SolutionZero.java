	package logicPros;
//Move zeros
public class SolutionZero {
	
	
	    public void moveZeroes(int[] nums) 
	    {
	      int curr =0;
	       
	      for(int i=0 ; i<  nums.length; i++)
	        {
	            if(nums[i] !=0)
	            {
	                
	                nums[curr] = nums[i];
	                curr++;
	            }   
	        }
	        
	        for(; curr<nums.length;curr++)
	        {
	            nums[curr] = 0;
	        }
	       
	      
	        
	        
	    }
	    public static void main(String args[]) 
	    {
            int num[]= {0,1,0,2,3};
            SolutionZero sol=new SolutionZero();
            sol.moveZeroes(num);

            
           for(int number:num)
           {
        	   System.out.println(number);
           }
		}
	}

