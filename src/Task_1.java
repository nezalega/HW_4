import java.io.*;
import java.util.StringTokenizer;

public class Task_1 {

        public static void main(String[] args) throws Throwable {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите путь куда разместить файл:");
            FileOutputStream fileWriter = new FileOutputStream(reader.readLine(), true);

            System.out.println("Введите, что записать в файл ");
            StringTokenizer st = new StringTokenizer(reader.readLine());

            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                if (temp.equals("stop"))
                    break;
                fileWriter.write((temp + " ").getBytes());
            }
            fileWriter.close();
        }
    }