public class Datamatik {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Hans", 54, false);
        Student student1 = new Student("Pernille", 26, true, 'A');
        Student student2 = new Student("Brian", 34, false, 'B');

        System.out.println(teacher.name);
        System.out.println(String.format("%s from team %c", student1.name, student1.datamatikerTeam));
        System.out.println(String.format("%s from team %c", student2.name, student2.datamatikerTeam));
    }
}