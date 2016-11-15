package algorithmsAndDataStructure.domain.graph;

import java.util.List;

/**
 * Template for keep track graph for airport route sample.
 */
public abstract class Graph {


    private int numVertices;
    private int numEdges;


    public Graph() {
        this.numEdges = 0;
        this.numEdges = 0;
    }


    public abstract void implementAddVertex();

    public abstract void implementAddEdge(int v, int w);

    public abstract List<Integer> getNeighbours(int v);


    public void addVertex() {
        implementAddVertex();
        numVertices++;
    }


    public void addEdge(int v, int w) {
        implementAddEdge(v, w);
        numEdges++;
    }


    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }
}
