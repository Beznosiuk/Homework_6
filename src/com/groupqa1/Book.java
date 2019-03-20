package com.groupqa1;

public class Book {
   private int ID, year, pages;
   private String tittle, author, publishingHouse;
   private double price;

   public Book(int ID, int year, double price, int pages, String tittle, String author, String publishingHouse) {
      this.ID = ID;
      this.year = year;
      this.price = price;
      this.pages = pages;
      this.tittle = tittle;
      this.author = author;
      this.publishingHouse = publishingHouse;
   }

   public void view(){
      System.out.println("ID: " + ID + "; " +
                        "Tittle: " + tittle + "; " +
                        "Author: " + author + "; " +
                        "Publishing house: " + publishingHouse + "; " +
                        "Year: " + year + "; " +
                        "Pages: " + pages + "; " +
                        "Price: " + price + ";");
   }

   public String getAuthor() {
      return author;
   }

   public int getYear() {
      return year;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
