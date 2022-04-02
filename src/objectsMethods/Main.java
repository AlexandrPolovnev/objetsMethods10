package objectsMethods;

public class Main {
    public static void main(String[] args) {


        Author mikhailBulgakov = new Author("Михаил Булгаков");
        Author oldosHucksley = new Author("Олдос Хаксли");
        System.out.println(mikhailBulgakov.equals(oldosHucksley));

        Book masterAndMargarita = new Book("Михаил Булгаков", 504, "АСТ", 1967);
        Book braweNewWorld = new Book("Олдос Хаксли", 176, "АСТ", 1958);
        System.out.println(masterAndMargarita.equals(braweNewWorld));

        System.out.println(masterAndMargarita.hashCode());
        System.out.println(braweNewWorld.hashCode());

        masterAndMargarita.setPublicationYear(1968);
        System.out.println("Автором Романа Мастер и Маргарита является "+ masterAndMargarita);
        braweNewWorld.setPublicationYear(1959);
        System.out.println("Антиутопия О дивный новый мир автором, которой является "+ braweNewWorld);
    }
}
