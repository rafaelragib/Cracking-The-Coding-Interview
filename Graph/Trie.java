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
class TrieNode
{
    static final int ALPHABET_SIZE=26;
    TrieNode[] children =new TrieNode[ALPHABET_SIZE];
    
    boolean isEndOfWord;
    
    TrieNode()
    {
        isEndOfWord=false;
        for(int i=0;i<ALPHABET_SIZE;i++)
            children[i]=null;
    }
}
public class Trie {
 
    static TrieNode root;
    
    void insert(String keys)
    {
        
        int length=keys.length();
        int index;
        
        TrieNode newNode=root;
        
        for(int level=0;level<length;level++)
        {
            index=keys.charAt(level)-'a';
            if(newNode.children[index]==null)
                newNode.children[index]= new TrieNode();
            newNode=newNode.children[index];
        }
        
        newNode.isEndOfWord=true;
    }
    
    boolean search(String keys)
    {
        int length=keys.length();
        int index;
        TrieNode newNode=root;
        
        for(int level=0;level<length;level++)
        {
            index=keys.charAt(level)-'a';
            if(newNode.children[index]==null)
                return false;
            newNode=newNode.children[index];
        }
        
        return (newNode !=null && newNode.isEndOfWord);
    }
    
    public static void main(String args[])
    {
     
        root=new TrieNode();
        Trie trie=new Trie();
        trie.insert("america");
        trie.insert("india");

        if(trie.search("america")==true)
        {
            System.out.println("FOUND");
        }
        if(trie.search("bangladesh")==true)
        {
            System.out.println("FOUND");
        }
        else
            System.out.println("NOT FOUND");
    }
 
 
}
