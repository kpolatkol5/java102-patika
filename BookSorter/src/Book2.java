public class Book2 implements Comparable<Book2>{
    String Name;
    int Page ;

    public Book2(String name, int page) {
        Name = name;
        Page = page;
    }

    @Override
    public int compareTo(Book2 o) {
        return Integer.compare(this.Page , o.Page);
    }
}
