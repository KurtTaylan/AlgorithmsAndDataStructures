package algorithmsAndDataStructure.domain.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Adjacency List:
 * <p>
 * Map implementation of Graph:
 * <p>
 * + Easy to add vertices
 * + Easy to add/remove edges
 * <p>
 * - May use a lot less memory than adjacency matrices
 * <p>
 * Sparse graph: O(1) edges for each vertex. Most of the real project using this graph.
 * :For n vertex there are possible n^2 edges.
 * <p>
 * For dence graphs with lots of edges, |E| will be as large as |V|^2
 */
public class GraphAdjList extends Graph {


    private Map<Integer, ArrayList<Integer>> adjListMap;


    @Override
    public void implementAddVertex() {
        int v = getNumVertices();
        ArrayList<Integer> neighbours = new ArrayList<>();
        adjListMap.put(v, neighbours);
    }


    @Override
    public void implementAddEdge(int v, int w) {
        (adjListMap.get(v)).add(w);
    }


    @Override
    public List<Integer> getNeighbours(int vertexRow) {
        ArrayList<Integer> twoHop = new ArrayList<Integer>();
        ArrayList<Integer> neighbours = adjListMap.get(vertexRow);

        return new ArrayList<>(neighbours);
    }
}
