package newTest.Sample;

public class Constent {
	
	public static final String ADD_STUDENT="insert into student (id,student,collage,native) values (?,?,?,?)";
	public static final String UPDATE_STUDENT="Update student SET student=?,collage=? where id=?";
	public static final String DELETE_STUDENT="delete from student where id = ? ";
	public static final String Students_info="select * from student";
}
