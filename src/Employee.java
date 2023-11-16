public class Employee {


    private String Name;
    private int salary;
    private double KPIIndex;

    double FinalSalary;

    public Employee(String name, int salary, int KPIIndex) {
        Name = name;
        this.salary = salary;
        this.KPIIndex = KPIIndex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getKPIIndex() {
        return KPIIndex;
    }

    public double getFinalSalary() {
        return FinalSalary;
    }

    public void setFinalSalary(double finalSalary) {
        FinalSalary = finalSalary;
    }

    public void setKPIIndex(double KPIIndex) {
        this.KPIIndex = KPIIndex;
    }
    public double FinalSalary(int salary, double KPI){
        return (salary * KPI);
    }
}
