// Create a class Book with the following information.
// Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
// [Assumption: Each book will be written by exactly one Author]
// Parameterized Constructor: To initialize the variables
// Getter methods  for all the member variables

// In the main method, create a book object and print all details of the book (including the author details)

import java.util.Scanner;

class Book {
    String name,author;
    double price;
    int qtyInStock;

    Book(){
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        author= sc.nextLine();
        price=sc.nextDouble();
        qtyInStock=sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
}

class BookDetails{
    public static void main(String[] args) {
        Book obj = new Book();
        System.out.println("The book details are given below:-");
        System.out.println(obj.getName());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getPrice());
        System.out.println(obj.getQtyInStock());
    }
}