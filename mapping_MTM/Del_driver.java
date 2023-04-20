package mapping_MTM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Del_driver
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();


		Student s=em.find(Student.class,2);
		if(s!=null)
		{
			et.begin();
			em.remove(s);
			et.commit();
		}
		else
		{
			System.out.println("invalid id");   
		}
	}
}
