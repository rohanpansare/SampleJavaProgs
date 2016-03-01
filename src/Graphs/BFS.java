package Graphs;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * Created by Rohan Pansare on 2/29/2016.
 */
public class BFS {
    private LinkedList<Integer> list[];
    private int v;
    BFS(int v){
        this.v = v;
        list = new LinkedList[v];
        for (int i=0;i<v;i++){
            list[i]=new LinkedList<>();
        }
    }
    void addEdge(int u , int v){
        list[u].add(v);
    }
    void BFSTraversal(int s){
    boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> i = list[s].listIterator();
           while(i.hasNext()){
               int n = i.next();
               if(!visited[n]){
                   visited[n]=true;
                   queue.add(n);

               }
           }

        }
    }
    public static void main(String[] args) {
    BFS graph = new BFS(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        graph.BFSTraversal(2);
    }


}
