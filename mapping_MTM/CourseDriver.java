package mapping_MTM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDriver
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s= new Student();
		s.setId(1);
		s.setName("harshika");

		Student s1=new Student();
		s1.setId(2);
		s1.setName("Riya");

		Course c1=new Course();
		c1.setId(1);
		c1.setCname("python");
		c1.setFees(10000);

		Course c2=new Course();
		c2.setId(2);
		c2.setCname(".net");
		c2.setFees(20000);

		Course c3=new Course();
		c3.setId(3);
		c3.setCname("Devops");
		c3.setFees(30000);

		List<Course> courses=new ArrayList<Course>();
		courses.add(c3);
		courses.add(c2);
		courses.add(c1);

		s.setCourses(courses);
		s1.setCourses(courses);

		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(s);
		em.persist(s1);
		et.commit();


	}
}
