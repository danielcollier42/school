public class School {
    private String name;
    private Section[] sections = new Section[200];
    int sectionCount;

    public School(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSection (Section section){
        sections[sectionCount] = section;
        sectionCount++;
    }

    public Section[] getSections() {
        return sections;
    }

    @Override
    public String toString() {
        return "The school named " + name + " has " + sectionCount + " sections.";
    }
}
