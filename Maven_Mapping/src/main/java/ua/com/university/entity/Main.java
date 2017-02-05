package ua.com.university.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary"); //���� unit name "primary" � ����� META-INF (persistence.xml)
		
		EntityManager manager = factory.createEntityManager(); //��������� ������� ��'���� Java � ��, ����� ������������ Java ����� � ������� ��
		
		manager.getTransaction().begin();
		//��� ��� ������ ������� �������� ��������� �����(��������� �������)
		
		manager.getTransaction().commit();
		
		manager.close();
		
		factory.close();



	}

}
