package org.example;

import org.example.task1.BankAccount;
import org.example.task1.Book.Book;
import org.example.task1.Car.Car;
import org.example.task1.Clock.Clock;
import org.example.task1.Point.Point;
import org.example.task1.Student.Student;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount () ;
        account1.setBalance(10000);
//        int balance1 = account1.getBalance();
//        System.out.println(balance1);
        account1.print();

// Книги
        Book info = new Book();
        info.setTitle("Капитал ");
        info.setAuthor("Маркс ");
        info.setYaer(1994);
//        String title1 = info.getTitle();
//        String author1 = info.getAuthor();
//        int year1 = info.getYaer();
//        System.out.println(title1 + author1 + year1);
        info.display();

// Студенты
        Student info_student = new Student();
        info_student.setName("Иосиф, ");
        info_student.setNumber_grade(479);
        info_student.setMiddle_ball(4.8f );
        info_student.print();

 //Точка на плоскости
        Point coord = new Point ();
        coord.setCoordinate_X(4);
        coord.setCoordinate_Y(10);
        coord.moveUp();
        coord.moveDown();
        coord.moveLeft();
        coord.moveRight();

 //Часы
        Clock time = new Clock();
        time.setHour(16);
        time.setMinute(58);
        time.setSecond(60);
        time.readTime();
        time.tick(45);

 //Автомобиль
        Car car1 = new Car ();
        car1.setMark("Ауди");
        car1.setModel("А4");
        car1.setAge_car(1987);
        car1.start();
        car1.stop();
        car1.drive(876);
    }
}