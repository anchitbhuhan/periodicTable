package periodic;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class searchId {
    public static Element searchid(int k) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f=new File("index.txt");
        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream fobj=new ObjectInputStream(fin);
        Btree b=(Btree)fobj.readObject();
        if (b.search(k) != null) {
            Index[] v=b.search(k).keys.clone();
            for(int i=0;i<v.length;i++)
            {
                if(!(v[i]==null)&&v[i].id==k)
                {
                   Element p=null;
                    return(b.search(k).keys[i].p);
                }
            }
            
            }
       
    return null;

    }
}
