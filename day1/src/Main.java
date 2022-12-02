import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("inputs/day1.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<Integer> sums = new ArrayList<>();
            int sum = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.isEmpty()) {
                    sums.add(sum);
                    sum = 0;
                } else {
                    sum += Integer.parseInt(data);
                }
            }
            System.out.println("Solution 1: " + Collections.max(sums));
            Collections.sort(sums, Collections.reverseOrder());
            System.out.println("Solution 2: " + (sums.get(0) + sums.get(1) + sums.get(2)));
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}