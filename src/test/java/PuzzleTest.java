
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PuzzleTest{

    private boolean testSolution(int[][] arr) {
        ISudokuSolver s = new SudokuSolver();
		s.setup(3);
        s.readInPuzzle(arr);

        return s.solve();
    }

    @Test
    public void GoodPuzzle() {
        int[][] multi = new int[][]{
		  { 8, 1, 2, 9, 7, 4, 3, 6, 5 },
		  { 9, 3, 4, 6, 5, 1, 7, 8, 2 },
		  { 7, 6, 5, 8, 2, 3, 9, 4, 1 },
		  { 5, 7, 1, 4, 8, 2, 6, 9, 3 },
		  { 2, 8, 9, 3, 6, 5, 4, 1, 7 },
		  { 6, 4, 3, 7, 1, 9, 2, 5, 8 },
		  { 1, 9, 6, 5, 3, 7, 8, 2, 4 },
		  { 3, 2, 8, 1, 4, 6, 5, 7, 9 },
		  { 4, 5, 7, 2, 9, 8, 1, 3, 6 }
		};

        assertTrue(testSolution(multi));
    }
    @Test
    public void BadPuzzle() {
        int[][] multi = new int[][]{
		  { 2, 1, 2, 9, 7, 4, 3, 6, 5 },
		  { 9, 3, 4, 6, 5, 1, 7, 8, 2 },
		  { 7, 6, 5, 8, 2, 3, 9, 4, 1 },
		  { 5, 7, 1, 4, 8, 2, 6, 9, 3 },
		  { 2, 8, 9, 3, 6, 5, 4, 1, 7 },
		  { 6, 4, 3, 7, 1, 9, 2, 5, 8 },
		  { 1, 9, 6, 5, 3, 7, 8, 2, 4 },
		  { 3, 2, 8, 1, 4, 6, 5, 7, 9 },
		  { 4, 5, 7, 2, 9, 8, 1, 3, 6 }
		};

        assertTrue(! testSolution(multi)); // false test
    }

}
