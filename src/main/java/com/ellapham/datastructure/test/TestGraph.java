/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.Graph;
import com.ellapham.datastructure.GraphNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trang
 */
public class TestGraph {

    public static void main(String[] args) {
        Graph aGraph = new Graph();

        GraphNode n1 = new GraphNode(1, aGraph);
        GraphNode n2 = new GraphNode(2, aGraph);;
        GraphNode n3 = new GraphNode(3, aGraph);
        GraphNode n4 = new GraphNode(4, aGraph);
        GraphNode n5 = new GraphNode(5, aGraph);
        GraphNode n6 = new GraphNode(6, aGraph);
        GraphNode n7 = new GraphNode(7, aGraph);

//        GraphLink link12 = new GraphLink(n1, n2, aGraph);
//        GraphLink link21 = new GraphLink(n2, n1, aGraph);
//        GraphLink link13 = new GraphLink(n1, n3, aGraph);
//        GraphLink link31 = new GraphLink(n3, n1, aGraph);
//        GraphLink link14 = new GraphLink(n1, n4, aGraph);
//        GraphLink link41 = new GraphLink(n4, n1, aGraph);
//        GraphLink link45 = new GraphLink(n4, n5, aGraph);
//        GraphLink link54 = new GraphLink(n5, n4, aGraph);
//        GraphLink link25 = new GraphLink(n2, n5, aGraph);
//        GraphLink link52 = new GraphLink(n5, n2, aGraph);
//        GraphLink link35 = new GraphLink(n3, n5, aGraph);
//        GraphLink link53 = new GraphLink(n5, n3, aGraph);
        n1.setAdjacency(n2, n3);
        n2.setAdjacency(n5);
        n3.setAdjacency(n1, n5, n6, n7);
        n4.setAdjacency(n5);
        n5.setAdjacency(n3, n4);

//        System.out.println("DFS the graph start from node 1-using list: ");
//        aGraph.DFS(n1);
//        System.out.println("DFS the graph start from node 1-using Stack: ");
//        aGraph.DFSStack(n2);
        
////         Print adj of a node
//       List<GraphNode> DFSList = new ArrayList<>();
//        DFSList= aGraph.DFSStack(n1);
//        System.out.println("PRINT GRAPH NODE: ");
//        for(GraphNode i: DFSList){
//            System.out.print(i.value+ "  ");
//        }
        
       aGraph.printADJMatrix();
        
        
   }
}

