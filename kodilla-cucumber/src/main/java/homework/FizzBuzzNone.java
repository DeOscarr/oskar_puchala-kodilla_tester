package homework;

public class FizzBuzzNone {

    public String fizzBuzzNone(int number){
        if (number % 15 == 0 && number != 0){
            return "FizzBuzz";
        }else if (number % 5 == 0 && number != 0){
            return "Buzz";
        }
        else if (number % 3 == 0 && number != 0){
            return "Fizz";
        }
        else return "None";
    }
}