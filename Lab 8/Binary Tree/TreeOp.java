import java.util.Stack;
public class TreeOp {
    public static void main(String[] args) {
        BinarySearch b= new BinarySearch();
        b.insert(10);
        b.insert(20);
        b.insert(30);
        b.insert(40);
        b.insert(35);
        b.insert(25);
        b.insert(15);

        b.Delete(20);
        b.inorder();
        // b.inorder(15);
        // b.inorder(10);
        // b.inorder(25);
        // b.postOrder();
        // b.postOrder(13);
        // b.postOrder(9);
        // b.postOrder(25);
        // b.postOrder(5);
        // b.preOrder();
        // b.preOrder(10);
        // b.preOrder(11);
        // b.postOrder();
        
    }
}

 class BinarySearch{
    Node root=null;
    class Node{
        int data;
        Node left;
        Node right;

        Node(int a){
            data=a;
            this.left=null;
            this.right=null;
        }
    }

    public void insert(int a){
        Node nnode=new Node(a);
        if(root==null){
            root=nnode;
            // System.out.println(root.data);
        }
        
        else{
        Node temp=root;
        while(temp.left!=null || temp.right!=null)
        {
            if(nnode.data>=temp.data && temp.right!=null){
                temp=temp.right;
            }
            else if(nnode.data<temp.data && temp.left!=null){
                temp=temp.left;
            }
            else{
                break;
            }
        }
        if(nnode.data>=temp.data){
            temp.right=nnode;
            // System.out.println(temp.data);
        }
        else {
            temp.left=nnode;
            // System.out.println(temp.data);
        }
    }
        
    }

    public void inorder(){
        Stack<Node> st=new Stack<Node>();
        Node temp=root;
        while(temp!=null || st.size()>0){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
        temp=st.pop();
        System.out.println(temp.data);
        temp=temp.right;
        }
    }

    public void preOrder(){
        
        Stack<Node> st=new Stack<Node>();
        st.push(root);
        
        while(st.size()>=0){
            Node t=st.pop();
            System.out.println(t.data);
            if(t.left!=null){
                st.push(t.left);
            }
            if(t.right!=null){
                st.push(t.right);
            }
        }

    }

    public void postOrder(){
        Stack<Node> st=new Stack<Node>();
        Stack<Node> st1=new Stack<Node>();
        Node temp=root;
        st.push(root);
        while(st.size()>0){
             temp=st.pop();
            st1.push(temp);
            if(temp.left!=null){
                st.push(temp.left);
            }
            if(temp.right!=null){
                st.push(temp.right);
            }
        }
        while(st1.size()>0){
             temp=st1.pop();
            System.out.println(temp.data);
        }

    }

    public void Delete(int n){
        Node parent=null;
        Node temp=root;

        while(temp!=null && temp.data!=n){
            parent=temp;
            if(n>temp.data){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        if(temp.left==null && temp.right==null){
            if(parent.data>n){
                parent.left=null;
            }
            else{
                parent.right=null;
            }
        }

        if(temp.left!=null && temp.right==null){
            parent.left=temp.left;
        }
        if(temp.right!=null && temp.left==null){
            parent.right=temp.right;
        }
        if(temp.left!=null && temp.right!=null){
            Node t=success(temp);
            temp.data=t.data;
        }
    }

    public Node success(Node temp){
        boolean rightchild=true;
        Node parent=temp;
        temp=temp.right;
        if(temp.left!=null){
            rightchild=false;
        }
        while(temp.left!=null){
            parent=temp;
            temp=temp.left;
        }
        if(rightchild){
            parent.right=temp.right;
        }
        if(!rightchild){
            parent.left=temp.right;
        }
        return temp;
    }
}
