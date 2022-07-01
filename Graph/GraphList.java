

import java.util.*;


//Graph: Adjacency List  Representation
public class GraphList
{
    static void edge(ArrayList<ArrayList<Integer>> al,int src, int dest){
        al.get(src).add(dest);
        al.get(dest).add(src);
    }
    
    
public static void main(String[] args){
    int vertex=5;
    ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>(vertex);
    
    for(int i=0;i<vertex;i++)
        al.add(new ArrayList<Integer>());
    
    edge(al,0,1);
    edge(al,0,2);
    edge(al,1,2);
    edge(al,0,3);
    
    display(al);
}

static void display(ArrayList<ArrayList<Integer>> al){
    for(int i=0;i<al.size();i++){
        System.out.println("\nVertex Info: "+i);
        for(int j=0;j<al.get(i).size();j++){
            System.out.print(" ---> "+al.get(i).get(j));
        }
        System.out.println();
    }
}



}