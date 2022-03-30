package lesson7;

import java.io.*;
import java.util.Arrays;

public class AppData {
    public static void main(String[] args) {
        BufferedReader br = null;

        AppData Data = new AppData();
        String[] header = {"Man1", "Man2", "Man3"};
        int[][] data = {{23, 26, 24}, {67, 87, 77}};


        String arrString1 = Arrays.toString(header);
        char[] charHeader = arrString1.toCharArray();
        String arrString2 = Arrays.toString(data);
        char[] charData = arrString2.toCharArray();

        FileOutputStream file = null;
        try {
            FileWriter writerFile = new FileWriter("C:\\Users\\User\\IdeaProjects\\myProject\\lesson7\\src\\main\\java\\lesson7\\File.csv");

            writerFile.write(charHeader);
            writerFile.append("\n");
            writerFile.write(Arrays.deepToString(data));
            writerFile.close();

            br = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\myProject\\lesson7\\src\\main\\java\\lesson7\\File.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
