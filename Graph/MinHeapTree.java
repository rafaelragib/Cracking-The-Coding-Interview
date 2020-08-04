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
public class MinHeapTree {

    private int[] Heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public MinHeapTree(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int temp;
        temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    private void minHeapfiy(int pos) {
        
        if(Heap[pos]<Heap[parent(pos)])
        {
            swap(pos,parent(pos));
            minHeapfiy(parent(pos));
        }
        
        
        
        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[pos] > Heap[leftChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapfiy(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapfiy(pos);
                }
            }

        }
    }

    public void insert(int element) {
        if (size >= maxSize) {
            return;
        }
        Heap[++size] = element;
        int current = size;
        if (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        minHeapfiy(current);

    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {

            System.out.println("Parent: " + Heap[i] + "Left Child: " + Heap[2 * i]
                    + "Right Child: " + Heap[2 * i + 1]);

        }
    }
    
    public int remove()
    {
        int popped=Heap[FRONT];
        Heap[FRONT]=Heap[size--];
        minHeapfiy(FRONT);
        return popped;
        
    }
    public static void main(String args[])
    {
        MinHeapTree minHeapTree =new MinHeapTree(5);
        minHeapTree.insert(50);
        minHeapTree.insert(20);
        minHeapTree.insert(80);
        minHeapTree.insert(10);
        minHeapTree.insert(150);
        
        minHeapTree.print();
        
        System.out.println(minHeapTree.remove());
        minHeapTree.print();
        




    }
}
