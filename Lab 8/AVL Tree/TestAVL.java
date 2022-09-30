class AVL{
	Node root;
	class Node{
		int data,height;
		Node left,right;
		Node(int a){
			data=a;
			height=1;
			left=right=null;
		}
	}
	int getHeight(Node T) {
		if(T==null) {
			return 0;
		}
		else {
			return T.height;
		}
	}
	int getMax(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	Node leftRotate(Node X) {
		Node Y=X.right;
		Node Z=Y.left;
		Y.left=X;
		X.right=Z;
		X.height=getMax(getHeight(X.left),getHeight(X.right))+1;
		Y.height=getMax(getHeight(Y.left),getHeight(Y.right))+1;
		return Y;
	}
	int getBalance(Node N) {
		if(N==null) {
			return 0;
		}
		return (getHeight(N.left)-getHeight(N.right));
	}
	Node rightRotate(Node X) {
		Node Y=X.left;
		Node Z=Y.right;
		
		Y.right=X;
		X.left=Z;
		
		X.height=getMax(getHeight(X.left),getHeight(X.right))+1;
		Y.height=getMax(getHeight(Y.left),getHeight(Y.right))+1;
		
		return Y; 
	}
	Node insert(Node node,int a) {
		Node nnode=new Node(a);
		if(node==null) {
			node=nnode;
			return node;
		}
		if(a<node.data) {
			node.left=insert(node.left,a);
		}
		else {
			node.right=insert(node.right,a);
		}
		node.height=getMax(getHeight(node.left), getHeight(node.right))+1;
		int balance = getBalance(node);
		
		if(balance>1 && a <node.left.data) {
			return rightRotate(node); 
		}
		if(balance<-1 && a>node.right.data) {
			return leftRotate(node);
		}
		if(balance>1 && a>node.left.data) {
			node.left=leftRotate(node.left);
			return rightRotate(node);
		}
		if(balance<-1 && a<node.right.data) {
			node.right=rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}
	void inorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			System.out.println(node.data+" ");
			inorder(node.right);
		}
	}
	
}
public class TestAVL{
	public static void main(String [] args) {
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