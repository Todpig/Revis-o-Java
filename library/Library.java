
import java.util.ArrayList;

class Library<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T publication) {
        list.add(publication);
    }

    public void remove(T publication) {
        list.remove(publication);
    }

    public void listPublications() {
        for (T publication : list) {
            if(publication instanceof Book) {
                ((Book) publication).getResume();
            } else if(publication instanceof Magazine) {
                ((Magazine) publication).getResume();
            }
        }
    }

}
