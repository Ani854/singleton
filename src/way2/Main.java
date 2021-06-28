package way2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionConfig instance1 = ConnectionConfig.INSTANCE;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file2.text"));
            out.writeObject(instance1);
            out.close();
            ObjectInput in = new ObjectInputStream(new FileInputStream("file2.text"));
            ConnectionConfig instance2 = (ConnectionConfig) in.readObject();
            in.close();
            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
