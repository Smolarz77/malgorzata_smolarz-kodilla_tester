import java.util.Arrays;
public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 1;

    }

    public void addValue(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        size++;
    }

    public int returnLastGrade() {       //ostatnia dodana ocena

        return this.grades[this.size - 1];


    }

    public double average() {     //srednia ocen
        return (Arrays.stream(grades).sum()) / size;
    }


    public double returnAverageGrade() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += this.grades[i];
        }
            return sum / this.size;
        }
    }



