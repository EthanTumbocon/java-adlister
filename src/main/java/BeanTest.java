import Models.Albums;
import Models.Author;
import Models.Quote;

public class BeanTest {
    public static void main(String[] args) {
        Albums albums = new Albums();
        albums.setId(1L);
        albums.setName("Loose");
        albums.setArtist("Nelly Furtado");
        albums.setGenre("Pop,R&B");
        albums.setReleaseDate(2006);
        albums.setSales(52000);

        System.out.println("albums.getName() =  " + albums.getName());
        System.out.println("albums.getArtist() = " + albums.getArtist());

        Author author = new Author();
        Author.setId(1L);
        Author.setFirstName("Douglas");
        Author.setLastName("Adams");

        Quote quote = new Quote();
        quote.setId(1L);
        quote.setAuthor(author);
        quote.setContent("I love deadlines. I love the whooshing noise the y make as they go by.");
        System.out.println("quote.getAuthor() = " + quote.getAuthor().getFirstName());

    }
}
