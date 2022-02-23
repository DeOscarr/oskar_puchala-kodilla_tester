public class Grades
{
    private int[] grades; //tablica grades
    private int size; //zmienna monitorujaca aktualna liczbe elementow tablicy

    public Grades()
    {
        this.grades = new int[10]; //10 okresla wielkosc tablicy,
        this.size = 0;
    }

    public void add (int value)
    {                             //ta metoda dodaje przekazana w argumencie ocene do tablicy
        if (this.size == 10)
        {                         //w metodzie void return przerywa dzialanie metody
            return;
        }
        this.grades[this.size] = value; //tutaj nie rozumiem dalszej czesci
        this.size ++;
    }

    public int newestGrade()
    {
        return this.grades[this.size-1];
    }

    public double average()
    {
        double sum = 0;// dlaczego przypisuje 0 do zmiennej?
        for (int i = 0; i < this.size; i++)
        {
            sum += this.grades[i]; //sum+= this.grades[i]; = sum = sum + this.grades[i];
        }
        return sum / this.size;
    }
}