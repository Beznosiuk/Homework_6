package com.groupqa1;

public class Books {
    private Book[] array;
    private int arrSize;

    public Books(int size) {
        this.arrSize = 0;
        this.array = new Book[size];
    }

    public void addBook(int ID, int year, double price, int pages, String tittle, String author, String publishingHouse) {
        if (arrSize < array.length) {
            array[arrSize] = new Book(ID, year, price, pages, tittle, author, publishingHouse);
            arrSize++;
        } else {
            System.out.println("Books array out of range");
        }
    }

    public void printBooks() {
        for (int i = 0; i < arrSize; i++) {
            array[i].view();
        }
    }

    public void changePrice(int percent) {
        for (int i = 0; i < arrSize; i++) {
            array[i].setPrice(array[i].getPrice() + array[i].getPrice() * percent / 100);
        }
    }

    public void searchByAuthor(String author) {
        for (int i = 0; i < arrSize; i++) {
            if (array[i].getAuthor().equals(author)) {
                array[i].view();
            }
        }
    }

    public void searchByYear(int year) {
        for (int i = 0; i < arrSize; i++) {
            if (array[i].getYear() > year) {
                array[i].view();
            }
        }
    }
}
