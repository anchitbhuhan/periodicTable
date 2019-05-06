//package periodic;
//
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class Main {
//    public static void main(String[] args) throws ClassNotFoundException, IOException{
//        
//        System.out.println("This is a Periodic Table and mera lauda bhi hai isme madharchod");
//        
//        Element e1 = new Element(1, "Hydrogen", "H", 1.008, 1, 1, 's', "1s1", "gas", 13.99, 20.271, 0.0899, "Hydrogen is a chemical element with symbol H and atomic number 1. With a standard atomic weight of 1.008, hydrogen is the lightest element in the periodic table. Hydrogen is the most abundant chemical substance in the Universe, constituting roughly 75% of all baryonic mass.[7][note 1] Non-remnant stars are mainly composed of hydrogen in the plasma state. The most common isotope of hydrogen, termed protium (name rarely used, symbol 1H), has one proton and no neutrons. ", "Henry Cavendish" );
//        
//        Element e2 = new Element(2, "Helium", "He", 4.002, 18, 1, 's', "1s2", "gas", 0.95, 4.222, 0.179, "Helium (from Greek: ἥλιος, translit. Helios, lit. 'Sun') is a chemical element with symbol He and atomic number 2. It is a colorless, odorless, tasteless, non-toxic, inert, monatomic gas, the first in the noble gas group in the periodic table. Its boiling point is the lowest among all the elements. After hydrogen, helium is the second lightest and second most abundant element in the observable universe, being present at about 24% of the total elemental mass, which is more than 12 times the mass of all the heavier elements combined. Its abundance is similar to this figure in the Sun and in Jupiter. This is due to the very high nuclear binding energy (per nucleon) of helium-4 with respect to the next three elements after helium. This helium-4 binding energy also accounts for why it is a product of both nuclear fusion and radioactive decay. Most helium in the universe is helium-4, the vast majority of which was formed during the Big Bang. Large amounts of new helium are being created by nuclear fusion of hydrogen in stars. ", "Pierre Janssen,Norman Lockyer" );
//        
//        Element e3 = new Element(3, "Lithium", "Li", 6.94, 1, 2, 's', "2s1", "solid", 463.65, 1603.00, 0.534, "Lithium (from Greek: λίθος, translit. lithos, lit. 'stone') is a chemical element with symbol Li and atomic number 3. It is a soft, silvery-white alkali metal. Under standard conditions, it is the lightest metal and the lightest solid element. Like all alkali metals, lithium is highly reactive and flammable, and is stored in mineral oil. When cut, it exhibits a metallic luster, but moist air corrodes it quickly to a dull silvery gray, then black tarnish. It never occurs freely in nature, but only in (usually ionic) compounds, such as pegmatitic minerals, which were once the main source of lithium. Due to its solubility as an ion, it is present in ocean water and is commonly obtained from brines. Lithium metal is isolated electrolytically from a mixture of lithium chloride and potassium chloride. ", "Johan August Arfwedson");
//        
//        addElement.addelement(e1);
//        addElement.addelement(e2);
//        addElement.addelement(e3);
//        System.out.println(searchName.searchname("Lithium").name);
//        System.out.println(searchName.searchname("Hydrogen").name);
////        System.out.println(searchId.searchid(1));
////        System.out.println(searchId.searchid(5));
////        System.out.println(searchName.searchname("Helium"));
////        removeElement.removelement(1);
////        System.out.println(searchId.searchid(1));
//        
//        FileInputStream bt = new FileInputStream("index.txt");
//        ObjectInputStream obj = new ObjectInputStream(bt);
//        Btree b = (Btree)obj.readObject();
////        b.traverse();
//        
//        
//        
//        
//    }
// }
