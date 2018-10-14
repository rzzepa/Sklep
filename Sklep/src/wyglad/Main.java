package wyglad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Logika.Magazyn;
import Logika.Siec;
import Logika.Sklep;
import Logika.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("baza");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		User nowy = new User("Marek","123","1234566342","a","a");
		User nowy1 = new User("Marcin","Rzepko","96051004858","r","r");
		Sklep sklep = new Sklep("Lukow","Stasia i nel","21-400");
		Magazyn magazyn = new Magazyn();
		Siec euro = new Siec();
		euro.DodajSklep(sklep);
		sklep.setMagazyn(magazyn);
		List<User> pracownicy = new ArrayList<>();
		pracownicy.add(nowy);
		nowy1.setSadmin(true);
		nowy1.setAdmin(true);
		pracownicy.add(nowy1);
		nowy.setSklep(sklep);
		nowy1.setSklep(sklep);		
		sklep.setUzytkownicy(pracownicy);
		launch(args);
		entityManager.getTransaction().begin();
		
		entityManager.persist(euro);
		entityManager.persist(nowy);
		entityManager.persist(nowy1);
		entityManager.persist(sklep);
		entityManager.persist(magazyn);
		
		entityManager.getTransaction().commit();
		
		  entityManager.close();
		  entityManagerFactory.close();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
		Parent root =FXMLLoader.load(getClass().getResource("/wyglad/Main.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
