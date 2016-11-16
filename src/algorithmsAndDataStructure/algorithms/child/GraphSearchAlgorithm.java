package algorithmsAndDataStructure.algorithms.child;

/**
 * Searching Algorithms in Graph Data Structure:
 * <p>
 * DFS: Depth-first search
 *
 * Pseudo Code:
 * Initialize: stack
 * visited HashSet
 * parent HashMap
 * Push node onto stack and add to visited
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
 *
 * <p>
 * DFS(currentNode,goal,visited,parents):
 * if currentNode == goal return;
 * for each of currentNode's neighbors,n, not in visited set:
 * add n to visited set
 * add currentNode as n's parent in parents map
 * DFS(n,goal,visited,parents)
 * <p>
 * BFS: Breadth-first search
 *
 * Pseudo Code:
 * Initialize: queue
 * visited HashSet
 * parent HashMap
 * Push node onto queue and add to visited
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
 *
 * Dijkstra: Search ALgorithm
 * Weighted graph,
 * Using data structure: Priority queue (Widely used at Heaps too nad can prioritize low values(Min-Heap) or high value(Max-Heap))
 *
 * Pseudo Code:
 *
 * Initialize: Priority queue (PQ), visited HashSet, parent HashMap, and distances to infinity
 * Enqueue {node,goal} onto the PQ
 * while PQ is not emty:
 * dequeue node current from front of queue
 * if(current is not visited)
 *  add current to visited set
 *  if (current == goal) return parent map
 *  for each of current's neighbors, n, not visited set:
 *  if(path through current to n is shorter)
 *  update n's distance
 *  update current as n's parent in parent map
 *  enqueu{n,distnce} into the PQ
 *
 *  // if we get here then there's no path
 *
 *  Note1: We can actually have single node be in the queue multiple times at different priorities.
 *           Check this condition at very first time.
 *<p>
 *
 *  Note2: Priority Queue ordering is based on:
 *  g(n): the distance (Cost) from start vertex to vertex n
 *
 * A*:
 * Weighted graph:
 * add h(n) on to g(n)
 * Using data structure: Priority queue (Widely used at Heaps too nad can prioritize low values(Min-Heap) or high value(Max-Heap))
 *    h(n): the heuristic estimated cost from vertex n to goal vertex
 * f(n) = g(n) + h(n)
 *
 * Note3: Dijkstra is special case of A* where h(n) = 0
 * Pseudo Code:
 *
 *
 * Np-Complete example:
 *
 * Hamiltonian graph: A graph is Hamiltonian if there is a path through the graph which visits each vertext exacly once.
 * Hamiltonian cycle: Go each node in graph once and come back to start point.
 *
 * Hamiltonian problem is classic Np-complete problem: We dont know if there is efficient way
 * to understand whether there is Hamiltonian path through graph or not.BUT if someone produce to candidate
 * Hamiltonian path for us, we would be able to check whether Hamiltonian path is, indeed, a Hamiltonian path.
 *
 * Eulerian Graph: Like Hamiltonian walking around edge instead of vertex and each edge traverses exacly once.
 * Tips: Criteria for graph is being Eulerian is at most 2 nodes of odd degree in the graph.
 *
 * Recently There are Hamiltonian problem at Genome sequencing and scientist are recently approach this problem by applying
 * Eulerian solution .
 *
 * Read More:http://stackoverflow.com/questions/1857244/what-are-the-differences-between-np-np-complete-and-np-hard
 *
 * <p>
 * TODO: Implementation.
 */
public class GraphSearchAlgorithm {


}
