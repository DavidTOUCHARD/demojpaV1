package eu.ensup.demojpa.presentation;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.demojpa.domaine.Formation;
import eu.ensup.demojpa.domaine.Lieu;

public class DemoJpa {

	public static void main(String[] args) {

		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet m�tier
		Lieu lieu = new Lieu("Objis", "La-bas, 78230 Le Pecq");
		Formation formation = new Formation("JPA", new Date(), 3, lieu);
		Formation formation1 = new Formation("JAVA", new Date(), 3, lieu);

		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en
		// base
		em.persist(formation); // insert
		em.persist(formation1);

		// Formation formation1 = em.find(Formation.class, 1L); //select
		// Lieu lieu1 = formation1.getLieu();
		// System.out.println("La formation est : " + formation1.getTheme() + "
		// et à lieu à : " + lieu1.getAdresse());

		// 5 : Fermeture transaction
		tx.commit();

		// 6 : Fermeture unit� de travail JPA
		em.close();
		emf.close();
	}
}
