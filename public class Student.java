public class Student 
{
 private int id;
 private double cgpa;
 public Student()
 {
     System.out.println("empty");

 }
 public void setId(int id)
 {
     this.id=id;
 }
 public void setCgpa(double cgpa)
 {
     this.cgpa=cgpa;
 }
 public int getId()
 {
     return id;

 }
 public double getCgpa()
 {
     return cgpa;  
 }
 public Student(int id,double cgpa)
 {
     System.out.println("parameterized constructor")
     this.id=id;
     this.cgpa=cgpa;
 }
 public void showdetails()
 {
     System.out.println("Id:"+id)
     System.out.println("Cgpa:"+cgpa)
 }
 public static void main(String[] args) 
 {
     Student s1=new Student();
     s1.setId(1);
     s1.setCgpa(3.80);
     System.out.println("ID:"+id.getId);
     System.out.println("CGPA:"+cgpa.getCgpa);
     System.out.println("--------------------");
     Student s2=new Student(2,3.90);
     s2.showdetails();

     
 }

}
