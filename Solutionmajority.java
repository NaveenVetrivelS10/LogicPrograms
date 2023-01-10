package logicPros;
class Solutionmajority {
	
	
	
    public int majorityElement(int[] nums) {
     
        int count=1;
        int majority = nums[0];
        for(int i =1; i<nums.length;i++)
        {
            if(majority == nums[i])
                count++;
            else
                count--;
            if(count == 0 )
            {
                majority = nums[i];
                count =1;
            }
            
        }
        count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(majority == nums[i])
                count++;
        }
        
        if(count > (nums.length/2))
        {
        	 System.out.println(majority);
            return majority;
        }
           
        else
            return -1;
      
        
    }
        public static void main(String args[]) 
        {
        	
        	int nums []= {2,2,1,1,1,2,2};
        	Solutionmajority majoritys=new Solutionmajority();
        	majoritys.majorityElement(nums);
        	
        
        	
        	
         	 
            
        	
        	
        	
  	
        }
        
       
}