package services;

import models.Book;
import models.User;

import java.util.List;

public interface LibraryService {
    String addLibraryUsersToPriorityQueue(User user);

    String addLibraryUsersToQueue(User user);

    String giveBookBasedOnPriority(String nameOfBook, List<Book>books);

    String giveBookBasedOnFifo(String nameOfBook, List<Book>books);
}
