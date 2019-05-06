package periodic;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class removeElement {
    public static void removelement(int id) throws ClassNotFoundException
    {
            int z=0;
            Vector<Element> v= null;
            Btree b=null;
            SecBtree s=null;
            
            File f=new File("element.txt");
            File fi=new File("index.txt");
            File fs=new File("secindex.txt");
            
             try {
                 
                //Read
                FileInputStream fin = new FileInputStream(f);
                ObjectInputStream obj = new ObjectInputStream(fin);
                v  =  (Vector<Element>)obj.readObject();
                
                FileInputStream inp=new FileInputStream(fi);
                ObjectInputStream obj2=new ObjectInputStream(inp);
                b=(Btree)obj2.readObject();
                
                FileInputStream inp2=new FileInputStream(fs);
                ObjectInputStream obj3=new ObjectInputStream(inp2);
                s=(SecBtree)obj3.readObject();
                
                //search index in record
                for(int j=0;j<v.size();j++){
                    if(v.elementAt(j).id==id){
                        z=j;
                    }
                }
                
                //remove from all the files
                b.remove(new Index(v.elementAt(z).id, v.elementAt(z)));
                s.remove(new SecIndex(v.elementAt(z).name, v.elementAt(z)));
                v.removeElement(v.elementAt(z));
                
                //Write
                FileOutputStream fout = new FileOutputStream(f);
                ObjectOutputStream obj4 = new ObjectOutputStream(fout);
                obj4.writeObject(v);
                
                FileOutputStream ind = new FileOutputStream(fi);
                ObjectOutputStream obj5 = new ObjectOutputStream(ind);
                obj5.writeObject(b);
                   
                FileOutputStream ind2 = new FileOutputStream(fs);
                ObjectOutputStream obj6 = new ObjectOutputStream(ind2);
                obj6.writeObject(s);
                }                   
            catch(IOException e)
            {
                System.out.println(e);
            }
}
}
