package algorithmsAndDataStructure.algorithms.child;

/**
 * NP-HARD version(Optimization): Traveling Salesperson problem:
 * Description: Imagine there is person who want to travel several cities around the world by taking SHORTEST way. Complete Graph
 * Rule: You can go from any cities to any cities.
 * Question: How you gonna salve this problem?
 * <p>
 * NP-COMPLETE version(Decision): Traveling Salesperson problem:
 * Description: Same with NP-hard version but we gonna look for visit every city and less than 2000Mile or not for example.
 * <p>
 * <p>
 * <p>
 * There are different kind of algorithms for this problem:
 * <p>
 * 1- Constructive Heuristics (Nearest Neighbor)Greedy Algorithm: Pick best next choice
 * Not always working because there might be lighther weight which is bad for routuing in general
 * Time complexity: O(n^2) !!!
 * <p>
 * 2- Brute-Force Algorithms: Try everything, pick the best: Sometimes good : Only working for small nodesi
 * Time complexity = 0(n!) !!!
 * <p>
 * <p>
 * Approximation and Heuristics Algorithms: Find reasonable solutions to hard problems
 * Common: You have some intuition about how you might find a decent path. It may not be the best path at least
 * it is going to eleminate some of the bad paths out there.
 * Difference: In approximation you have bounds since at Heuristic you dont how well it is going to do.
 * <p>
 * Constructive Heuristics: Build a solution
 * Iterative Heuristics: Improve a solution
 * <p>
 * 2-Opt Heuristics Solution: Replace pair nodes with alternative and check it if new solution path better than current best.
 * <p>
 * TCP(Optimal solution): Greedy + 2-opt Algorithms
 * <p>
 * Not: if the problem is probably "hard", consider revising the problem constraints
 */
public class NpHardAlgorithm {
}
