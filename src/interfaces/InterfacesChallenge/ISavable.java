package interfaces.InterfacesChallenge;

import collections.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
