package org.example.task1;

public class BankAccount implements Printable  {
    private String accountNumber;
    private int balance;

//Сеттеры

public void setBalance (int balance) {
    this.balance = balance;
}
//Геттеры

 public int getBalance() {
    return this.balance;
 }

    @Override
    public void print() {
        System.out.println("Ваш баланс: " + this.balance);
    }
}
