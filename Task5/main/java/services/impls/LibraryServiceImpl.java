package services.impls;

import models.Book;
import models.User;
import services.LibraryService;

import java.util.List;

import static models.Library.libraryUsersOnPriorityQueue;
import static models.Library.libraryUsersOnQueue;

public class LibraryServiceImpl implements LibraryService {
    BookServiceImpl bookService = new BookServiceImpl();
    @Override
    public String addLibraryUsersToPriorityQueue(User user) {
        libraryUsersOnPriorityQueue.add(user);
        return user.getName();
    }

    @Override
    public String addLibraryUsersToQueue(User user) {
        libraryUsersOnQueue.add(user);
        return user.getName();
    }

    @Override
    public String giveBookBasedOnPriority(String book, List<Book>books) {
        String result ="";
            for(User p:libraryUsersOnPriorityQueue){
                if(bookService.checkBook(book,books) != null) {
                    System.out.println(p.getName() + " has borrowed " + book);
                    result = book;
                }else {
                    System.out.println(p.getName()+ " cannot borrow "+ book+ " because it is not available");
                }
            }
            return result;

    }

    @Override
    public String giveBookBasedOnFifo(String book, List<Book>books) {
        String result ="";
        for(User p:libraryUsersOnQueue){
            if(bookService.checkBook(book,books) != null) {
                System.out.println(p.getName() + " has borrowed " + book);
                result = book;
            }else {
                System.out.println(p.getName()+ " cannot borrow "+ book+ " because it is not available");
            }
        }
        return result;
    }
}
