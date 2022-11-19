package features.generics.simple;

public class Record<T>{

    T genericObject;

    public Record(T genericObject) {
        this.genericObject = genericObject;
    }

    public T getGenericObject() {
        return genericObject;
    }

    public void setGenericObject(T genericObject) {
        this.genericObject = genericObject;
    }


}
