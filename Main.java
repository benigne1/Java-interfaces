public class Main {
    public static void main(String[] args) {
        Member[] members = {
            new PublisherMember("M001", "Kigali Press", "Kigali Press Ltd"),
            new StudentMember("M002", "Aline", "STU2025"),
            new StudentMember("M003", "Jean", null),
            new LibrarianMember("M004", "Grace", "LIB-01")
        };

        for (Member m : members) {
            System.out.println(m);
        }

        Book b = new Book("978-1", "Intro to IS", "J. Smith");
        System.out.println(b);
    }
}
