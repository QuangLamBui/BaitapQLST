
import java.sql.Connection;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author buiqu
 */
public class Class_ST {
    private int id;
	private int studentId;
	private int classId;
	public Class_ST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class_ST(int id, int studentId, int classId) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.classId = classId;
	}
	public Class_ST(int studentId, int classId) {
		super();
		this.studentId = studentId;
		this.classId = classId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public void addStudentClass(Class_ST sClass, Connection con) {
		// TODO Auto-generated method stub
		System.out.println("add_student_class");
		String sql = "INSERT INTO StudentClass ("
			    + " student_id,"
			    + " class_id) VALUES ("
			    + "?, ?)";

			  try {
			    // set all the preparedstatement parameters
				PreparedStatement pStatement = con.prepareStatement(sql);
			    pStatement.setInt(1, sClass.getStudentId());
			    pStatement.setInt(2, sClass.getClassId());

			    // execute the preparedstatement insert
			    int rowsAffected = pStatement.executeUpdate();
			    System.out.println("Sql insert : " + sql);
				System.out.println("Row Count affected = " + rowsAffected);
			    pStatement.close();
			  }
			  catch (Exception e) {
				// TODO: handle exception
				  System.out.println(e.getMessage());
			}
	}
}
