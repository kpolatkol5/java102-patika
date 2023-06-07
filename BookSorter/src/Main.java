import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> sort1 = new TreeSet<>();
        sort1.add(new Book("A1" , 12));
        sort1.add(new Book("b1" , 12));
        sort1.add(new Book("z1" , 12));
        sort1.add(new Book("e1" , 12));
        sort1.add(new Book("k1" , 12));

        for (Book bk : sort1){
            System.out.println(bk.Name);
        }

        System.out.println("***************************************************");


        TreeSet<Book2> sort2 = new TreeSet<>();

        sort2.add(new Book2("kadir1" , 10));
        sort2.add(new Book2("kadir1" , 20));
        sort2.add(new Book2("kadir1" , 14));
        sort2.add(new Book2("kadir1" , 90));
        sort2.add(new Book2("kadir1" , 64));
        sort2.add(new Book2("kadir1" , 22));


        for (Book2 bk2 : sort2 ){
            System.out.println(bk2.Name +" "+ bk2.Page);
        }




    }
}