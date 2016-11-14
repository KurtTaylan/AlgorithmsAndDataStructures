package algorithmsAndDataStructure.algorithms.parent;

import algorithmsAndDataStructure.domain.Timer;
import algorithmsAndDataStructure.util.AlgorithmUtil;

/**
 * Generic Class template for algorithms
 */
abstract class Algorithm {

    protected static Timer algorithmTimer = new Timer();

    protected AlgorithmUtil util = new AlgorithmUtil();
}
