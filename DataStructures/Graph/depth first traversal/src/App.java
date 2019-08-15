import java.util.Iterator;
import java.util.LinkedList;

class Graph {
    int vertices;
    LinkedList<Integer> adjacencyList[];

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++)
            adjacencyList[i] = new LinkedList<Integer>();
    }

    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    void dfs(int source){
        boolean[] visited = new boolean[vertices];
        dfsUtil(source, visited);
    }

    void dfsUtil(int source, boolean[] visited){
        visited[source] = true;
        System.out.print(source + " ");
        Iterator<Integer> iterator = adjacencyList[source].listIterator();
        while(iterator.hasNext()){
            int next = iterator.next();
            if(!visited[next]){
                dfsUtil(next, visited);
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.dfs(2);
    }
}
