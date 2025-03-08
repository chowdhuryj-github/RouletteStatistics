
// the necessary imports
import java.util.Arrays;
import java.util.List;


/**
 * the roulette class
 */
public class Roulette {


    // setting up the attributes for the colored numbers
    private final List<Integer> redNumbers;
    private final List<Integer> blackNumbers;
    private final List<Integer> greenNumbers;

    /**
     * constructor for Roulette
     * @param redNumbers
     * @param blackNumbers
     * @param greenNumbers
     */
    public Roulette(List<Integer> redNumbers, List<Integer> blackNumbers, List<Integer> greenNumbers) {
        this.redNumbers = Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36);
        this.blackNumbers = Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 29, 31, 33, 35);
        this.greenNumbers = Arrays.asList(0, 00);
    }

    /**
     * method for retrieving the red numbers
     */
    public List<Integer> getRedNumbers() {
        return this.redNumbers;
    }

    /**
     * method for retrieving the black numbers
     */
    public List<Integer> getBlackNumbers() {
        return this.blackNumbers;
    }

    /**
     * method for retrieving the green numbers
     */
    public List<Integer> getGreenNumbers() {
        return this.greenNumbers;
    }


}