package zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class FinancialData {

    private static final Map<String, FinancialData> data;

    private final String name;
    private final double value;

    static {
        data = new ConcurrentHashMap<>();
        try {
            String path = FinancialData.class.getResource("data.txt").toString().substring(6);
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                String[] pair = line.split(":");
                data.put(pair[0], new FinancialData(pair[0], Double.parseDouble(pair[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private FinancialData(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public static FinancialData getInstance(String name) {
        return data.get(name);
    }

    public double getValue() {
        return value;
    }
}

