package periodic;



import java.io.Serializable;
class SecIndex implements Serializable{

    String name;
    Element p;

    SecIndex(String name, Element abc){
        this.name = name;
        this.p = abc;
    }
    
    @Override
    public String toString() {
       return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

}