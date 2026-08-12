public class Book {
    String title;
    String author;

    void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

}

    class Main {
    public static void main(String[] args) {
        Book b = new Book();

        b.title = "Java Basics";
        b.author = "Abdulrhman";

        b.printInfo();

    }

}
