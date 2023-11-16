public class EmployeeController {


    private Employee model;

    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }


    public String getEmployeeName(){
        return model.getName();
    }
    public void setEmployeeName(String Name){
        model.setName(Name);
    }


    public int getEmployeeSalary(){
        return model.getSalary();
    }
    public void setEmployeeSalary(int salary){
        model.setSalary(salary);
    }

    public double getEmployeeKPI(){
        return model.getKPIIndex();
    }
    public void setEmployeeSalary(double KPI){
        model.setKPIIndex(KPI);
    }

    public double getEmployeeFinalSalary(){
        return model.FinalSalary(model.getSalary(), model.getKPIIndex());
    }

    public void setEmployeeFinalSalary(int salary, double KPI){
        model.FinalSalary = model.FinalSalary(salary, KPI);
    }
}
