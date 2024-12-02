public class Main {
    public static void main (String[] args) {
    Author author1 = new Author("Joanne", "Rowling");
    Author author2 = new Author("Andrzej","Sapkowski");
    Book harryPotter = new Book("Harry Potter",author1,1997);
    Book theWitcher = new Book("The Witcher",author2,1986);
    System.out.println();
    System.out.println("Книга "+harryPotter.getBookName()+" написана "+harryPotter.getAuthor()+" в "+harryPotter.getPublishingYear()+".");
    System.out.println();
    System.out.println("Книга "+theWitcher.getBookName()+" написана "+theWitcher.getAuthor()+" в "+theWitcher.getPublishingYear()+".");
    System.out.println();
    theWitcher.setPublishingYear(1988);
    System.out.println("Книга "+theWitcher.getBookName()+" переизданна в "+theWitcher.getPublishingYear()+".");



    }
        public static class Author {
            private final String authorName;
            private final String authorSName;

            public Author(String authorName, String authorSName) {
                this.authorName = authorName;
                this.authorSName = authorSName;
            }

            public String getAuthorName() {
                return authorName;
            }

            public String getAuthorSName() {
                return authorSName;
            }

        }

        public static class Book {
            private final String bookName;
            private final Author author;
            private int publishingYear;

            public Book(String bookName, Author author, int publishingYear) {
                this.bookName = bookName;
                this.author = author;
                this.publishingYear = publishingYear;
            }

            public String getBookName() {
                return bookName;
            }

            public int getPublishingYear() {
                return publishingYear;
            }

            public String getAuthor() {
                return author.authorName+" "+author.authorSName;
            }

            public void setPublishingYear(int publishingYear) {
                this.publishingYear = publishingYear;
            }
        }

    }
