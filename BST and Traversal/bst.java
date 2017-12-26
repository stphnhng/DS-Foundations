public class bst{

	public static void main(String[]args){
		bst b = new bst();
		b.run();
	}	

	public void run(){
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root, 1);
		bst.root = bst.insert(bst.root, 2);
		bst.root = bst.insert(bst.root, 3);
		bst.root = bst.insert(bst.root, 4);
		bst.root = bst.insert(bst.root, 5);
		BFS bfs = new BFS();
		int h = bfs.height(bst.root);
		for(int i = 1; i <= h; i++){
			bfs.printGivenLevel(bst.root,i);
		}
		System.out.println();
		DFS dfs = new DFS();
		dfs.printPreOrder(bst.root);
		System.out.println();
		dfs.printInOrder(bst.root);
		System.out.println();
		dfs.printPostorder(bst.root);
		System.out.println();
	}


}

// Binary Search Tree
class BinarySearchTree{
	// root of the binary search tree
	Node root;

	// Constructor to initialize tree at null
	public BinarySearchTree(){
		root = null;
	}

	// Insert into Binary Search Tree
	// Parameters:
	//	Node parent: the parent node (used for checking left and right)
	// 	int value: value of the node to be inserted
	public Node insert(Node parent, int value){
		if(parent == null){
			// if no root at all, then insert here.
			return new Node(value, null, null);
		}else{
			if(value < parent.data){
				// goes to left tree
				parent.left = insert(parent.left, value);
			}else{
				// if >= , goes to right tree
				parent.right = insert(parent.right, value);
			}
		}
		return parent;
	}

	public void find(){

	}

	public void delete(){

	}

}

// Node class
class Node{
	int data; // data of node
	Node left; // left child node
	Node right; // right child node

	public Node(int d, Node l, Node r){
		// initialize the values
		this.data = d;
		this.left = l;
		this.right = r;
	}

}

// Breadth First Search (read all nodes on same level first the move to next slevel).
class BFS{

	// finds the height of the tree
	int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
 
    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

}

// Depth First Search (go down trees from left to right)
class DFS{

	void printPreOrder(Node node)
    {
        if (node == null)
            return;
 
        // now deal with the node
        System.out.print(node.data + " ");

        // first recur on left subtree
        printPreOrder(node.left);
 
        // then recur on right subtree
        printPreOrder(node.right);
 
    }

	void printInOrder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        printInOrder(node.left);

        // now deal with the node
        System.out.print(node.data + " ");
 
        // then recur on right subtree
        printInOrder(node.right);
 
    }

	void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        printPostorder(node.left);
 
        // then recur on right subtree
        printPostorder(node.right);
 
        // now deal with the node
        System.out.print(node.data + " ");
    }

}