
import java.util.Scanner;
import java.util.*;

//Implementation of Bellmann Ford Algo.
public class Bellmanford
{
    
    class createedge{
        int s,d,w;
        
        createedge(){
            s=d=w=0;
        }
    };
    
    int V, E;
    createedge edge[];
    
    Bellmanford(int v, int e){
        V=v;
        E=e;
        edge=new createedge[e];
        for(int i=0;i<e;i++){
            edge[i]=new createedge();
        }
    }
    void bellmanford(Bellmanford obj, int s){
        int V=obj.V;
        int E=obj.E;
        int dist[]=new int[V];
        //int w;
    
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;    
        }
        dist[s]=0;
        
        for(int i=1;i<V;i++){
            for(int j=0;j<E;j++){
     
                int a=obj.edge[j].s;
                int b=obj.edge[j].d;
                int c=obj.edge[j].w;
                
                if(dist[a]!=Integer.MAX_VALUE && dist[a]+c < dist[b])
                    dist[b]=dist[a]+c;
            }
        }
        //negative cycle
        for(int j=0;j<E;j++){
            int a=obj.edge[j].s;
            int b=obj.edge[j].d;
            int c=obj.edge[j].w;
                
            if(dist[a]!=Integer.MAX_VALUE && dist[a]+c < dist[b]){
                System.out.println("Negative Cycle");
                return;
            }
        }
        display(dist,V);
    }
    
    void display(int dist[],int V){
        for(int i=0;i<V;i++){
            System.out.println(i + " --- "+dist[i]);
        }
      }
        
    public static void main(String[] args) 
    {
    
        int V=10;
        int E=10;
        
        Bellmanford obj=new Bellmanford(V,E);
        obj.edge[0].s=0;
        obj.edge[0].d=1;
        obj.edge[0].w=5;
        
        obj.edge[1].s=0;
        obj.edge[1].d=2;
        obj.edge[1].w=4;
        
        obj.edge[2].s=1;
        obj.edge[2].d=3;
        obj.edge[2].w=3;
        
        obj.edge[3].s=2;
        obj.edge[3].d=1;
        obj.edge[3].w=6;
        
        obj.edge[4].s=3;
        obj.edge[4].d=2;
        obj.edge[4].w=2;
        
        obj.bellmanford(obj,0);
            
    }
}