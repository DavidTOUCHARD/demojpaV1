package eu.ensup.demojpa.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demojpa.domaine.Formation;

public class DemoJpa {

	public static void main(String[] args) {

		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet m�tier
		Formation formation = new Formation("JPA");

		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en
		// base
		em.persist(formation);

		// 5 : Fermeture transaction
		tx.commit();

		// 6 : Fermeture unit� de travail JPA
		em.close();
		emf.close();
	}
}
