/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author buiqu
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = ConnectionDB.getMyConnection();
                
        }   
        public static int inputNumber = 0;
        public static int employeeNo = 0;
         private static Students input_Student()
	{
		Students st = new Students();
		Scanner inputName = new Scanner(System.in);
		System.out.println("input name:");
		String name = inputName.nextLine();
		st.setName(name);
		System.out.println("input age: ");
		Scanner inputAge = new Scanner(System.in);
		int age = inputAge.nextInt();
		st.setAge(age);
		return st;
	}
         private static Class input_Class()
	{
		Class cl = new Class();
		Scanner inputName = new Scanner(System.in);
		System.out.println("please input class name:");
		String className = inputName.nextLine();
		cl.setClassName(className);
		return cl;
	}
         private static Class_ST input_Student_Class()
	{
		Class_ST sc = new Class_ST();
		Scanner inputId = new Scanner(System.in);
		System.out.println("please input studentId: ");
		int studentId = inputId.nextInt();
		sc.setStudentId(studentId);
		System.out.println("please input studentId: ");
		int classId = inputId.nextInt();
		sc.setClassId(classId);
		return sc;
	}
}
       
