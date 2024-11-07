package org.example.task1.Book;

public class Book implements Displayable {
    private String title;
    private String author;
    private int yaer;

    //Сеттеры
public void setTitle(String title){
           this.title = title;
    }
public void setAuthor (String author) {
            this.author = author;
    }
public void setYaer (int yaer) {
    this.yaer = yaer;
    }
    //Геттеры
public String getTitle() {
    return this.title;
    }
public String getAuthor() {
    return this.author;
    }
public int getYaer()  {
    return this.yaer;
}

    @Override
    public void display() {
        System.out.println("Ваша книга: " + title + author + yaer);
    }
}
