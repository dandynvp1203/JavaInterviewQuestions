package graph;

import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Integer> adjListArray[];

    Graph(int vertices) {
            this.vertices = vertices;

            adjListArray = new LinkedList[vertices];

            for(int i = 0; i < vertices; i++) {
                adjListArray[i] = new LinkedList<>();
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
