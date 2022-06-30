package ro.siit.libraryCatalogue;

public class ArtAlbum extends Book {
    private final String paperQuality;

    /**
     * This is a constructor of a new type of object that extends the Books class. In this case the object will inherit the name and number of pages
     * parameters and will also require a paper quality parameter besides the initial ones.
     * @param name is a string parameter which describes the name of the novel album.
     * @param numberOfPages is the total number of pages of the album.
     * @param paperQuality is a string parameter describing the paper type of the album.
     */
    public ArtAlbum(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }
}
