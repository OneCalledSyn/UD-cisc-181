public class Tree {
    Node root;
    public void addNode(Integer key) {
        Node<Integer> newNode = new Node(key);          //Create and initialize a new node
        if (root == null) {
            root = newNode;                             //If there is no root, this becomes the root
        }
        else {
            Node<Integer> focusNode = root;             //Set the root as the node we traverse the tree from
            Node<Integer> parent;                       //Future parent for the new node

            while (true) {
                parent = focusNode;                     //root is the top parent, start there
                if (key < focusNode.key) {              //Check if the new node should go on the left of the parent node
                    focusNode = focusNode.leftChild;     //Switch focus to the left child
                    if (focusNode == null) {            //If the left child has no children
                        parent.leftChild = new Node;    //then place the new node on its left
                        return;                         //All done!
                    }
                }
                else if (key > focusNode.key) {         //If we get this far, put the node on the right?
                    focusNode = focusNode.rightChild;   //
                    if(focusNode == null) {             //If the right child has no children
                        parent.rightChild = newNode;    //then place the new node on the right of it
                        return;                         //All done!
                    }
                }
                else {                                  //Already in the tree
                    return;
                }
            }
        }
    }
}