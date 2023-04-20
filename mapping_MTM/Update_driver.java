package mapping_MTM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_driver 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s =em.find(Student.class, 1);
		if(s!=null)
		{
			
			s.setName("abc");
			
			Course c = new Course();
			c.setId(1);
			c.setCname("javascript");
			c.setFees(500000);
		}
		else
		{
			System.out.println("invalid id");
		}
		et.begin();
		em.merge(s);
		et.commit();

		System.out.println("data updated successfully");
		
		
	}
	
}
