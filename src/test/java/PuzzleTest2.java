
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PuzzleTest2{

    private boolean testSolution(int[][] arr) {
        ISudokuSolver s = new SudokuSolver();
		s.setup(3);
        s.readInPuzzle(arr);

        return s.solve();
    }

    @Test
    public void puzzle0() {

		int[][] multi = new int[][]{
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 },
		  { 0,0,0,0,0,0,0,0,0 }
		};

        assertTrue(testSolution(multi));
    }

    @Test
    public void puzzle1() {

		int[][] multi = new int[][]{
		  { 8, 1, 2, 9, 7, 4, 3, 6, 5 },
		  { 9, 3, 4, 6, 5, 1, 7, 8, 2 },
		  { 7, 6, 5, 0, 2, 3, 9, 4, 1 },
		  { 5, 7, 1, 0, 8, 2, 6, 9, 0 },
		  { 2, 8, 9, 3, 6, 5, 4, 1, 0 },
		  { 6, 4, 3, 7, 1, 9, 2, 5, 0 },
		  { 1, 9, 6, 0, 3, 7, 8, 2, 4 },
		  { 3, 2, 8, 0, 4, 6, 5, 7, 9 },
		  { 4, 5, 7, 2, 9, 8, 1, 3, 6 }
		};

        assertTrue(testSolution(multi));
    }

    @Test
    public void puzzle2() {

		int[][] multi = new int[][]{
		  { 8, 1, 2, 9, 7, 4, 3, 6, 5 },
		  { 9, 3, 4, 6, 5, 1, 7, 8, 2 },
		  { 0, 6, 5, 0, 2, 3, 9, 4, 1 },
		  { 0, 7, 1, 0, 8, 2, 6, 9, 0 },
		  { 0, 8, 9, 3, 6, 5, 4, 1, 0 },
		  { 0, 4, 3, 7, 1, 9, 2, 5, 0 },
		  { 0, 9, 6, 0, 3, 7, 8, 2, 4 },
		  { 3, 2, 8, 0, 4, 6, 5, 7, 9 },
		  { 4, 5, 7, 2, 9, 8, 1, 3, 6 }
		};

        assertTrue(testSolution(multi));
    }

    @Test
    public void puzzle3() {

		int[][] multi = new int[][]{
		  { 8, 1, 2, 9, 7, 4, 3, 6, 5 },
		  { 9, 3, 4, 6, 5, 1, 7, 8, 2 },
		  { 0, 6, 5, 0, 2, 3, 9, 4, 1 },
		  { 0, 7, 1, 0, 8, 2, 6, 9, 0 },
		  { 0, 8, 9, 3, 6, 5, 4, 1, 0 },
		  { 0, 4, 0, 0, 0, 0, 0, 5, 0 },
		  { 0, 9, 6, 0, 3, 7, 8, 2, 4 },
		  { 3, 2, 8, 0, 4, 6, 5, 7, 9 },
		  { 4, 5, 7, 2, 9, 8, 1, 3, 6 }
		};

        assertTrue(testSolution(multi));
    }

}
