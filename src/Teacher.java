import java.util.Arrays;

public class Teacher extends Person{
    Section[] sections = new Section[50];
    String subject;
    String name;
    int sectionCount;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section section){
        sections[sectionCount] = section;
        sectionCount++;
    }

    public String getSectNames(){
        String names = "";
        names += this.sections;
        return names;
    }

    public String sectNames(){
        String sections = "";
        Section[] sect = getSections();
        for(int i = 0; i < sectionCount; i++){
            sections += (sect[i].getName());
            if(i < sectionCount - 1){
                sections += ", ";
            }
            if(i == (sectionCount - 2)){
                sections += "and ";
            }
        }
        return sections;
    }

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "sections=" + Arrays.toString(sections) +
//                '}';
//    }

        @Override
    public String toString() {
        return getName() + " teaches the following sections: " + sectNames();
    }
}
