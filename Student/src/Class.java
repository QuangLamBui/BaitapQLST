
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
public class Class {
    public int Id_class;
    public String Name_class;
	public Class() {
		
	}
	public Class(String name_class)
	{
		this.Name_class = name_class;
	}
	public Class(int id_class, String name_class) {
		this.Id_class = id_class;
		this.Name_class = name_class;
	}
	public int getId() {
		return Id_class;
	}
	public void setId(int id_class) {
		this.Id_class = id_class;
	}
	public String getClassName() {
		return Name_class;
	}
	public void setClassName(String Name_class) {
		this.Name_class = Name_class;
	}
        public void addClass(Class _class, Connection con) {
		// TODO Auto-generated method stub
		System.out.println("add_class");
		String sql = "INSERT INTO class ("
			    + " class_name) VALUES ("
			    + "?)";

			  try {
			    // set all the preparedstatement parameters
				PreparedStatement pStatement = con.prepareStatement(sql);
			    pStatement.setString(1, _class.getClassName());

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
