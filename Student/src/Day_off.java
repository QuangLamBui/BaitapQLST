/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author buiqu
 */
public class Day_off {
    private int id;
	private int studentId;
	private String dayOff;
	public Day_off() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Day_off(int student_id, String day_of) {
		super();
		studentId = student_id;
		this.dayOff = day_of;
	}
	public Day_off(int id, int student_id, String day_off) {
		super();
		this.id = id;
		studentId = student_id;
		this.dayOff = day_off;
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
	public String getDayOff() {
		return dayOff;
	}
	public void setDayOff(String dayOff) {
		this.dayOff = dayOff;
	}
}
