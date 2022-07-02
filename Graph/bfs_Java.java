
import java.util.*;

//Implementation of BFS Algo.
public class bfs_Java
{
    private int vertex;
    private LinkedList<Integer>adjlist[];
    
    bfs_Java(int v){
        vertex=v;
        adjlist=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjlist[i]=new LinkedList();
        }
    }
    
    void edge(int src,int dest){
        adjlist[src].add(dest);
    }
    
    void bfs(int start){
        boolean visited[]=new boolean[vertex];
        LinkedList<Integer>queue=new LinkedList();
        
        visited[start]=true;
        queue.add(start);
        
        while(queue.size()!=0){
            start=queue.poll();
            System.out.print(start+" ");
            
            Iterator<Integer>i=adjlist[start].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    
    
    
    
    
    public static void main(String[] args) 
    {
       bfs_Java obj=new bfs_Java(4);
       obj.edge(0,1);
       obj.edge(0,2);
       obj.edge(1,2);
       obj.edge(2,3);
       obj.edge(3,3);
       obj.edge(2,0);
       
       System.out.println("Final Result for BFS");
       obj.bfs(0);
    }
}