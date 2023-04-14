package example;

import java.util.ArrayList;

public class Book {
    private final int id;
    private final String name;

    public Book(int id, String name){
        this.id = id;
        this.name = name;
    }


    public int getBookId(){
        return id;
    }

    public String getBookName(){
        return name;
    }

    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();
        Book bookOne = new  Book(1,"alin");
        Book bookTwo = new Book(2,"sanoop");
        arrayList.add(bookOne);
        arrayList.add(bookTwo);

        arrayList.forEach(book -> System.out.println(book.getBookId()));
        arrayList.forEach(book -> System.out.println(book.getBookName()));

        for (Book book:arrayList) {
            System.out.println(book.getBookId());
            System.out.println(book.getBookName());
        }

        /*System.out.println(bookOne.getBookId());
        System.out.println(bookTwo.getBookId());*/
    }

}
