package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	static { // criando uma única vez. 
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("proint_reserva");
		}
	}
	
	public static EntityManager getEntityManager() { //retornar o entity responsável por dar a persistencia. através desse 
		
		return factory.createEntityManager(); // conseguimos fazer gravação e edição.
		
	}

}
