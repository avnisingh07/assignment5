package assignment5part2;

public class NormalEmployee extends Employee
{
    @Override
    public void salaryCalculation()
    {
        double bw = ((getGrosswage() / getTotalWorkingDays())
•⁠  ⁠getPaidDays()) * 0.45;
        setBasicWage(bw);
        double hra = (bw * 0.40);
        setHra(hra);
        double ca = (1600 / getTotalWorkingDays()) * getPaidD
        ays();
        setConveyanceAllowances(ca);
        double ma = (1250 / getTotalWorkingDays()) * getPaidD
        ays();
        setMedicalAllowances(ma);
        double otherAllo = ((getGarosswage() / getTotalWorking
        Days()) * getPaidDays()) - (bw + hra + ca + ma);
        setTotalEarning(bw + hra + ca + ma + otherAllo);
        System.out.println("Total Earnings: " + getTotalEarni
                ng() );
    }
}