package entities;

public class funcionario {
    public String name;
    public double grosssalary;
    public double tax;
    public double salryl(){
        return  grosssalary - tax;
    }
    public double porcentagem;
    public double aumento (){
        return  (porcentagem / 100 * grosssalary) + grosssalary - tax;
    }
    public String toString(){
        return  name +
                " "
                + String.format("%n Gross Salary: %.2f%n ", grosssalary)
                + String.format("tax:  %.2f%n", tax)
                +("Employee: " +name + ", ")
                + String.format("$  %.2f%n ", salryl())
                + String.format("Which percentage to increase salary ?  %.2f%n ", porcentagem)+
                ("Updated data: " +name + ", ")
                +String.format("$  %.2f%n ", aumento());



    }


}
