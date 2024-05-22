package services.impls;

import enums.Gender;
import enums.Role;
import models.Library;
import models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    LibraryServiceImpl libraryService = new LibraryServiceImpl();
    User seniorStudent = new User("David Abayomi", 25, Gender.MALE, Role.SENIOR_STUDENT);


    @Test
    void addLibraryUsersToPriorityQueue() {
        assertEquals("David Abayomi",libraryService.addLibraryUsersToPriorityQueue(seniorStudent));
    }

    @Test
    void addLibraryUsersToQueue() {
        assertEquals("David Abayomi",libraryService.addLibraryUsersToQueue(seniorStudent));
    }

    @Test
    void giveBookByPriority_IfNull() {
        assertEquals("",libraryService.giveBookBasedOnPriority("Dangerously", Library.getBookShelf()));
    }
    @Test
    void giveBookByPriority_IfNotNull() {
        assertNotNull(libraryService.giveBookBasedOnPriority("Dangerously", Library.getBookShelf()));
    }

    @Test
    void giveBookByOrder_IfNull() {
        assertEquals("",libraryService.giveBookBasedOnFifo("Dangerously", Library.getBookShelf()));
    }
    @Test
    void giveBookByOrder_IfNotNull() {
        assertNotNull(libraryService.giveBookBasedOnFifo("Dangerously", Library.getBookShelf()));
    }
}