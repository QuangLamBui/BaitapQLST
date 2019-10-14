
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
class Students {  
    private int id;
	private String name;
	private int age;
	public Students() {
		
	};
	public Students(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Students(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
        public void addStudents(Students student, Connection con) {
		// TODO Auto-generated method stub
		System.out.println("add_student");
		String sql = "INSERT INTO student ("
			    + " name,"
			    + " age) VALUES ("
			    + "?, ?)";

			  try {
			    // set all the preparedstatement parameters
				PreparedStatement pStatement = con.prepareStatement(sql);
			    pStatement.setString(1,student.getName());
			    pStatement.setInt(2, student.getAge());

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
