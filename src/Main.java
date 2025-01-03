public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Петя", "Табуреткин");
        Author author2 = new Author("Афанасий", "Восемьнасемь");

        Book book1 = new Book("Просто книга", author1, 1902);
        Book book2 = new Book("Непросто книга", author2, 1782);

        System.out.println(book1);
        System.out.println(book2);
    }
}