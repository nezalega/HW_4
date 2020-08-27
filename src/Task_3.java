import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task_3 {

    public static void main(String[] args) {

        ArrayList<User> uslist = new ArrayList<>();
        uslist.add(new User("One", "Clinton", 70));
        uslist.add(new User("Two", "Pitt", 45));
        uslist.add(new User("Three", "Hoy", 35));
        uslist.add(new User("Four", "Bush", 75));
        uslist.add(new User("Five", "Elcin", 65));
        uslist.add(new User("Six", "Lenin", 87));
        uslist.add(new User("Seven", "Fox", 40));
        uslist.add(new User("Eight", "Pope", 145));
        uslist.add(new User("Nine", "Lee", 42));
        uslist.add(new User("Ten", "Caravajio", 79));

    try{
        File foulder = new File("Users");
        foulder.mkdir();
        String filename;

        for (User u : uslist){
            filename = u.getName() + " " + u.getSurname() + " .txt";
            ObjectOutputStream OS = new ObjectOutputStream( new FileOutputStream("D://foulder// + filename"));
            OS.writeObject(u.toString());
            OS.close();
        }
    }catch (IOException e){
        System.err.println(e.getMessage());
    }
    }
}
