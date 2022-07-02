
import java.util.*;

//Implementation of DFS Algo.
public class dfsJava {
    private LinkedList<Integer> list[];
    private boolean visited[];

    dfsJava(int vertices) {
        list = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            list[i] = new LinkedList<Integer>();
        }
    }

    void edge(int src, int dest) {
        list[src].add(dest);
    }

    void dfs(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> iter = list[vertex].listIterator();
        while (iter.hasNext()) {
            int adjacent = iter.next();
            if (!visited[adjacent])
                dfs(adjacent); // recursive call to dfs function
        }
    }

    public static void main(String[] args) {
        dfsJava obj = new dfsJava(5);
        obj.edge(0, 1);
        obj.edge(0, 2);
        obj.edge(0, 3);
        obj.edge(2, 4);
        obj.edge(1, 2);

        System.out.println("Final Result for DFS");
        obj.dfs(0);
    }
}