public class Tree {

    //created a Node
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BTrees {
        static int index = -1;
        public static Node tree(int array[]) {
            index++;

            if(array[index] == -1) {
                return null;
            }

            Node newNode = new Node(array[index]);
            newNode.left = tree(array);
            newNode.right = tree(array);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int roots[] = {1, 2, 4, -1, -1, 5, -1, -1, 3 ,-1, 6};
        BTrees peddu = new BTrees();
        Node firstNo = peddu.tree(roots);
        System.out.println();
        System.out.println(firstNo+" ");
    }
}
