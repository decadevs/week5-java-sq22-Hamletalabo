import enums.Gender;
import enums.Role;
import models.Library;
import models.User;
import services.impls.LibraryServiceImpl;



public class LibrarySystem {
    public static void main(String[] args) {

        LibraryServiceImpl libraryService = new LibraryServiceImpl();


        User seniorStudent = new User("Timi John", 12, Gender.MALE, Role.SENIOR_STUDENT);
        User teacher = new User("Johnmary ",34, Gender.MALE,Role.TEACHER);
        User juniorStudent= new User(" Tinubu", 10, Gender.FEMALE, Role.JUNIOR_STUDENT);


        libraryService.addLibraryUsersToQueue(seniorStudent);
        libraryService.addLibraryUsersToQueue(teacher);
        libraryService.addLibraryUsersToQueue(juniorStudent);

        libraryService.addLibraryUsersToPriorityQueue(seniorStudent);
        libraryService.addLibraryUsersToPriorityQueue(teacher);
        libraryService.addLibraryUsersToPriorityQueue(juniorStudent);

        System.out.println("\n");
        System.out.println("Book Given Based On Priority");
        libraryService.giveBookBasedOnPriority("Principles of Java", Library.getBookShelf());

        System.out.println("\n");
        System.out.println("Book Given Based On Order");
        libraryService.giveBookBasedOnFifo("Introduction to Biology", Library.getBookShelf());

    }
}
