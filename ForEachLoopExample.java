import java.util.Arrays;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String[][] characters = { { "Harry", "Hermoine", "Ron"},
                                    { "Walter", "Jesse", "Saul"},
                                    { "Professor", "Berlin", "Tokyo"}};
        for(String[] eachSeries: characters) {
            for(String eachCharacter: eachSeries) {
                System.out.println(eachCharacter);
            }
        }
        System.out.println(Arrays.deepToString(characters));
    }
}
