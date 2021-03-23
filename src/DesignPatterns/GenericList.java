package DesignPatterns;

import java.io.Serializable;
import java.util.Iterator;

public interface GenericList<T> extends Iterable<T> {
   void add(T value);
   void remove(T value);

}
