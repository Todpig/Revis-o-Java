//No m ́etodo main, crie instˆancias de Livro e Revista, adicione-as `a
// Biblioteca e exiba todas as publica ̧c ̃oes usando listarPublicacoes().

class Main {

    public static void main(String[] args) {
        Library biblioteca = new Library<>();
        Book book = new Book("Java", 2000, "Autor 1");
        Magazine magazine = new Magazine("Java Magazine", 100, "Autor 2");
        biblioteca.add(book);
        biblioteca.add(magazine);
        biblioteca.listPublications();
    }
}
