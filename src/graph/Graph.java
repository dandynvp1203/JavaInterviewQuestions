package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    public int vertices;
    LinkedList<Integer> adjListArray[];

    Graph(int vertices) {
            this.vertices = vertices;

            adjListArray = new LinkedList[vertices];

            for(int i = 0; i < vertices; i++) {
                adjListArray[i] = new LinkedList<>();
            }
    }

    public void DFSUtil(int v, boolean[] visited) {

        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adjListArray[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[vertices];

        DFSUtil(v, visited);
    }

    //****** Breadth First Search *******
    public void BFS(int s) {
        boolean visited[] = new boolean[vertices];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adjListArray[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void addEdge(Graph graph, int src, int dest) {
        graph.adjListArray[src].add(dest);

        //undirected graph
        graph.adjListArray[dest].add(src);
    }

    public static void printGraph(Graph graph) {
        for (int i = 0; i < graph.vertices; i++) {
            System.out.println("Adjacency list of vertices: " + i);
            System.out.print("Head: ");
            for (Integer node: graph.adjListArray[i]) {
                System.out.print(" -> " + node);
            }
            System.out.print('\n');
        }
    }
}
