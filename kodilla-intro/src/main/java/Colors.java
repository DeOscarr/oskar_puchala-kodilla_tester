import java.util.Scanner;

public class Colors {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the first letter of the color and I will guess what color it is");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "Alabastrowy";
                case "B":
                    return "Brunatny";
                case "C":
                    return "Czarny";
                case "D":
                    return "Debowy";
                case "F":
                    return "Fioletowy";
                default:
                    System.out.println("Please pick another letter."); //dlaczego tutaj nie jest potrzebne break?
            }
        }
    }
    public static void main(String[] args) { // jak sprawić zeby program sie nie zamykal a wracal do poczatku?
        String result = getUserSelection();
        System.out.println(result);
    }
}