public class StudentController {          //объединяющий класс контроллера
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public String getStudentsName(){
        return model.getName();
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }
    public void updateView(){
        view.printStudentsData(model.getRollNo(), model.getName());

    }
}
