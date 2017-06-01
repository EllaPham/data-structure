/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Trang
 */
public class Graph {

//    public Set<GraphNode> nodes = new HashSet<>();
    public Set<GraphNode> nodes = new HashSet<>();
    public Set<GraphLink> links = new HashSet<>();
    public Stack<GraphNode> myStack = new Stack<>();
    public List<GraphNode> result = new ArrayList<>();
    public Boolean[][] ADJMatrix = new Boolean[100][100];

    public  Set<GraphNode> getNodes() {
        return nodes;
    }

    public void setNodes( Set<GraphNode> nodes) {
        this.nodes = nodes;
    }

    public Set<GraphLink> getLinks() {
        return links;
    }

    public void setLinks(Set<GraphLink> links) {
        this.links = links;
    }

    public void addNodes(GraphNode... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }

    public void addLinks(GraphLink... links) {
        this.links.addAll(Arrays.asList(links));
    }

    public void DFS(GraphNode startNode) {
        List<GraphNode> myList = new ArrayList<>();
        myList = startNode.adjacency;
        startNode.visited = true;

        System.out.print(startNode.value + "  ");
        for (GraphNode aNode : myList) {
            if (!aNode.visited) {
                DFS(aNode);
            }
        }
    }

    public List<GraphNode> DFSStack(GraphNode start) {
        GraphNode tmp;
        start.visited = true;
        result.add(start);

        for (GraphNode i : start.adjacency) {
            if (!i.visited) {
                myStack.push(i);
            }
        }

        while (!myStack.isEmpty()) {
            tmp = myStack.pop();
            result.add(tmp);
            tmp.visited = true;
            for (GraphNode n : tmp.adjacency) {
                if (!n.visited) {
                    myStack.push(n);
                }
            }
        }
        return result;
    }

    public void DFSMatrix(GraphNode startNode) {

    }

    public void DFSMatrixStack(GraphNode startNode) {

    }

    public List<GraphNode> getAdjNodes(GraphNode aNode) {
        List<GraphNode> lstNode = new ArrayList<>();
        lstNode = aNode.adjacency;
        return lstNode;
    }


    public void setADJMatrix() {
        List<GraphNode> adjList = new ArrayList<>();
         List<GraphNode> tmpList = new ArrayList<>(nodes);
      
        this.init();
        for (int i = 0; i < tmpList.size(); i++) {
             
            adjList = tmpList.get(i).adjacency;
            for (int j = 0; j < tmpList.size(); j++) {

                if (!adjList.isEmpty() && adjList.contains(tmpList.get(j))) {
                    ADJMatrix[tmpList.get(i).value][tmpList.get(j).value] = true;
                }

            }
        }

    }

    public Boolean[][] getADJMatrix() {
        return ADJMatrix;
    }

    public void printADJMatrix() {
        this.setADJMatrix();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (ADJMatrix[i][j]) {
                    System.out.println("ADJMatrix[" + i + "][" + j + "] = " + ADJMatrix[i][j]);
                }
            }
        }

    }

    public void init() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ADJMatrix[i][j] = false;
            }
        }
    }

}
