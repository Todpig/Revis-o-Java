
abstract class Publication {

    private String title;
    private int year;
    private String autor;

    public Publication(String title, int year, String autor) {
        this.title = title;
        this.year = year;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAutor() {
        return autor;
    }

    abstract void getResume();
}
