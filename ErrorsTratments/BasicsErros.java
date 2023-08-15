public class BasicsErros {

    public static void main(String[] args) {
        
        Student student1 = null;

        try {
            printStudentName(student1);
        } catch(Exception exception) {
            System.out.println("Error");
        }        

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Erro");
        }
        
        System.out.println("Fim");
    }
    
    public static void printStudentName (Student student) {
        System.out.println(student.name);

    }


    
}
