
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PuzzleTest3_2by2{

    private boolean testSolution(int[][] arr) {
        ISudokuSolver s = new SudokuSolver();
		s.setup(2);
        s.readInPuzzle(arr);

        return s.solve();
    }
/*
    @Test
    public void puzzle0() {
        int[][] multi = new int[][]{
		  { 0,0,0,0  },
		  { 0,0,0,0  },
		  { 0,0,0,0  },
		  { 0,0,0,0  }
		};

        assertTrue(testSolution(multi));
    }

    @Test
    public void puzzle1() {
        int[][] multi = new int[][]{
		  { 1,3,2,4  },
		  { 2,4,1,3  },
		  { 3,1,4,2  },
		  { 4,2,3,0  }
		};

        assertTrue(testSolution(multi));
    }
*/

}
