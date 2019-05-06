package periodic;

import java.io.Serializable;

class Btree implements Serializable {

    public BTreeNode root;
    public int minDeg;

    Btree(int t) {
        this.root = null;
        this.minDeg = t;
    }

    public void traverse() {
        if (this.root != null) {
            this.root.traverse();
        }System.out.println();
    }

    public BTreeNode search(int k) {
        if (this.root == null) {
            return null;
        } else {
            return this.root.search(k);
        }
    }

    public void insert(Index k) {
        if (this.root == null) {
            this.root = new BTreeNode(this.minDeg, true);
            this.root.keys[0] = k;
            this.root.n = 1;
        } else {
            if (root.n == 2 * this.minDeg - 1) {
                BTreeNode s = new BTreeNode(this.minDeg, false);
                s.C[0] = root;
                s.splitChild(0, root);
//                 System.out.println("Before "+s.keys[0]);
//                 System.out.println("Length "+s.keys.length);
                for (int i = 0; i < s.keys.length; i++) {
                    
                    if ( !(s.keys[i]==null) && s.keys[i].id < k.id) {
                        i++;
                    }
                }

                int i = 0;
                if (s.keys[0].id < k.id) {
                    i++;
                }
                s.C[i].insertNonFull(k);

                this.root = s;

            } else {
                root.insertNonFull(k);
            }
        }
    }
    void remove(Index k) {
        if (root == null) {
            System.out.println("The tree is empty");
            return;
        }

        root.remove(k);

        if (root.n == 0) {
            BTreeNode tmp = root;
            if (root.leaf)
                root = null;
            else
                root = root.C[0];

            tmp = null;
        }
    }
    
}
