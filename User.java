package logicPros;
//implement the hashcode and equal method
import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String passport;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}

	//getters and setters, constructor
	 @Override
	    public boolean equals(Object o) 
	  {

	        if (o == this) return true;
	        if (!(o instanceof User))
	        {
	            return false;
	        }
	        User user = (User) o;
	        return age == user.age &&
	                Objects.equals(name, user.name) &&
	                Objects.equals(passport, user.passport);
	    }

	    @Override
	    public int hashCode()
	    {
	    	
	     return Objects.hash(name, age, passport);
	    }
}
