package mapping_MTM;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch_Course_details 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many")	;
		EntityManager em=emf.createEntityManager();

		Student s=em.find(Student.class, 2);
		System.out.println(s.getId());
		System.out.println(s.getName());
	   
		List<Course>courses=s.getCourses();
		for(Course cc: courses)
		{
			System.out.println(cc.getCname());
		}

	}
}
