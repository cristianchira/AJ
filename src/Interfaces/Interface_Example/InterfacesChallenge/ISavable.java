package Interfaces.Interface_Example.InterfacesChallenge;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
