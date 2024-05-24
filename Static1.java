

/*
Static Keyword :- Static keyword is a non access modifier
use of static variable :-
1 - class level Variable
2 - method
3 - static block
4 - inner class(nested class)

Static variable use for memory management
Static variable belongs to the class not an object
 */

 class Static1 {
   int emp_id;
   String Name;
   static String company = "Insaan";

   Static1(int emp_id,String Name){
       this.emp_id = emp_id;
       this.Name = Name;
   }
     void Display(){
       System.out.println(emp_id+" "+Name+" "+company);
   }

     public static void main(String[] args) {
         Static1 E1 = new Static1(101,"AMAN");
         E1.Display();
         Static1 E2 = new Static1(102,"Vipin");
         E2.Display();
     }
}
