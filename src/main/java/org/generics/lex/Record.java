package org.generics.lex;

import java.util.ArrayList;
import java.util.List;

public class Record<T> {

    private final int id;
    private T type;

    public Record(int id, T type) {
        this.id = id;
        this.type = type;
    }

//    private void sayClassType(){
//        System.out.println(type.getClass().getSimpleName());
//    }

    public T getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setType(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
