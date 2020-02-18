import java.util.Arrays;

public class Student extends Person{
    Section[] sections = new Section[50];
    int grade;
    int sectionCount;
    String name;

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }


    public Section[] getSections() {
        return sections;
    }

    public void addSections(Section section) {
        Section[] sections = getSections();
        sections[sectionCount] = section;
        sectionCount++;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String sectNames(){
        String sections = "";
        Section[] sect = getSections();
        for(int i = 0; i < sectionCount; i++){
            String sectionName = sect[i].getName();
            sections += sectionName;
            if(i < sectionCount - 1){
                sections += ", ";
            }
            if(i == (sectionCount - 2)){
                sections += "and ";
            }
        }
        return sections;
    }

    @Override
    public String toString() {
        return getName() + " is in grade " + grade + " and is enrolled in the following sections: " + sectNames();
    }
}
