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
public class BFS {

    private int v;
    private LinkedList<Integer> adj[];

    BFS(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFSsearch(int s) {

        boolean visited[] = new boolean[v];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    public static void main(String[] args) {
        BFS bfs = new BFS(5);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(0, 4);
        bfs.addEdge(2, 0);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);
        bfs.BFSsearch(0);
        
    }
}
