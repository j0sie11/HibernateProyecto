package com.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.usuariosHibernate.Usuario;

public class DemoInsert {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Usuario.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			/*Usuario user = new Usuario("GARCIA","garcia123@gmail.com","rt567");
			
			session.save(user);*/
			
			Usuario resultado = session.get(Usuario.class, 1);
			System.out.println("Registro Obtenido" + resultado);
			
			session.getTransaction().commit();
			
			System.out.println("Proceso finalizado");
			
		}finally {
			
			factory.close();
		}
		
	}

}
