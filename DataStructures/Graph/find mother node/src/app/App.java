package app;

import java.util.Iterator;
import java.util.LinkedList;

class Graph{
    int vertices;
    LinkedList<Integer> adjacencyList[];
    Graph(int vertices){
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for(int i=0; i<vertices; i++){
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int source, int destination){
        adjacencyList[source].add(destination);
    }

    void findMotherNode(){
        boolean[] visited = new boolean[vertices];
        int source = 0;
        int result = 0;
        findMotherNodeUtil(source,result, visited);
    }

    void findMotherNodeUtil(int source,int result, boolean[] visited){
        if(visited.length == 0)
        return;
        visited[source] = true;
        Iterator<Integer> iterator = adjacencyList[source].listIterator();
        
        if(iterator.hasNext()){
            while(iterator.hasNext()){
                int next= iterator.next();
                findMotherNodeUtil(next,result, visited);
            }
        }
        if(!iterator.hasNext() && source == result){
            result = source++;
            findMotherNodeUtil(source, result, visited);
        }
        else{
            visited[source]= false;
            return;
        }
    }

    boolean allVisited(boolean[] visited){
        for(boolean visit: visited){
            if(visit == false){
                return false;
            }
        }
        return true;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(4, 1);
        graph.addEdge(5, 2);
        graph.addEdge(5, 6);
        graph.addEdge(6, 4);
        graph.addEdge(6, 0);
        graph.findMotherNode();
    }
}