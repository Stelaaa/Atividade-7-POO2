package Application;

import javax.persistence.EntityManager;

import entities.Automovel;
import entities.Marca;
import entities.Modelo;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("meu-projeto");

        EntityManager entityManager = (EntityManager) entityManagerFactory.createEntityManager();

            Marca marca = new Marca("Volkswagen");
            Modelo modelo = new Modelo("Kombi", 200, marca);
            Automovel automovel = new Automovel(2022, 2023, "Observações", 25000.00, 10000, modelo);

            entityManager.persist(automovel);

            System.out.println("Automóvel cadastrado com sucesso:");
            System.out.println(automovel);
    }

}
