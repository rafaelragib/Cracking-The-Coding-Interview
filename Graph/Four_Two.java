/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

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
public class Four_Two {
    Node root;
    Four_Two()
    {
        root=null;
    }
    
    void insertVal(int ar[])
    {
        root= insertVal(ar,0,ar.length-1);
    }
    Node insertVal(int ar[],int start,int end)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        Node n=new Node(ar[mid]);
        n.left= insertVal(ar, start, mid-1);
       
        n.right= insertVal(ar, mid+1, end);
       // System.out.println(n.data);
        return n;
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
    
    public static void main(String args[])
    {
        Four_Two four_Two=new Four_Two();
        int ar[]={1,2,3,4,5,6,7};
        four_Two.insertVal(ar);
        four_Two.InOrderTrav();
    }
    
    
    
    
}

