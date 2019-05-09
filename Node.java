package datastructur_Aufgabe1;

public class Node {
		String name;
		Neighbor adjList;
		Node (String name,Neighbor neighbors){
			this.name = name;
			this.adjList = neighbors;
		}
	}
