package chapter4;

import java.util.*;

public class Question1 {



    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        if(n < 1 || graph.length < 1 || graph[0].length < 1) return false;
        Map<Integer, Set<Integer>> g = new HashMap<>();
        initGraph(graph,g);
        return bfs(g,start,target);
    }

    private void initGraph(int [][] graph,Map<Integer,Set<Integer>> g){
        for (int i = 0; i < graph.length; i++){
            int n = graph[i][0];
            if(!g.containsKey(n)) g.put(n,new HashSet<>());
            Set<Integer> set = g.get(n);
            set.add(graph[i][1]);
        }
    }

    private boolean bfs(Map<Integer,Set<Integer>> g,int start,int target){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int n = queue.poll();
            if(n == target) return true;
            Set<Integer> set = g.get(n);
            if(set != null && !set.isEmpty()) set.forEach(queue::add);
        }
        return false;
    }






}
