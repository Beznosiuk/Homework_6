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

    public void addBook(Book book) {
        if (arrSize < array.length) {
            array[arrSize] = book;
            arrSize++;
        } else {
            System.out.println("Books array out of range");
        }
    }

    public void printBooks() {
        if (arrSize == 0) {
            System.out.println("Books array is empty");
        } else {
            for (int i = 0; i < arrSize; i++) {
                array[i].view();
            }
        }
    }

    public void changePrice(int percent) {
        for (int i = 0; i < arrSize; i++) {
            array[i].setPrice(array[i].getPrice() + array[i].getPrice() * percent / 100);
        }
    }

    public Books searchByAuthor(String author) {
        int findCount = 0;
        for (int i = 0; i < arrSize; i++) {
            if (array[i].getAuthor().equals(author)) {
                findCount++;
            }
        }
        Books findBooks = new Books(findCount);
        if (findCount > 0) {
            for (int i = 0; i < arrSize; i++) {
                if (array[i].getAuthor().equals(author)) {
                    findBooks.addBook(array[i]);
                }
            }
        }
        return findBooks;
    }

    public Books searchByYear(int year) {
        int findCount = 0;
        for (int i = 0; i < arrSize; i++) {
            if (array[i].getYear() > year) {
                findCount++;
            }
        }
        Books findBooks = new Books(findCount);
        if (findCount > 0) {
            for (int i = 0; i < arrSize; i++) {
                if (array[i].getYear() > year) {
                    findBooks.addBook(array[i]);
                }
            }
        }
        return findBooks;
    }
}
