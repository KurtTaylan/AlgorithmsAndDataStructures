package algorithmsAndDataStructure.algorithms.commonBehavior;

import java.util.TreeSet;

/**
 * Responsible for tree traverse algorithms like;
 * - pre-order
 * - in-order
 * - post-order : Depth-firt
 * - level-order : Breath-first
 * <p>
 * <p>
 * These Algorithms are differ from each other by changeing order of these three instructions:
 * 1-Visit node itself
 * 2-Visit left-node child
 * 3-Visit right-node child
 */
public interface Traversable {


    void postOrder(TreeSet treeSet);


    void preOrder(TreeSet treeSet);


    void inOrder(TreeSet treeSet);


    void levelOrder(TreeSet treeSet);
}
