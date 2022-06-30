package ro.siit.libraryCatalogue;

import java.util.ArrayList;

public class LibraryCatalogue {

    ArrayList<Book> catalogue = new ArrayList<>();

    public ArrayList<Book> getCatalogue() {
        return catalogue;
    }

    /**
     * This code ads a book object to an array list.
     * @param book defines the object you want to add to the array list.
     */
    public void addBook (Book book){
        catalogue.add(book);
    }

    /**
     * This code removes a book object from an array list.
     * @param book defines the object you want to remove from the array list.
     */
    public void deleteBook (Book book){
        catalogue.remove(book);
    }

}
