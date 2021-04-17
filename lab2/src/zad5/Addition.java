package zad5;

public class Addition implements Solution{
    @Override
    public void solve(int a, int b) {
        int c = a + b;
        System.out.println(" wybrano dodawanie " + a + " + " + b +" = " + c);
    }
}
