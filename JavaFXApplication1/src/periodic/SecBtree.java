package periodic;



import java.io.Serializable;

class SecBtree implements Serializable{
    public SecBTreeNode root;
    public int minDeg;

    SecBtree(int t) {
        this.root = null;
        this.minDeg = t;
    }

    public void traverse() {
        if (this.root != null)
            this.root.traverse();
        System.out.println();
    }

    public SecBTreeNode search(String k) {
        if (this.root == null)
            return null;
        else
            return this.root.search(k);
    }

    public void insert(SecIndex k) {
        if (this.root == null) {
            this.root = new SecBTreeNode(this.minDeg, true);
            this.root.keys[0] = k;
            this.root.n = 1;
        } else {
            if (root.n == 2 * this.minDeg - 1) {
                SecBTreeNode s = new SecBTreeNode(this.minDeg, false);
                s.C[0] = root;
                s.splitChild(0, root);
                for (int i = 0; i < s.keys.length; i++) {
                    if (!(s.keys[i]==null) && s.keys[i].name.compareTo(k.name)<0)
                        i++;
                }

                int i = 0;
                if (s.keys[0].name.compareTo(k.name)<0)
                    i++;
                s.C[i].insertNonFull(k);

                this.root = s;

            } else {
                root.insertNonFull(k);
            }
        }
    }

    void remove(SecIndex k) {
        if (root == null) {
            System.out.println("The tree is empty");
            return;
        }

        root.remove(k);

        if (root.n == 0) {
            SecBTreeNode tmp = root;
            if (root.leaf)
                root = null;
            else
                root = root.C[0];

            tmp = null;
        }
        return;
    }

}