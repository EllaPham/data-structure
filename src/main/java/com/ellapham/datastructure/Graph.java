/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
    public List<GraphNode> matricStackResult = new ArrayList<>();
    public List<GraphNode> result = new ArrayList<>();
    public List<GraphNode> BFSResult = new ArrayList<>();
    public Boolean[][] ADJMatrix = new Boolean[100][100];
    public List<GraphNode> DFSMatrixResult = new ArrayList<>();

    public Set<GraphNode> getNodes() {
        return nodes;
    }

    public void setNodes(Set<GraphNode> nodes) {
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

    private void DFSMatrix(GraphNode start) {
        List<GraphNode> adjList = new ArrayList<>();
        this.setADJMatrix();

        int tmp = -1;
        GraphNode tmpNode = null;
        if (!start.visited) {
            DFSMatrixResult.add(start);
        }
        start.visited = true;
        for (int i = 0; i < 100; i++) {
            if (start.value == i) {
                tmp = i;
            }
        }
        for (int j = 0; j < 100; j++) {
            if (ADJMatrix[tmp][j]) {
                tmpNode = findNodeByValue(j);
                if (!tmpNode.visited) {
                    adjList.add(tmpNode);

                }

            }
        }
        for (GraphNode n : adjList) {
            DFSMatrix(n);
        }
    }

    private void DFSMatrixStack(GraphNode start) {
        this.setADJMatrix();
        int tmp = 0;
        Stack<GraphNode> matrixStack = new Stack<>();
        GraphNode tmpNode;
        GraphNode aNode;
        matricStackResult.add(start);
        start.visited = true;
        for (int i = 0; i < 100; i++) {
            if (start.value == i) {
                tmp = i;
            }
        }
        for (int j = 0; j < 100; j++) {
            if (ADJMatrix[tmp][j]) {
                tmpNode = findNodeByValue(j);
                if (!tmpNode.visited) {
                    matrixStack.push(tmpNode);
                }
            }
        }

        while (!matrixStack.isEmpty()) {
            aNode = matrixStack.pop();
            matricStackResult.add(aNode);
            aNode.visited = true;
            for (int k = 0; k < 100; k++) {
                GraphNode tmpNodek;
                if (ADJMatrix[aNode.value][k]) {
                    tmpNodek = findNodeByValue(k);
                    if (!tmpNodek.visited) {
                        matrixStack.push(tmpNodek);
                    }
                }
            }
            System.out.println(matrixStack);

        }

    }

    private void BFS(GraphNode start) {
        Queue<GraphNode> q = new LinkedList<>();
        GraphNode tmpNode;
        BFSResult.add(start);
        start.visited = true;
        q.addAll(start.adjacency);
        while (!q.isEmpty()) {
            tmpNode = q.poll();
            if(!tmpNode.visited){
                 BFSResult.add(tmpNode);
            }
           
            tmpNode.visited = true;
                                    
            for (GraphNode n : tmpNode.adjacency) {
                if (!n.visited) {
                    q.add(n);
                }
            }
        }
    }

    public void printBFS(GraphNode start) {
        this.BFS(start);
        System.out.println("BFS a graph result: ");
        for (GraphNode n : BFSResult) {
            System.out.print(n.value + "  ");
        }
    }

    private void BFSMatrix(GraphNode start) {
        this.setADJMatrix();
    }

    public void printDFSMatrixStack(GraphNode start) {
        this.DFSMatrixStack(start);
        System.out.println("DFS a graph using matrix & stack: ");
        for (GraphNode n : matricStackResult) {
            System.out.println(n.value + "  ");
        }
    }

    public void printDFSMatric(GraphNode start) {
        this.DFSMatrix(start);
        System.out.println("DFS Using matric and recursive: ");
        for (GraphNode n : DFSMatrixResult) {
            System.out.print(n.value + "  ");
        }
    }

    public List<GraphNode> getAdjNodes(GraphNode aNode) {
        List<GraphNode> lstNode = new ArrayList<>();
        lstNode = aNode.adjacency;
        return lstNode;
    }

    private void setADJMatrix() {
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

    private GraphNode findNodeByValue(int value) {

        for (GraphNode n : nodes) {
            if (n.value == value) {
                return n;
            }
        }
        return null;
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

    private void init() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ADJMatrix[i][j] = false;
            }
        }
    }

}
