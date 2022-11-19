package features.iostream;

import java.io.Serializable;

public class SerialFileOutput implements Serializable {
    private final String name;
    public SerialFileOutput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SerialFileOutput{" +
                "name='" + name + '\'' +
                '}';
    }
}
