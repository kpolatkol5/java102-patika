public class Book implements Comparable<Book> {

    String Name;
    int Pages;

    public Book(String name, int pages) {
        Name = name;
        Pages = pages;
    }

    @Override
    public int compareTo(Book o) {
        return this.Name.compareTo(o.Name);
    }

}
