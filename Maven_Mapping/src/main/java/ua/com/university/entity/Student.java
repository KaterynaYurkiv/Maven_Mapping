package ua.com.university.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")//не обов'€зково писати (вказуЇмо, що таблиц€ буде мати назву student), але ≥ без того вона мала б назву Student
//@Table доц≥льно використовувати бо ≥нколи ми можемо створити клас ≥м'€ €кого вже зарезервоване в SQL напр. Order, тому напишем @Table(name="order") ≥ все буде ок
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //авто≥нкремент
	private int id;
	//@Column() можна вставл€ти тут обмеженн€   анотац≥€ @Lob дл€ великих об'Їм≥в тексту
	private String name;
	private String surname;
	private int age;
	
	public Student(){ //Їдина сувора вимога до класу, що збер≥гаЇтьс€ Ч конструктор за замовчанн€м (ƒл€ коректноњ повед≥нки у де€ких застосуванн€х 
		              // потр≥бно прид≥лити особливу увагу до метод≥в equals() ≥ hashCode()
		
	}

}
