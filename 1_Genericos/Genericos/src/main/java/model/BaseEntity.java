package model;

import java.util.Objects;

public class BaseEntity {
    
    protected Integer id;

    private static int ultimoId;

    public BaseEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object arg0) {
        if(this == arg0) return true;
        if(arg0 == null || getClass() != arg0.getClass()) return false;
        BaseEntity base = (BaseEntity)arg0; 
        return Objects.equals(id, base.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    

}
