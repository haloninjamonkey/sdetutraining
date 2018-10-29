package labs;

/**
 * Created by patrick.duff on 10/29/2018.
 */
//Instructor example for student database app
public class Lab2 {

    public static void main(String[] args) {
        //Create a student
        Student stu1 = new Student("Patrick", "123456789");
        stu1.enroll("Eng255");
        stu1.enroll("Math101");
        stu1.enroll("Hist201");
        System.out.println(stu1.toString());
        stu1.payTuition(600);

        Student stu2 = new Student("George", "456789123");
        stu2.enroll("Eng200");
        stu2.enroll("Sci101");
        System.out.println(stu2.toString());

        Student stu3 = new Student("Melinda", "789456123");
        stu3.enroll("CompSci101");
        System.out.println(stu3.toString());
        stu3.payTuition(800);
    }
}

class Student {
    //Properties
    private static int iD = 1000;
    private String userId;
    private String name;
    private String ssn;
    private String email;
    private String phone;
    private String city;
    private String state;
    public String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;


    public Student(String name, String ssn) {
        iD++;
        this.name = name;
        this.ssn = ssn;

        setEmail();
        setuserId();
    }

    private void setEmail(){
        email = name.toLowerCase() + "." +  iD + "@sdetuniversity.com";
        System.out.println("Your email: " + email);
    }
    public String getEmail(){
        return email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    private void setuserId() {
        int max = 9000;
        int min = 1000;
        int randNum = (int) (Math.random() * ((max - min)));
        randNum = randNum + min;
        userId = iD + "" + randNum + ssn.substring(5);
        System.out.println(name + ", your user ID is: " + userId);
    }

    public void enroll(String course) {
        this.courses = this.courses + " " + course;
        balance = balance + costOfCourse;
    }

    public void payTuition(int amount) {
        System.out.println("Payment made for " + name + ": $" + amount);
        balance = balance - amount;
        System.out.println(name +"'s new balance is $" + balance);
    }

    public void checkBalance() {
        System.out.println(name + " your balance is: $" + balance);
    }

    public void showCourses() {
        System.out.println(courses);
    }

    @Override
    public String toString() {
        return "[NAME: " + name + "]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + " ]";
    }

}
