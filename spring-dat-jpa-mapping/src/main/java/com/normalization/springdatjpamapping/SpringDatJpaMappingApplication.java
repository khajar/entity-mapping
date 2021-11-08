package com.normalization.springdatjpamapping;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//import com.normalization.springdatjpamapping.entity.Agent;
@EnableTransactionManagement
@SpringBootApplication
public class SpringDatJpaMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatJpaMappingApplication.class, args);
		
//		Agent agent = new Agent();
//		agent.setAgentName("agent");
//		
//		SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		
//		session.save(agent);
//		
//				
//		
//		session.getTransaction().commit();
//		session.close();
	}

}
