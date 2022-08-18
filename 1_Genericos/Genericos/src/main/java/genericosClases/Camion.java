package genericosClases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{

    private List<T> objectos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objectos = new ArrayList<>();
    }

    public void agregar(T  obj) {

        if (this.objectos.size() <= max) {
            this.objectos.add(obj);
        } else {
            throw new RuntimeException("No hay mas espacio");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objectos.iterator();
    }

    
    @Override
    public String toString() {
        return "Camion [objectos=" + objectos + "]";
    }

    
}
