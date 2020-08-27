import java.io.*;
import java.util.*;

public class Task_4 {

    public static void main(String[] args) {

        try {
            File MyFldr = new File("my_Folder");
            MyFldr.mkdir();
            List<File> fileList = new ArrayList<>();
            for (int i = 1; i<=100;i++){
                File myfile = new File (MyFldr, i + ".txt");
                myfile.createNewFile();
                fileList.add(myfile);
            }
            BufferedReader br = new BufferedReader(new FileReader("Task_5.txt"));
            StringBuilder text = new StringBuilder();
            int counter = 0;
            int charint;
            while ((charint = br.read()) !=-1){
                counter++;
                text.append((char)charint);
            }
            Map<File, Long> mapFileSize = new TreeMap<>();
            Random rrr = new Random();
            int number;
            String newtext;
            for (File f : fileList){
                number = rrr.nextInt(counter);
                newtext = text.substring(0, number);
                FileWriter  fw = new FileWriter(f);
                fw.write(newtext);
                fw.close();
                mapFileSize.put(f, f.length());
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("Task_5_result.txt"));
            for (Map.Entry<File, Long> entry : mapFileSize.entrySet()){
                bw.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }
            bw.close();
        }catch (IOException ee){
            System.err.println(ee.getMessage());
        }
    }


}
