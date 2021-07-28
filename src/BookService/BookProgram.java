package BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookProgram {
    public static void main(String[] args) {
        List<Book> bookList1 = new ArrayList<>();
        List<Book> bookList3 = new ArrayList<>();

        BookService books = new BookService();


        bookList1 = books.getCollection().stream().filter(element
                -> element.getYear() > 1990 && element.getYear() < 2000)
                .collect(Collectors.toList());
        System.out.println(bookList1);
        System.out.println();


        List bookList2 = books.getByAuthor("Пушкин");
        System.out.println(bookList2);

        System.out.println();
        System.out.println();
        bookList3 = books.getCollection().stream().filter(element
                -> element.getName().equals("Стихи"))
                .collect(Collectors.toList());
        System.out.println(bookList3);
    }
}
