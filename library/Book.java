
class Book extends Publication {

    public Book(String title, int year, String autor) {
        super(title, year, autor);
    }

    public void getResume() {
        System.out.println("Book: " + getTitle() + " - " + getAutor());
    }
}
