package zad1;

import java.util.Arrays;

public class FileFacade {
    private final IFile sort;
    private final IFile getFromKeyboard;
    private final IFile getFromFile;
    public int n;
    private int[] outputArray;

    public FileFacade(int n) {
        this.sort = new Sort();
        this.getFromKeyboard = new Keyboard();
        this.getFromFile = new File();
        this.n = n;
        this.outputArray = new int[n];
    }

    public void sortArray(){
        this.outputArray = sort.executeOperation(outputArray, n);
    }

    public void getValuesFromKeyboard(){ this.outputArray = getFromKeyboard.executeOperation(outputArray, n);}

    public void getValuesFromFile(){
        this.outputArray = getFromFile.executeOperation(outputArray, n);
    }

    public void PrintArray(){
        System.out.println(Arrays.toString(this.outputArray));
    }

}
