public class TestGrades {
    public static void main (String[] args){
        Grades grades = new Grades();
        grades.add(4);
        grades.add(4);
        grades.add(8);
        System.out.println(grades.returnLastGrade() + "      " + grades.returnAverage2());

}}
