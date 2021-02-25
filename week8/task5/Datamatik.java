public class Datamatik {
    static String getStudentName(Student[] studentArray, int index) {
        return studentArray[index].name;
    }

    static String getIndexFromName(Student[] studentArray, String studentName) {
        for (int i = 0; i<studentArray.length; i++) {
            if (studentArray[i].name == studentName) return String.valueOf(i);
        }
        return "Student not found";
    }

    public static void main(String[] args) {
        String[] studentNames   = {"Brian", "Bob", "Jens", "Pernille", "Hans", "Simon", "Maria", "Martin", "Dorte", "Mikkel"};
        int[] studentAges       = {27, 62, 19, 42, 36, 23, 33, 45, 21, 26};
        boolean[] isFemaleList  = {false, false, false, true, false, false, true, false, true, false};
        char[] datamatikerTeams = {'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B'};

        Student[] students = new Student[10];
        for (int i = 0; i<students.length; i++) {
            students[i] = new Student(studentNames[i], studentAges[i], isFemaleList[i], datamatikerTeams[i]);
        }

        //5.b
        System.out.println(getStudentName(students, 3));
        System.out.println(getStudentName(students, 5));
        System.out.println(getStudentName(students, 7));

        //5.c
        System.out.println(getIndexFromName(students, "Maria"));
        System.out.println(getIndexFromName(students, "Dorte"));
        System.out.println(getIndexFromName(students, "Peter"));
    }
}