package models;

import services.impls.RoleComparatorImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Library {

    public static List<User> libraryUsersOnQueue= new ArrayList<>();
    public static PriorityQueue<User> libraryUsersOnPriorityQueue =new PriorityQueue<>(new RoleComparatorImpl());

    public static List<Book> getBookShelf(){
        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(new Book(1, "Principles of Java", "Paul", 1));
        bookshelf.add(new Book(2, "Java OOP", "Hamlet", 2));
        bookshelf.add(new Book(3, "Introduction to Biology", "John", 5));
        bookshelf.add(new Book(4, "Bible", "King James", 7));
        bookshelf.add(new Book(5, "Healthy Living", "Harry", 3));
        return bookshelf;
    }

}
