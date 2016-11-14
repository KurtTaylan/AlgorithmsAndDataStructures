package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.commonBehavior.Traversable;
import algorithmsAndDataStructure.algorithms.parent.TraverseAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Tree is most of the time more efficient data structure than others.
 * <p>
 * There are some traverse algorithms you can use under different conditions.
 * <p>
 * E.g:    Case             Data Structure               Strategy
 * <p>
 * Social-network           Heap                 Level-order (Breath-first)
 * Dictionary              Tries                 Level-order (Breath-first)
 * Classic Search        Balanced-BST            Pre-order   (Depth-first)
 */
public class TreeSearchAlgorithm extends TraverseAlgorithm implements Traversable {


    @Override
    protected void traverseFor(String word) {
        List<Airport> sampleList = new ArrayList<>();
        util.prepareSampleList(sampleList);
        TreeSet<Airport> tree = new TreeSet<>();
    }


    @Override
    public void postOrder(TreeSet treeSet) {

    }


    @Override
    public void preOrder(TreeSet treeSet) {

    }


    @Override
    public void inOrder(TreeSet treeSet) {

    }


    @Override
    public void levelOrder(TreeSet treeSet) {

    }
}
