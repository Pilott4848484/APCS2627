public class Student {
    private String name;
    private String address;
    private int gradeLevel;
    private double pointsEarned;
    private double pointsTotal;
    private int numAssignments;

    public Student(String studentName, String studentAddress, int studentGradeLevel){
        name = studentName;
        address = studentAddress;
        gradeLevel = studentGradeLevel;
        pointsEarned = 0.0;
        pointsTotal = 0.0;
        numAssignments = 0;
    }
    public Student(String studentName, String studentAddress, int studentGradeLevel, double studentPointsEarned, double studentPointsTotal, int studentNumAssignments){
        name = studentName;
        address = studentAddress;
        gradeLevel = studentGradeLevel;
        pointsEarned = studentPointsEarned;
        pointsTotal = studentPointsTotal;
        numAssignments = studentNumAssignments;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }
    public double getPointsEarned(){
        return pointsEarned;
    }
    public double getPointsTotal(){
        return pointsTotal;
    }
    public int getNumAssignments(){
        return numAssignments;
    }

    public double getAverage(){
        return pointsEarned/pointsTotal;
    }

    public void addAssignment(double asssignmentPointsEarned, double asssignmentPointsTotal){
        pointsEarned+=asssignmentPointsEarned;
        pointsTotal+=asssignmentPointsTotal;
        numAssignments++;
    }
    public void incrementGradeLevel(){
        gradeLevel++;
    }
    public void resetScores(){
        pointsEarned=0.0;
        pointsTotal=0.0;
        numAssignments=0;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public String toString(){
        return "name: "+name+"\naddress: "+address+"\ngradeLevel: "+gradeLevel+"\npointsEarned: "+pointsEarned+"\npointsTotal"+pointsTotal+"\nnumAssignments: "+numAssignments;
    }
}
