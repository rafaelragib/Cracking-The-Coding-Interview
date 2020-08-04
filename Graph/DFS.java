/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Ragib
 */
public class DFS {

    private int v;
    private LinkedList<Integer> adj[];

    DFS(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSfunc(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSfunc(n, visited);
            }
        }

    }

    void DFS(int v) {
        boolean visited[] = new boolean[this.v];

        DFSfunc(v, visited);
    }

    public static void main(String args[]) {
        DFS dfs = new DFS(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(2, 0);
        dfs.addEdge(0, 4);
        
        dfs.DFS(0);

    }
}
