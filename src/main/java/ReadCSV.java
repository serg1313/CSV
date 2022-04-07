package main.java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
    public void readCSV(File file){
        List<String> list = new ArrayList<>();

            try (Scanner scanner = new Scanner(file)){
                while (scanner.hasNextLine()){
                    list.add(scanner.next());
                }
                for(String s:list){
                    System.out.print(s);
                }



        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list.toString());
    }

    private List<String> getRecordFromLine(String line){
        List<String> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(line)){
            scanner.useDelimiter(",");
            while (scanner.hasNext()){
                values.add(scanner.next());
            }

        }return values;
    }
}
