package br.com.proint;

import javax.persistence.Persistence;

public class TesteJPABanco {
	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("proint_reserva");
		
	}

}
