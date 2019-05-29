import java.util.LinkedList;

class Graph{
    int vertices;
    LinkedList<Integer> arr[];
    Graph(int v){
        vertices = v;
        arr = new LinkedList[v];
        for(int i =0; i<v ; i++){
            arr[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination){
        arr[source].add(destination);
        arr[destination].add(source);
    }

    void printGraph(){
        for(int v = 0; v< vertices; v++){
            System.out.println("adjacency list of vertices" + v);
            System.out.print("head");
            for (Integer p : arr[v]){
                System.out.print("->" + p);
            }
            System.out.print("\n");
        }
    }
}


public class App {
    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        graph.printGraph();
    }
}
