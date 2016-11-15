package algorithmsAndDataStructure.algorithms.child;

/**
 * Searching Algorithms in Graph Data Structure:
 * <p>
 * DFS: Depth-first search
 * Pseudo Code:
 * Initialize: stack
 * visited HashSet
 * parent HashMap
 * Push Node onto stack and add to visited
 * while stack is not empty:
 * pop node current from top of stack
 * if current == Goal return parent map
 * for each of current's neighbors, n, not in visited set:
 * add n to visited set
 * add current as n's parent in parent map
 * push n onto the stack
 * // if we get here then there 's no path
 * <p>
 * Recursivevly: Hidden stack managing the recursion itself..
 * <p>
 * DFS(currentNode,goal,visited,parents):
 * if currentNode == goal return;
 * for each of currentNode's neighbors,n, not in visited set:
 * add n to visited set
 * add currentNode as n's parent in parents map
 * DFS(n,goal,visited,parents)
 * <p>
 * BFS: Breadth-first search
 * Pseudo Code:
 * Initialize: queue
 * visited HashSet
 * parent HashMap
 * Push Node onto queue and add to visited
 * while stack is not empty:
 * pop node current from top of stack
 * if current == Goal return parent map
 * for each of current's neighbors, n, not in visited set:
 * add n to visited set
 * add current as n's parent in parent map
 * push n onto the queue
 * // if we get here then there 's no path
 * <p>
 * !!Only difference between DFS and BFS is data structure which day keep track visited vertex at Graph(Stack-queue):
 * <p>
 * TODO: Implementation.
 */
public class GraphSearchAlgorithm {

}
