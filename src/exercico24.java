import entities.student;

import java.util.Locale;
import java.util.Scanner;

public class exercico24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student student = new student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();
        if (student.tototnota() >= 60){
            System.out.println("aluno: " + student.toString1());
            System.out.println("PASS");
        }
        else {
            System.out.print("aluno: "+  student + " POINTS");
        }

        sc.close();
    }


}
