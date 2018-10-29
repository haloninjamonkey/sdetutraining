package labs;

import java.util.Random;

/**
 * Created by patrick.duff on 10/25/2018.
 */
public class StudentDatabaseApp {
    public static void main(String[] args) {
        StudentDatabase student1 = new StudentDatabase("Patrick", "123456789");
        //StudentDatabase student2 = new StudentDatabase("Steve", "234567890");
        student1.enroll("Math");
        student1.checkBalance();
        student1.pay(200);
        student1.checkBalance();

    }
}

class StudentDatabase{

    private String name;
    private String SSN;
    private static final String emailSuffix = "@learningplace.edu";
    private int iD = 4031;
    private String userId;
    private boolean enrolled = false;
    private double pay;
    private double checkBalance;
    private String showCourses;
    private String city;
    private double phone;
    private String state;
    public String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;


    public StudentDatabase(String name, String SSN) {
        this.SSN = SSN;
        this.name = name;
        setEmail(name);
        setUserId();
        System.out.println(toString());
    }

    public void setEmail(String name) {
        this.name = name;
    }
    public String getEmail(){
        return name + "" + emailSuffix;
    }
    public void setUserId(){
        //int random = (int) (Math.random() * 10000);
        Random random = new Random();
        int randomNum = random.nextInt((9000 - 1000) + 1) + 1000;
        this.userId = iD + "" + randomNum + SSN.substring(5);
    }
    public String getUserId() {
        return this.userId;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setPhone(double phone) {
        this.phone = phone;
    }
    public double getPhone() {
        return phone;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void enroll(String course) {
        this.courses = this.courses + " " + course;
        balance = balance + costOfCourse;
    }
    public void pay(int amount) {
        balance = balance -amount;
    }
    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
    public void showCourses() {

    }
    @Override
    public String toString() {

        return "Student enrolled: " + name + "\nEmail: " + getEmail() + "\nStudent ID: " + getUserId();

    }
}

