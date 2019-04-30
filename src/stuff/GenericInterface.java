package stuff;

public class GenericInterface<T, V> implements IGeneric<T,V> {
	
public T some;
public V fff;

@Override
public void gm(T t,V v) {
	System.out.println("this is type: "+t+"  "+v);
}
}
