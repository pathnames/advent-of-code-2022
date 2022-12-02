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
            System.out.println(Collections.max(sums));
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}