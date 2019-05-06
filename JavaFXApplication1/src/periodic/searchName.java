package periodic;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class searchName {
    public static Element searchname(String k) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f=new File("secindex.txt");
        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream fobj=new ObjectInputStream(fin);
        SecBtree b=(SecBtree)fobj.readObject();
        if (b.search(k) != null) {
            SecIndex[] v=b.search(k).keys.clone();
            for(int i=0;i<v.length;i++)
            {
                if(!(v[i]==null)&&v[i].name.equals(k))
                {
                   Element p=null;
                    return(b.search(k).keys[i].p);
                }
            }
            
            }
       
    return null;

    }
}
