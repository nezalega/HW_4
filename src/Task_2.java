import java.io.*;


public class Task_2 {
    public static void main(String[] args) throws IOException {

        try (
                Reader reader = new BufferedReader(new FileReader(new File("d:/Java/File.txt")));
                Writer writer = new BufferedWriter(new FileWriter(new File("d:/Java/resultFile.txt")))
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.isAlphabetic(ch)) {
                    writer.write(ch);
                }
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}