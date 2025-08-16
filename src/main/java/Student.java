class students{
    String name;
    int rollNumber;
    double marks;
    students(String name, int rollNumber,double marks){
        this.rollNumber=rollNumber;
        this.name=name;
        this.marks=marks;
    }
    void ShowDetails(){
        System.out.println("Name:" +name);
        System.out.println("Roll Number:" +rollNumber);
        System.out.println("Marks: "+marks);
    }
}
public class Student {
    public static void main(String[] args) {
        students s1=new students("Raji",1218,980);
        students s2 = new students("Hari",1221,977);
        s1.ShowDetails();
        s2.ShowDetails();
    }
}
