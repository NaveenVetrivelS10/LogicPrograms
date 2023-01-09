package Task;

public class Frequency 
{

	public static void main(String[] args) 
	{
		          //0123456789
		String str="aaacccmrds";
		          // 00 00
		int count =1;
		int i,j;
		char string[]=str.toCharArray();
		for(i=0;i<str.length();i++)//0,1,2,3//4,5,6,//7//
		{
			if(string[i] !='0')
			{
				count=1;
				for(j=1+i;j<str.length();j++)//1,2,//3,4,5,6//7,8//8
				{
					if(string[i]==string[j])//aa,aa,cc,cc,//mr,md,ms//rd,rs//
					{
						count++;//2,3//2,3
						string[j]='0';
					}
		
				}
				System.out.println(string[i]+"-"+count);
			}
			
		}
	}
}
