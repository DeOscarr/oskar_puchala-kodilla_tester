public class Application {
    String name;
    double age;
    double height;

    public static void main(String[] args) {
        Application application = new Application("Adam", 40.5, 178);
        application.checkAgeAndHeight();
    }
    public Application (String name, double age, double height){
        this.name = "Adam";
        this.age = 40.5;
        this.height = 178;
    }
    public void checkAgeAndHeight() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}