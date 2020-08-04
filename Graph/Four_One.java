/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Ragib
 */
public class Four_One {

    private int v;
    private LinkedList<Integer> adj[];
    
    Four_One(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    
    void add_edge(int v, int w) {
        adj[v].add(w);
    }
    
    boolean routeFind(int s, int d) {
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            s = queue.poll();
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (n == d) {
                    return true;
                } else if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Four_One four_one =new Four_One(6);
        four_one.add_edge(1, 2);
        four_one.add_edge(2,3);
        four_one.add_edge(3, 4);
        four_one.add_edge(5, 6);

        System.out.println(four_one.routeFind(1, 5));
        
        
    }
    
}
