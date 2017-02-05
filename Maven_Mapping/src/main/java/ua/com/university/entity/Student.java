package ua.com.university.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")//�� ����'������ ������ (�������, �� ������� ���� ���� ����� student), ��� � ��� ���� ���� ���� � ����� Student
//@Table �������� ��������������� �� ������ �� ������ �������� ���� ��'� ����� ��� ������������� � SQL ����. Order, ���� ������� @Table(name="order") � ��� ���� ��
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //������������
	private int id;
	//@Column() ����� ��������� ��� ���������   �������� @Lob ��� ������� ��'��� ������
	private String name;
	private String surname;
	private int age;
	
	public Student(){ //����� ������ ������ �� �����, �� ���������� � ����������� �� ����������� (��� �������� �������� � ������ ������������� 
		              // ������� �������� �������� ����� �� ������ equals() � hashCode()
		
	}

}
