public class AVLTreeOp {
    public static void main(String[] args) {
           AVL a=new AVL();
            a.root=a.insert(a.root, 10);
		    a.root=a.insert(a.root, 20);
		    a.root=a.insert(a.root, 30);
		    a.root=a.insert(a.root, 40);
		    a.root=a.insert(a.root, 50);
		    a.root=a.insert(a.root, 25);
            a.inorder(a.root);
    }
}


class AVL{
    Node root=null;
    class Node{
        int data;
        Node left,right;
        int height;
    
        Node(int a){
            data=a;
            left=right=null;
            height=1;
        }
    }

    int getHeight(Node n){
        if(n==null){
            return 0;
        }
        else{
            return n.height;
        }
    }

    int getMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    int getBalance(Node n){
        if(n==null){
            return 0;
        }
        else{
            return(getHeight(n.left)-getHeight(n.right));
        }
    }

     Node insert(Node node,int a){
        Node nnode=new Node(a);

        if(node==null){
            node=nnode;
            return node;
        }
        if(a<node.data) {
            node.left=insert(node.left, a);
        }
        else{
            node.right=insert(node.right, a);
        }
        
        node.height=getMax(getHeight(node.left), getHeight(node.right))+1;
        int balance=getBalance(node);

        if(balance>1 && a<node.left.data){
            return rightRotation(node);
        }
        if(balance<-1 && a>node.right.data){
            return leftRotation(node);
        }
        if(balance>1 && a>node.left.data){
            node.left=leftRotation(node.left);
            return rightRotation(node);
        }
        if(balance<-1 && a<node.right.data){
            node.right=rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    Node leftRotation(Node x){
        Node y=x.right;
        Node z=y.left;

        y.left=x;
        x.right=z;

        x.height=getMax(getHeight(x.left), getHeight(x.right))+1;
        y.height=getMax(getHeight(y.left), getHeight(y.right))+1;

        return y;
    }

    Node rightRotation(Node x){
        Node y=x.left;
        Node z=y.right;

        y.right=x;
        x.left=z;

        x.height=getMax(getHeight(x.left), getHeight(x.right))+1;
        y.height=getMax(getHeight(y.left), getHeight(y.right))+1;

        return y;
    }

    void inorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			System.out.println(node.data+" ");
			inorder(node.right);
		}
	}
}
