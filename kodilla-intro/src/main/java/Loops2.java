public class Loops2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }int i = 0;
    {while (i <= 10) {
        System.out.println(i);
        i++;
    }}}

