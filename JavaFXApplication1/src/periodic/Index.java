package periodic;

import java.io.Serializable;

public class Index implements Serializable {

    int id;
    Element p;

    public Index(int id, Element p) {
        this.id = id;
        this.p = p;
    }

    @Override
    public String toString() {
       return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

}