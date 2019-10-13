public void PrintTree(Node focusNode) {
// Recursion is used to go to one node and then go to its child nodes and so forth
    if (focusNode != null) {
        PrintTree(focusNode.leftChild);                              // Traverse the left node
        System.out.print(focusNode + " ");                           // Visit the currently focused on node
        PrintTree(focusNode.rightChild);                             // Traverse the right node
    }
}
