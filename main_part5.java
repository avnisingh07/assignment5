package assignment5part2;

public class main_part5
{
    public static void main(String[] args)
    {
        NormalEmployee n = new NormalEmployee();
        SpecialEmployee s = new SpecialEmployee();
        n.getEmployeeDetails();
        n.salaryCalculation();

        s.getEmployeeDetails();
        s.salaryCalculation();
    }
}