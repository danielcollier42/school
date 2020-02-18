public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents(){
        return students;
    }

    public void addStudent(Student student){
        int sId = student.getId();
        students[sId] = student;
        currentSize++;
    }


    public String studentNames(){
        String list = "";
        Student[] students = getStudents();
        for(int i = 3; i < currentSize + 3; i++){
            String studentName = students[i].getName();
            list += studentName;
            if(i < currentSize + 2){
                list += ", ";
            }   
            if(i == currentSize + 1){
                list += "and ";
            }
        }
        return list;
    }

    @Override
    public String toString(){
        return this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + this.studentNames();
    }
}
