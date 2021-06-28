package way1;

import java.io.Serializable;

public class ConnectionConfig implements Serializable {
    public String host;
    public String password;
    public static ConnectionConfig instance = new ConnectionConfig();

    private ConnectionConfig() {
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    public String toString() {
        return "ConnectionConfig{" +
                "host='" + host + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
