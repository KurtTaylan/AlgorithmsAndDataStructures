package algorithmsAndDataStructure.domain.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Adjacency Matrix :
 * <p>
 * 2D array based implementation of graph
 * + Test edge
 * + Add edge
 * - Add vertex
 * - Requires Huge memory
 */
public class GraphAdjMatrix extends Graph {


    private int[][] adjMatrix;


    @Override
    public void implementAddVertex() {

        int v = getNumVertices();

        if (v >= adjMatrix.length) {
            int[][] newAdjMatrix = new int[v * 2][v * 2];

            for (int i = 0; i < adjMatrix.length; i++) {
                for (int j = 0; j < adjMatrix.length; j++) {
                    newAdjMatrix[i][j] = adjMatrix[i][j];
                }
            }
            adjMatrix = newAdjMatrix;
        }

        for (int i = 0; i < adjMatrix[v].length; i++) {
            adjMatrix[v][i] = 0;
        }
    }


    @Override
    public void implementAddEdge(int v, int w) {
        adjMatrix[v][w] = 1;
    }


    /* To get two hop neighbours we simple matrix multiplication for finding
     * two-hop neighbors!
     */
    @Override
    public List<Integer> getNeighbours(int vertixRow) {
        List<Integer> neighbours = new ArrayList<>();

        for (int i = 0; i < getNumVertices(); i++) {
            for (int j = 0; j < adjMatrix[vertixRow][i]; j++) {

            }
        }

        return neighbours;
    }
}
