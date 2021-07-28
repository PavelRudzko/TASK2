package HW1.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Books {
    private final int id;
    private final String name;
    private final String author;
    private final int year;
    private final int pages;
    private final double price;
    private final String binding;


    public Books(int id, String name, String author, int year, int pages, double price, String binding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public int getYear() {
        return year;
    }


}

class CollectionBook {
    public static void main(String[] args) {

        Books book1 = new Books(1, "Война и мир", "Толстой", 1985, 1000, 10,
                "Rigid");
        Books book2 = new Books(2, "Золотой теленок", "Ильф и петров", 2000, 250,
                15, "Rigid");
        Books book = new Books(3, "Волшебник Изумрудного города ", " Волков ", 1999, 350, 12, "Soft");
        Books book3 = new Books(4, "Волшебник страны Оз", "Баум", 1999, 320, 14, "Soft");
        Books book4 = new Books(5, "Урфин Джус", "Волков", 1999, 321, 15, "Rigid");
        Books book5 = new Books(6, "Триумфальная арка", "Ремарк", 1997, 250, 16, "Soft");
        Books book6 = new Books(7, "Белый клык ", "Лондон", 1956, 200, 3, "Soft");
        Books book7 = new Books(8, "Золотой теленок", "Ильф и петров", 2000, 250,
                15, "Rigid");
        Books book8 = new Books(9, "Война миров", "Уэлс", 1996, 150, 5, "Soft");
        Books book9 = new Books(10, "Чкловек невидимка", "Уэлс", 1999, 120, 14, "Soft");
        Books book10 = new Books(11, "Стихи", "Пушкин", 1999, 321, 15, "Rigid");
        Books book11 = new Books(12, "Поэмы", "Пушкин", 1997, 250, 16, "Soft");
        Books book12 = new Books(13, "Стихи", "Лермонтов", 1999, 350, 12, "Soft");
        Books book13 = new Books(14, "Поколение П", "Пелевин", 1999, 320, 14, "Soft");
        Books book14 = new Books(15, "Жизнь насекомых", "Пелевин", 1999, 321, 15, "Rigid");
        Books book15 = new Books(16, ":Стихи", "Некрасов ", 1997, 250, 16, "Soft");
        Books book16 = new Books(17, "Библия ", "БОГ", 0001, 1500, 1000, "Rigid");
        Books book17 = new Books(18, "Двенадцать стульев", "Ильф и Петров", 2000, 250,
                15, "Rigid");
        Books book18 = new Books(19, "Рассказы", "Пушкин", 1999, 350, 12, "Soft");
        Books book19 = new Books(20, "Приключения Чиполино", "Родари", 1999, 320, 14, "Soft");
        Books book20 = new Books(21, "Учебник английского", "Бонк", 1999, 321, 15, "Rigid");
        Books book21 = new Books(22, "Рвссказы  ", "Толстой ", 1997, 250, 16, "Soft");
        List<Books> bookList = new ArrayList<>();
        List<Books> bookList1 = new ArrayList<>();
        List<Books> bookList2 = new ArrayList<>();
        List<Books> bookList3 = new ArrayList<>();

        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);
        bookList.add(book11);
        bookList.add(book12);
        bookList.add(book13);
        bookList.add(book14);
        bookList.add(book15);
        bookList.add(book16);
        bookList.add(book17);
        bookList.add(book18);
        bookList.add(book19);
        bookList.add(book20);
        bookList.add(book21);

        bookList1 = bookList.stream().filter(element
                -> element.getYear() > 1990 && element.getYear() < 2000)
                .collect(Collectors.toList());
        System.out.println(bookList1);
        System.out.println();


        bookList2 = bookList.stream().filter(element
                -> element.getAuthor().equals("Пушкин"))
                .collect(Collectors.toList());
        System.out.println(bookList2);
        System.out.println();
        System.out.println();

        bookList3 = bookList.stream().filter(element
                -> element.getName().equals("Стихи"))
                .collect(Collectors.toList());
        System.out.println(bookList3);

    }
}
