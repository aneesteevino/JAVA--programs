/*class Digital{
    String Affiliate;
    String Assistant;
    public void Skills(){
        System.out.println("BHAI TUM LOG KIA KRTY HO ?  ");

    }
    public void printAffiliate(){
        System.out.println("\n mai ("+ this.Affiliate+") krta hun" );

    }
    public void printAssistant(){
        System.out.println("\n  mera bhai ("+ this.Assistant+")  hai");

    }
}
public class Rough{
    public static void main(String[] args) {
        Digital Amazon_type = new Digital();
        Amazon_type.Affiliate  = "Affiliate marketing";
        Amazon_type.Assistant = "virtual Assistant ";
        Amazon_type.Skills();
        Amazon_type.printAffiliate();
        Amazon_type.printAssistant();

    }
}

  class Student{
    String name;
    String father_name;
    int marks;
    char grade;
    public void printName(){
        System.out.println("Student name : "+this.name);
    }
    public void printfather_name(){
        System.out.println("father name  : "+this.father_name);
    }
    public void printmarks(){
        System.out.println("Marks : "+this.marks);
    }
    public void printgrade(){
        System.out.println("Grade : "+this.grade);
    }
  /*  non parametarized constructor 
   Student(){
        System.out.println("non parametarized constructor ");
    }
    Student(String name,  String father_name,
    int marks,
    char grade){
        this.name=name;
        this.father_name=father_name;
        this.marks=marks;
        this.grade=grade;
    }
    
  }
  public class Rough{
    public static void main(String[] args) {
        Student s1=new Student("Anees","ghulam abbas",89,'A');
       
         
        s1.printName();
        s1.printfather_name();
        s1.printmarks();
        s1.printgrade();


    
    }
  }



  class parametarized{
    String name;
    String profession;
    int salary;
    public void printInfo(){
       System.out.println(this.name);
       System.out.println(this.profession);
       System.out.println(this.salary);

    }
    parametarized(String name, String profession, int salary){
     this.name=name;
     this.profession=profession;
     this.salary=salary;

    }
  }
class Rough{
    public static void main(String[] args) {
        parametarized employe=new parametarized("kamran", "lawyer",30000);
        employe.printInfo();
    }
}



class Student{
    String name;
    String father_name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }

   

        public void printInfo(int age){
            System.out.println(age);}

            public void printInfo(String name ,
            int age ){
                System.out.println(name + " "+ age);}
}
public class Rough{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Anees";
        s1.father_name="ghulam Abbass";
        s1.age=20;
      //  s1.printInfo(s1. age);
        s1.printInfo(s1. name, s1.age);

    }
}*/


class colors{
    public void red(){
        System.out.println("red");
    }
    public void pink(){
        System.out.println("pink");
    }
}
class rainbow extends colors{
    
}
class black extends colors{
    public void black(){
        System.out.println("black");
    }
    public void white(){
        System.out.println("white");
    }
}
public class Rough {

    public static void main(String[] args) {
        black b1=new black();
      rainbow r1=new rainbow();
        r1.red();
        b1.black();
        b1.white();
        r1.pink();
    }
}