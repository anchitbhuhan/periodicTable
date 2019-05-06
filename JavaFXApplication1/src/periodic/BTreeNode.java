package periodic;
import java.io.Serializable;

class BTreeNode implements Serializable {

    Index[] keys;
    int MinDeg;
    BTreeNode[] C;
    int n;
    boolean leaf;

    public void traverse() {
        int i = 0;
        for (i = 0; i < this.n; i++) {
            if (this.leaf == false) {
                C[i].traverse();
            }
            System.out.print(keys[i].p.name+" ");
        }

        if (leaf == false) {
            C[i].traverse();
        }
    }

    BTreeNode(int t, boolean leaf) {
        this.MinDeg = t;
        this.leaf = leaf;
        this.keys = new Index[2 * t - 1];
        this.C = new BTreeNode[2 * t];
        this.n = 0;
    }

    BTreeNode search(int k) {
        int i = 0;
        while (i < n && k > keys[i].id) {
            i++;
        }

        if (!(keys[i]==null)&&keys[i].id == k) {
            return this;
        }

        if (leaf == true) {
            return null;
        }

        return C[i].search(k);

    }

    void insertNonFull(Index k) {

        int i = this.n - 1;
        if (this.leaf == true) {

            while (i >= 0 && this.keys[i].id > k.id) {
                this.keys[i + 1] = this.keys[i];
                i--;
            }

            this.keys[i + 1] = k;
            n = n + 1;
        } else {
            while (i >= 0 && this.keys[i].id > k.id) {
                i--;
            }
            if (this.C[i + 1].n == 2 * this.MinDeg - 1) {
                splitChild(i + 1, this.C[i + 1]);
                if (this.keys[i + 1].id < k.id) {
                    i++;
                }
            }

            this.C[i + 1].insertNonFull(k);
        }

    }

    void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.MinDeg, y.leaf);
        z.n = y.MinDeg - 1;

        for (int j = 0; j < y.MinDeg - 1; j++) {
            z.keys[j] = y.keys[j + y.MinDeg];
        }

        if (y.leaf == false) {
            for (int j = 0; j < y.MinDeg; j++) {
                z.C[j] = y.C[j + y.MinDeg];
            }
        }

        y.n = y.MinDeg - 1;

        for (int j = n; j >= i + 1; j--) {
            this.C[j + 1] = this.C[j];
        }

        this.C[i + 1] = z;

        for (int j = n - 1; j >= i; j--) {
            this.keys[j + 1] = this.keys[j];
        }

        this.keys[i] = y.keys[this.MinDeg - 1];

        this.n = n + 1;

    }
  //**********************************************************************************//  
    //Delete method
     int findKey(Index k) {
        int idx= 0;
        while (idx < n && keys[idx].id < k.id)
            ++idx;
        return idx;
    }

    void remove(Index k) {
        int idx = findKey(k);

        if (idx < n && keys[idx].id == k.id) {

            if (leaf)
                removeFromLeaf(idx);
            else
                removeFromNonLeaf(idx);
        } else {

            if (leaf) {
                System.out.println("The key " + k + " is does not exist in the tree\n");
                return;
            }
            boolean flag = ((idx == n) ? true : false);

            if (C[idx].n < MinDeg)
                fill(idx);
            if (flag && idx > n)
                C[idx - 1].remove(k);
            else
                C[idx].remove(k);
        }
        return;
    }

    void removeFromLeaf(int idx) {

        for (int i = idx + 1; i < n; ++i)
            keys[i - 1] = keys[i];
        n--;
        return;
    }

    void removeFromNonLeaf(int idx) {

        Index k = keys[idx];

        if (C[idx].n >= MinDeg) {
            Index pred = getPred(idx);
            keys[idx] = pred;
            C[idx].remove(pred);
        }

        else if (C[idx + 1].n >= MinDeg) {
            Index succ = getSucc(idx);
            keys[idx] = succ;
            C[idx + 1].remove(succ);
        }

        else {
            merge(idx);
            C[idx].remove(k);
        }
        return;
    }
//get predecessor
    Index getPred(int idx) {

        BTreeNode cur = C[idx];
        while (!cur.leaf)
            cur = cur.C[cur.n];

        return cur.keys[cur.n - 1];
    }
//get successor
    Index getSucc(int idx) {

        BTreeNode cur = C[idx + 1];
        while (!cur.leaf)
            cur = cur.C[0];

        return cur.keys[0];
    }

    void fill(int idx) {

        if (idx != 0 && C[idx - 1].n >= MinDeg)
            borrowFromPrev(idx);

        else if (idx != n && C[idx + 1].n >= MinDeg)
            borrowFromNext(idx);

        else {
            if (idx != n)
                merge(idx);
            else
                merge(idx - 1);
        }
        return;
    }

    void borrowFromPrev(int idx) {

        BTreeNode child = C[idx];
        BTreeNode sibling = C[idx - 1];

        for (int i = child.n - 1; i >= 0; --i)
            child.keys[i + 1] = child.keys[i];

        if (!child.leaf) {
            for (int i = child.n; i >= 0; --i)
                child.C[i + 1] = child.C[i];
        }

        child.keys[0] = keys[idx - 1];

        if (!child.leaf)
            child.C[0] = sibling.C[sibling.n];

        keys[idx - 1] = sibling.keys[sibling.n - 1];

        child.n += 1;
        sibling.n -= 1;

        return;
    }

    void borrowFromNext(int idx) {

        BTreeNode child = C[idx];
        BTreeNode sibling = C[idx + 1];

        child.keys[(child.n)] = keys[idx];

        if (!(child.leaf))
            child.C[(child.n) + 1] = sibling.C[0];

        keys[idx] = sibling.keys[0];

        for (int i = 1; i < sibling.n; ++i)
            sibling.keys[i - 1] = sibling.keys[i];

        if (!sibling.leaf) {
            for (int i = 1; i <= sibling.n; ++i)
                sibling.C[i - 1] = sibling.C[i];
        }

        child.n += 1;
        sibling.n -= 1;

        return;
    }

    void merge(int idx) {
        BTreeNode child = C[idx];
        BTreeNode sibling = C[idx + 1];

        child.keys[MinDeg - 1] = keys[idx];

        for (int i = 0; i < sibling.n; ++i)
            child.keys[i + MinDeg] = sibling.keys[i];

        if (!child.leaf) {
            for (int i = 0; i <= sibling.n; ++i)
                child.C[i + MinDeg] = sibling.C[i];
        }

        for (int i = idx + 1; i < n; ++i)
            keys[i - 1] = keys[i];

        for (int i = idx + 2; i <= n; ++i)
            C[i - 1] = C[i];

        child.n += sibling.n + 1;
        n--;

        sibling = null;
        return;
    }

}
