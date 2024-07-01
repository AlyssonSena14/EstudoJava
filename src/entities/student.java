package entities;

public class student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    public double tototnota(){
        return  nota1 + nota2 + nota3;
    }
    public Double alvo(){
        return 60 - tototnota();
    }
    public String toString (){
        return name
                +String.format("%nFINAL GRADE = %.2f%n", tototnota())
                +"FAILED"
                +String.format("%nMISSING %.2f", alvo());
    }
    public String toString1 (){
        return name
                +String.format("%nFINAL GRADE = %.2f",tototnota());

    }



}
