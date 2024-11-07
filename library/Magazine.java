
class Magazine extends Publication {

    public Magazine(String title, int year, String autor) {
        super(title, year, autor);
    }

    public void getResume() {
        System.out.println("Magazine: " + getTitle() + " - " + getYear());
    }
}
