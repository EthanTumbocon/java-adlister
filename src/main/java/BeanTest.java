
import Models.Albums;
import Models.Author;
import Models.Product;
import Models.Quote;
import daos.DaoFactory;

import java.util.ArrayList;

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

        Quote firstQuote = new Quote();
        firstQuote.setId(1L);
        firstQuote.setAuthor(author);
        firstQuote.setContent("I love deadlines. I love the whooshing noise the y make as they go by.");
        System.out.println("quote.getAuthor() = " + firstQuote.getAuthor().getFirstName());

        Quote secondQuote = new Quote();
        secondQuote.setId(2L);
        secondQuote.setAuthor(author);
        secondQuote.setContent("Don't panic.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(firstQuote);
        quotes.add(secondQuote);

        for (Quote q: quotes){
            System.out.println("quote.getContent() = " + q.getContent());
            System.out.println("quote.getAuthor().getFirstName() = " + q.getAuthor().getFirstName());
            System.out.println("quote.getAuthor().getLastName() = " + q.getAuthor().getLastName());
        }

        DaoFactory.getProductsDao().all();
        DaoFactory.getProductsDao().insert(new Product());
    }
}
