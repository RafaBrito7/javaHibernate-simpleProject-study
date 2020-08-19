package projeto.hibernate.jdev;

import org.junit.Test;

import projeto.hibernate.jdev.util.HibernateUtil;

public class TestHibernate {

	@Test
	public void testeHibernateUtil() {
		HibernateUtil.getEntityManager();
	}
}
