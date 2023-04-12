public class BinaryTreee {

    //Node Class
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree {
        static int indx = -1;          //index for tree  

        public static Node buildTreee(int nodes[]) {
            indx++;
            if(nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTreee(nodes);
            newNode.right = buildTreee(nodes);
            
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3 ,-1, 6};
        BTree tree = new BTree();
        Node root = tree.buildTreee(nodes);
        System.out.println(root.data);
    }
}
