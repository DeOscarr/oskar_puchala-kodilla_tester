public class Notebook {
    int weight; // okreslamy jakie zmienne ma oczekiwac klasa od konstruktora; okreslamy atrybuty klasy
    int price;
    int year;

    public Notebook(int weight, int price, int year) { //konstruktor, typ i nazwa argumentow konstruktora
        this.weight = weight; //mowi konstuktorowi zeby przypisal wartosci argumentow ktore zostaly mu przekazane do atrybutow klasy
        this.price = price; //slowo this oznacza ze w ramach konstruktora chcemy sie odwolac do atrybutow klasy
        this.year = year; // jesli to pominiemy kompilator nie wie ktora zmienna do ktorej przypisac
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000)
            System.out.println("This price is good");
        else if (this.price > 1000)
            System.out.println("This notebook is expensive.");

    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        }else if (this.weight > 1000 && this.weight < 2000 )
            System.out.println("This notebook is not that heavy.");
        else if (this.weight >= 2000)
            System.out.println("This notebook is very heavy");

    }
    public void checkYearAndPrice() {
        if (this.year > 2018 && this.price <= 1200) {
            System.out.println("this is a good offer.");
        } else if (this.price < 1600 && this.year > 2020) {
            System.out.println("This is not the best offer.");
        } else {
            System.out.println("this is the best offer.");
        }
    }
}




