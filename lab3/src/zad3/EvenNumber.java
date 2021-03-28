package zad3;

public class EvenNumber implements Observer{
    int key;

    @Override
    public void update(int k){
        System.out.println("Ten obserwator obserwuje liczby parzyste");
        if(k % 2 == 0){
            key = k;
            printResult();
        }
    }

    public void printResult(){
        System.out.println("Wykryto liczbę parzystą " + key);
    }
}
