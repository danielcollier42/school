public class Runner {

   public static void main(String[] args) {
       School bhs = new School("Berkeley High");

       Teacher albinson = new Teacher("Albinson", "Computer Science");
       Section compSci = new Section("Computer Science", albinson);

       Teacher austera = new Teacher("Austera", "Math");
       Section math = new Section("Math", austera);

       Teacher shannon = new Teacher("Shannon", "Biology");
       Section bio = new Section("Biology", shannon);

       Student daniel = new Student("Daniel C", 11);
       Student david = new Student("David", 11);
       Student coby = new Student ("Coby", 10);
       Student otherDaniel = new Student ("Daniel G", 11);
       Student bilingualDaniel = new Student ("Daniel D", 10);
       Student coolDaniel = new Student ("Daniel S", 11);
       Student bestDaniel = new Student ("Daniel E", 11);

       Section[] sections = {math, compSci, bio};
       for(int i = 0; i < sections.length; i++){
           bhs.addSection(sections[i]);
       }

       austera.addSection(math);
       albinson.addSection(compSci);
       shannon.addSection(bio);

       math.setTeacher(austera);

       Student[] students = {daniel, david, coby, otherDaniel, bilingualDaniel, coolDaniel, bestDaniel};
       for(int i = 0; i < students.length; i++){

           students[i].addSections(math);
           students[i].addSections(compSci);
           students[i].addSections(bio);

           math.addStudent(students[i]);
           compSci.addStudent(students[i]);
           bio.addStudent(students[i]);
       }

       System.out.println(bhs.toString());

       System.out.println(austera.toString());
       System.out.println(albinson.toString());
       System.out.println(shannon.toString());

       System.out.println(math.toString());
       System.out.println(compSci.toString());
       System.out.println(bio.toString());

       System.out.println(daniel.toString());
       System.out.println(david.toString());
       System.out.println(coby.toString());
       System.out.println(otherDaniel.toString());
       System.out.println(bilingualDaniel.toString());
       System.out.println(coolDaniel.toString());
       System.out.println(bestDaniel.toString());
   }
}

