package Serialization;

/*                                     What	is Serialization?

    Serialization helps us to save and retrieve the state of an object.------------------------------------------------
        • Serialization => Convert object state to some internal object representation.
        • De-Serialization => The reverse. Convert internal representation to object.
    Two important methods
        • ObjectOutputStream.writeObject() // serialize and write to file
        • ObjectInputStream.readObject() // read from file and deserialize

                 How do you serialize an object using	Serializable interface?

    To serialize an object it should implement Serializable interface. In the example below, Rectangle class
    implements Serializable interface.
    Note that Serializable interface does not declare any methods to be implemented.
    Static variables are not serialized


*/