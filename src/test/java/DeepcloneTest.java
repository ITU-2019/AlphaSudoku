
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeepcloneTest{


    @Test
    public void deepCloneTest1() {
        SudokuSolver s = new SudokuSolver();
        s.setup(3);
        ArrayList<ArrayList<Integer>> d =  SudokuSolver.deepCloneD(s.D);

        d.get(1).add(34);
        assertTrue(s.D.get(1).size() == 9);
        assertTrue(d.get(1).size() == 10);
    }


}
