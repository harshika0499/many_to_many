package mapping_MTM;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student 
{
	@Id
	private int id;
	private String name;
	@ManyToMany
	@JoinTable
	private List<Course> Courses;
	public List<Course> getCourses() {
		return Courses;
	}
	public void setCourses(List<Course> courses) {
		Courses = courses;
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

}
