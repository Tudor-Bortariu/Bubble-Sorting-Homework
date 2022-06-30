package ro.siit.libraryCatalogue;

public class Main {
    public static void main(String[] args) {

        LibraryCatalogue newCatalogue = new LibraryCatalogue();

        Book annaKarenina = new Novel("Anna Karenina", 864, "Fiction");
        Book joyful = new ArtAlbum("Joyful", 57, "Photographic");
        Book theGreatGatsby = new Novel("The Great Gatsby", 532, "Realism");
        Book donQuixote = new Novel("Don Quixote", 1077, "Fiction");
        Book earth = new ArtAlbum("Earth", 322, "Photographic");

        newCatalogue.addBook(annaKarenina);
        newCatalogue.addBook(joyful);
        newCatalogue.addBook(theGreatGatsby);
        newCatalogue.addBook(donQuixote);
        newCatalogue.addBook(earth);

        System.out.println("The library contains the following books: " + newCatalogue.getCatalogue());

        newCatalogue.deleteBook(annaKarenina);

        System.out.println("The new library contains the following books: " + newCatalogue.getCatalogue());
    }
}
