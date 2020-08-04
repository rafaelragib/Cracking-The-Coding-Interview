/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author Ragib
 */

class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
    
}
class Tree
{
    public Node root;
    Tree(){
        root=null;
    }
    public void InsertVal(int data)
    {
        root = insert(root,data);
    }
    public Node insert(Node root,int data)
    {
        if(root==null){
            root=new Node(data);
            return root;
        }
        else if(root.data <data)
            root.right= insert(root.right,data);
        else if(root.data > data)
            root.left=insert(root.left,data);
        return root;
           
    }
    public void inOrder(Node root)
    {
        //System.out.println(root);
        if(root!=null)
        {
            inOrder(root.left);
            //System.out.println("s");
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    
    public void InOrderTrav()
    {
        inOrder(root);
    }
    public void PreOrderTrav()
    {
        inOrder(root);
    }
    
}

public class BinarySearchTree {
    

public static void main(String args[])
{
    Tree tree=new Tree();
    tree.InsertVal(10);
    tree.InsertVal(20);
    tree.InsertVal(5);
    tree.InsertVal(80);
    tree.InsertVal(25);

    tree.InOrderTrav();
    

}
}



