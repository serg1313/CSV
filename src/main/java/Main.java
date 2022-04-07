package main.java;

import com.opencsv.CSVWriter;
import main.java.Employee;
import main.java.ReadCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadCSV readCSV= new ReadCSV();
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Employee e = new Employee("работник" + i, 1 + i, 1000 + i, "безработный");
            list.add(e);
        }

//
//        try(PrintWriter printWriter = new PrintWriter("test.csv")){
//            printWriter.write(list.toString());
//            printWriter.close();
//            System.out.println("done");
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }
        String s = "\n";
        FileWriter writer=null;
        try {
            writer = new FileWriter("test1.csv", true);
            Employee employee=null;
            for (int i=0; i<list.size();i++){
                employee = list.get(i);


            }
            writer.write(employee.toString()+"\n");

            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }

        //readCSV.readCSV(new File("test.csv"));
            //System.out.println(employee);


        //readCSV.readCSV(new File("test.csv"));

    }

}
