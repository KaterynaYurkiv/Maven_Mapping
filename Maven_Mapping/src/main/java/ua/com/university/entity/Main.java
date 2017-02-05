package ua.com.university.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary"); //шукає unit name "primary" в папці META-INF (persistence.xml)
		
		EntityManager manager = factory.createEntityManager(); //менеджери маплять об'єкти Java в БД, тобто перетворюють Java класи в таблиці БД
		
		manager.getTransaction().begin();
		//тут вже будуть команди створити екземпляр класу(заповнити таблицю)
		
		manager.getTransaction().commit();
		
		manager.close();
		
		factory.close();



	}

}
