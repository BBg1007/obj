import java.util.Objects;

public class Main {
    public static void main (String[] args) {
        Author author1 = new Author("Joanne", "Rowling");
        Author author2 = new Author("Andrzej", "Sapkowski");
        Book harryPotter = new Book("Harry Potter", author1, 1997);
        Book theWitcher = new Book("The Witcher", author2, 1986);
//    System.out.println();
//    System.out.println("Книга "+harryPotter.getBookName()+" написана "+harryPotter.getAuthor()+" в "+harryPotter.getPublishingYear()+".");
//    System.out.println();
//    System.out.println("Книга "+theWitcher.getBookName()+" написана "+theWitcher.getAuthor()+" в "+theWitcher.getPublishingYear()+".");
//    System.out.println();
//    theWitcher.setPublishingYear(1988);
//    System.out.println("Книга "+theWitcher.getBookName()+" переизданна в "+theWitcher.getPublishingYear()+".");

        System.out.println();
        Book harryPotter2 = new Book("Harry Potter", author1, 1999);
        Author author3 = new Author("Andrzej", "Sapkowski");
        System.out.println(harryPotter);
        System.out.println(harryPotter.equals(theWitcher));
        System.out.println(harryPotter.equals(harryPotter2));
        System.out.println(author2);
        System.out.println(author2.equals(author1));
        System.out.println(author3.equals(author2));
        System.out.println(author3.hashCode() + " " + author2.hashCode());
        System.out.println(harryPotter2.hashCode() + " " + harryPotter.hashCode());

    }

    }



