/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/**
 *
 * @author Trang
 */
public class GraphNode {

    public int value;
    public Boolean visited = false;
    public List<GraphNode> adjacency = new ArrayList<>();
    public Set<GraphLink> links = new HashSet<>();
    

    public GraphNode(int value) {
        this.value = value;
    }

    public GraphNode(int value, Graph g) {
        this.value = value;
        g.addNodes(this);

    }

    public void setAdjacency(GraphNode... nodes) {
        this.adjacency.addAll(Arrays.asList(nodes));

    }


    

   
}
