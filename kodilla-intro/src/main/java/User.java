public class User {
    private String name;
    private int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main (String [] Args) {
        User oskar = new User("Oskar", 24); //obiekty
        User mateusz = new User("Mateusz", 26);
        User adrian = new User("Adrian", 36);
        User marta = new User("Marta", 40);
        User justyna = new User("Justyna", 19);
        User[] users = {oskar, mateusz, adrian, marta, justyna}; // przypisuje obiekty do tablicy

        int sum = 0; //kiedy przypisujemy wartosc zmiennej a kiedy nie?
        double avg = 0;

        for (int i = 0; i < users.length; i++) {
            sum += users[i].age; // += oznacza to samo co sum=sum+users[i].age
        }
        avg = (double) sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < avg) {
                System.out.println(users[i].name);
            }
        }
    }
}