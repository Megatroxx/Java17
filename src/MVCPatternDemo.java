public class MVCPatternDemo {
    public static void main(String[] args){
    }

    public Student retrieveStudentFromDataBase(){    //здесь модель извлекается из базы данных (ну у нас ее нет так что просто создали и вернули чела)

        Student student = new Student();
        student.setRollNo("01");
        student.setName("nasty");
        return student;
    }
}
