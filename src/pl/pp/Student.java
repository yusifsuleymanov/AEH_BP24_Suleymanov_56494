package pl.pp;

import java.util.List;

public record Student(String index, String firstName, String lastName, List<Integer> grades) {

    public double getAverage() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
