import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.management.Query;

public class TreeOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.postOrder(root);
        // tree.inOrder(root);
        // tree.levelOrder(root);
        // System.out.println(tree.countNodes(root));
        // System.out.println(tree.sumOfNodes(root));
        // System.out.println(tree.height(root));
        int K=sc.nextInt();
        int result= tree.sumOfNodesAtK(root, K);
        System.out.println(result);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree{
    int index=-1;
    public Node buildTree(int nodes[]){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode=new Node(nodes[index]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
    }

    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }


    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curreNode=q.remove();

            if(curreNode==null){
                // System.out.println();
            
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(curreNode.data+" ");

                if(curreNode.left!=null){
                    q.add(curreNode.left);
                }
                if(curreNode.right!=null){
                    q.add(curreNode.right);
                }
            }
        }
    }

    public int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=countNodes(root.left);
        int rightNode=countNodes(root.right);

        return leftNode+rightNode+1;
    }

    public int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }

    public int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int myHeight=Math.max(leftHeight, rightHeight)+1;

        return myHeight;
    }

    public int sumOfNodesAtK(Node root, int K){
        int level=0;
        int sum=0;
        int flag=0;
        if(root==null){
            return 0;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            // Node curreNode=q.remove();
            int size=q.size();

            while(size-->0){

                Node curreNode=q.peek();
                q.remove();
                // System.out.println();
            
                if(level==K){
                    flag=1;
                    sum=sum+curreNode.data;
                }
            else{
                // System.out.println(curreNode.data+" ");

                if(curreNode.left!=null){
                    q.add(curreNode.left);
                }
                if(curreNode.right!=null){
                    q.add(curreNode.right);
                }
            }
        }
        level++;
        if(flag == 1){
            break;
        }
    }
    return sum;
        
    }
}

