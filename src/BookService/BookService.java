package BookService;

import HW1.Books.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BookService {
    private final ArrayList<Book> bookList;

    public BookService()
    {
        bookList = new ArrayList<Book>();
        bookList.add(new Book(1, "Война и мир", "Толстой", 1985, 1000, 10, "Rigid"));
        bookList.add(new Book(2, "Золотой теленок", "Ильф и петров", 2000, 250, 15, "Rigid"));
        bookList.add(new Book(3, "Волшебник Изумрудного города ", " Волков ", 1999, 350, 12, "Soft"));
        bookList.add(new Book(4, "Волшебник страны Оз", "Баум", 1999, 320, 14, "Soft"));
        bookList.add(new Book(5, "Урфин Джус", "Волков", 1999, 321, 15, "Rigid"));
        bookList.add(new Book(6, "Триумфальная арка", "Ремарк", 1997, 250, 16, "Soft"));
        bookList.add(new Book(7, "Белый клык ", "Лондон", 1956, 200, 3, "Soft"));
        bookList.add(new Book(8, "Золотой теленок", "Ильф и петров", 2000, 250, 15, "Rigid"));
        bookList.add(new Book(9, "Война миров", "Уэлс", 1996, 150, 5, "Soft"));
        bookList.add(new Book(10, "Чкловек невидимка", "Уэлс", 1999, 120, 14, "Soft"));
        bookList.add(new Book(11, "Стихи", "Пушкин", 1999, 321, 15, "Rigid"));
        bookList.add(new Book(12, "Поэмы", "Пушкин", 1997, 250, 16, "Soft"));
        bookList.add(new Book(13, "Стихи", "Лермонтов", 1999, 350, 12, "Soft"));
        bookList.add(new Book(14, "Поколение П", "Пелевин", 1999, 320, 14, "Soft"));
        bookList.add(new Book(15, "Жизнь насекомых", "Пелевин", 1999, 321, 15, "Rigid"));
        bookList.add(new Book(16, ":Стихи", "Некрасов ", 1997, 250, 16, "Soft"));
        bookList.add(new Book(17, "Библия ", "БОГ", 0001, 1500, 1000, "Rigid"));
        bookList.add(new Book(18, "Двенадцать стульев", "Ильф и Петров", 2000, 250,15, "Rigid"));
        bookList.add(new Book(19, "Рассказы", "Пушкин", 1999, 350, 12, "Soft"));
        bookList.add(new Book(20, "Приключения Чиполино", "Родари", 1999, 320, 14, "Soft"));
        bookList.add(new Book(21, "Учебник английского", "Бонк", 1999, 321, 15, "Rigid"));
        bookList.add(new Book(22, "Рассказы  ", "Толстой ", 1997, 250, 16, "Soft"));
    }

    public List<Book> getCollection() {
        return bookList;
    }

    public List<Book> getByAuthor(String author)
    {
        return bookList.stream()
                .filter(e -> e.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

}
