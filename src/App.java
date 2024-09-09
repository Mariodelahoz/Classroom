//public class App {
    //public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
         
    //}
    
//}
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Student me = new Student(0, 0);
        Silla mySilla = new Silla(1, 20);
        Profesor myProfesor = new Profesor(1, 25);
        Computadores myComputadores = new Computadores(1, "windows");
        Classroom myClassroom = new Classroom(me, mySilla, myComputadores, myProfesor);     
        System.out.println(myClassroom);
         
    }

   
}

