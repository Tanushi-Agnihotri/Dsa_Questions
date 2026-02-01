
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};


    class Lowest_Common_Ancestor_of_a_Binary_Tree_III {
        public Node lowestCommonAncestor(Node p, Node q) {

            Node p1 = p, q1 = q;

            while(p1!=q1){
                p1=(p1==null)?q:p1.parent;
                q1=(q1==null)?p:q1.parent;
            }
            return p1;

        }
    }
