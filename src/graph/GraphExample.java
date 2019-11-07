package graph;

public class GraphExample {

    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 4);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 1, 4);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 4);

        graph.printGraph(graph);

        System.out.println("\nBFS: " );
        graph.BFS(1);
        System.out.println("\nBFS: " );
        graph.BFS(0);

    }
}
