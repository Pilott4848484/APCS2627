public class StudentTest {
    public static void main(String[] args) {
        
        Student s1 = new Student("Jacob", "Random Road", 4);
        System.out.println(s1);

        Student s2 = new Student("Bob", "123 Apple Ln", 10, 5.0, 7.0, 1);

        System.out.println(s2.getName());
        System.out.println(s2.getAddress());
        System.out.println(s2.getGradeLevel());
        System.out.println(s2.getPointsEarned());
        System.out.println(s2.getPointsTotal());
        System.out.println(s2.getNumAssignments());

        System.out.println(s2.getAverage());

        s2.addAssignment(10.0, 10.0);
        System.out.println("after assignment added: "+s2.getNumAssignments());
        s2.incrementGradeLevel();
        System.out.println("after grade level inc: "+s2.getGradeLevel());
        s2.resetScores();
        System.out.println("reset scores");
        s2.setAddress("456 Banana Rd");
        System.out.println("after new address: "+s2.getAddress());
        System.out.println(s2);

    }
}
