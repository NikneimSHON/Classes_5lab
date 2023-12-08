public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Володин Олег Владимирович", "000000", "Факультет химии", "01.01.1997", "+7-123-456-78-90");
        Reader reader2 = new Reader("Котов Артём Анатольевич", "000097", "Факультет информатике", "05.05.1995", "+7-987-654-32-10");

        reader1.takeBook(3);
        reader1.takeBook("Басни", "Словарь", "Энциклопедия");

        Book book1 = new Book("Басни", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");
        reader1.takeBook(book1, book2, book3);

        reader2.returnBook(2);
        reader2.returnBook("Книга1", "Книга2");

        Book book4 = new Book("Книга1", "Автор1");
        Book book5 = new Book("Книга2", "Автор2");
        reader2.returnBook(book4, book5);

    }
}