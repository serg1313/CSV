package main.java;

public class Employee {
    private static int idObject=1;
    private int id;
    private String surname;
    private int age;
    private double salary;
    private String department;

    public Employee(String surname, int age, double salary, String department) {


        this.id = idObject++;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;

    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
//    private static synchronized long createId(){
//       return id++;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id= "+id+
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
