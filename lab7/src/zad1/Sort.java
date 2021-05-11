package zad1;

import java.util.Arrays;

public class Sort implements IFile{

    @Override
    public int[] executeOperation(int[] array, int n) {
        Arrays.sort(array);
        System.out.println("po sortowaniu: ");
        return array;
    }

}
