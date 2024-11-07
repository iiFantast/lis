package org.example.task1.Student;
import org.example.task1.Printable;

public class Student implements Printable {
    private String name;
    private int number_grade;
    private float middle_ball;

public void setName (String name) {
        this.name = name;
    }
public void setNumber_grade(int number_grade) {
        this.number_grade = number_grade;
    }
public void setMiddle_ball(float middle_ball) {
        this.middle_ball = middle_ball;
}

    @Override
    public void print() {
        System.out.println("Студент: " + name + "Номер зачетной книжки: "
                + number_grade + ","+ " Средний бал: " + middle_ball);

    }
}

