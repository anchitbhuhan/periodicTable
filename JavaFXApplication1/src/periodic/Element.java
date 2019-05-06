package periodic;


import java.io.Serializable;


public class Element implements Serializable{
    public int id;
    public String name;
    public String Symbol;
    public Double A;
    public int Group;
    public int Period;
    public char block;
    public String EC;
    public String PAS;
    public Double MP;
    public Double BP;
    public Double Density;
    public String Desc;
    public String Discovery;

    public Element(int id, String Name, String Symbol, Double A, int Group, int Period, char block, String EC, String PAS, Double MP, Double BP, Double Density, String Desc, String Discovery) {
        this.id = id;
        this.name = Name;
        this.Symbol = Symbol;
        this.A = A;
        this.Group = Group;
        this.Period = Period;
        this.block = block;
        this.EC = EC;
        this.PAS = PAS;
        this.MP = MP;
        this.BP = BP;
        this.Density = Density;
        this.Desc = Desc;
        this.Discovery = Discovery;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public Double getA() {
        return A;
    }

    public int getGroup() {
        return Group;
    }

    public int getPeriod() {
        return Period;
    }

    public char getBlock() {
        return block;
    }

    public String getEC() {
        return EC;
    }

    public String getPAS() {
        return PAS;
    }

    public Double getMP() {
        return MP;
    }

    public Double getBP() {
        return BP;
    }

    public Double getDensity() {
        return Density;
    }

    public String getDesc() {
        return Desc;
    }

    public String getDiscovery() {
        return Discovery;
    }

    @Override
    public String toString() {
       return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

    
    
    
    
}
