package Lesson5;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private long telNumber;
    private double pay;
    private int age;

    public Employee(String fullName, String post, String email, long telNumber, double pay, int age) {
        this.fullName = fullName;
        this.post = post;
        this. email = email;
        this.telNumber = telNumber;
        this.pay = pay;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void printPerson() {
        System.out.printf("Name person: " + fullName  +  "%nPost: " + post + "%nEmail: " + email + "%nTellNumber: " + telNumber + "%nPay: " + pay + "%nAge: " + age + "%n");
    }

}
