package org.example.task1.Car;

public class Car implements Drivable{
    private String mark;
    private String model;
    private  int age_car;

    public void setMark (String mark) {
        this.mark = mark;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public void setAge_car (int age_car) {
        this.age_car = age_car;
    }

    public String getMark () {
        return this.mark;
    }
    public String getModel() {
        return this.model;
    }
    public int getAge_car () {
        return this.age_car;
    }

    @Override
    public void start() {
        System.out.println("Возраст машинки: " + (2024 - age_car));
    }

    @Override
    public void stop() {
        System.out.println("Статическая информация: " + model + " " + mark );
    }

    @Override
    public void drive(int distance) {
        System.out.println("Сколько проехала кобылка: " + distance + " км");

    }
}
