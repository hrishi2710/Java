import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

class Graph{
    int vertices;
    LinkedList<Integer> arr[];
    Graph(int v){
        vertices = v;
        arr = new LinkedList[v];
        for(int i =0; i<v; i++){
            arr[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination){
        arr[source].add(destination);
        arr[destination].add(source);
    }

    void breadthTraversal(int s){
        boolean visitedarr[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();
        visitedarr[s] = true;
        queue.add(s);
        while(queue.size()>0){

            s = queue.poll();
            System.out.print(s + " ");

            ListIterator<Integer> iterator = arr[s].listIterator();
            while(iterator.hasNext()){
                int n = iterator.next();
                if(!visitedarr[n]){
                    visitedarr[n] = true;
                    queue.add(n);
                }
            }
        }

    }
}

public class App {
    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.addEdge(0,4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        graph.breadthTraversal(0);

    }
}
