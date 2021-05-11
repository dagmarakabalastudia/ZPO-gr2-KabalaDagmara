package zad1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File implements IFile{

    @Override
    public int[] executeOperation(int[] array, int n) {
        try {
            int m = n +1;
            String path = File.class.getResource("data.txt").toString().substring(m);
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if(array.length != i){
                    array[i] = Integer.parseInt(line);
                    i++;
                }
            }
            System.out.println("zczytano wartości z pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

}
