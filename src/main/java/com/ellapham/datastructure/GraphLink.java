package com.ellapham.datastructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trang
 */
public class GraphLink {
    GraphNode start;
    GraphNode end;

    public GraphLink(GraphNode start, GraphNode end, Graph g) {
        this.start = start;
        this.end = end;
        g.addLinks(this);
    }
    
}
