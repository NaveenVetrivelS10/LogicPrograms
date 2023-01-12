package logicPros;
//implement the hashcode and equal method
import java.util.Objects;

public class HashcodeTest 
{
 public static void main(String []args)
 {
	 User user1 = new User();
	 user1.setName("Naveen");
	 user1.setAge(23);
	 user1.setPassport("111222333");
	 System.out.println(user1.hashCode());
	 
	 User user2 = new User();
	 user2.setName("Naveen");
	 user2.setAge(23);
	 user2.setPassport("111222333");
	    System.out.println(user1.equals(user2));
	   System.out.println(user1==user2);
	   System.out.println(user1);
	   System.out.println(user2);
 
 }
   

}

