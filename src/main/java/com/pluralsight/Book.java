package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String checkedOutTo, String isbn, String title, boolean isCheckedOut) {
        this.id = id;
        this.checkedOutTo = checkedOutTo;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        this.checkedOutTo=name;
        this.isCheckedOut=true;
    }

    public void checkIn(){
        this.isCheckedOut=false;
        this.checkedOutTo="";

    }
}
