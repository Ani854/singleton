package way1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionConfig instance1 = ConnectionConfig.instance;
            instance1.host = "abc";
            instance1.password = "123123123";
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file1.text"));
            out.writeObject(instance1);
            out.close();
            ObjectInput in = new ObjectInputStream(new FileInputStream("file1.text"));
            ConnectionConfig instance2 = (ConnectionConfig) in.readObject();
            in.close();
            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
            System.out.println(instance1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
