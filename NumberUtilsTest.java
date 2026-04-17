import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    // Issue #1: Statement Coverage
    // Chỉ cần 1 test case có số chẵn để đi vào bên trong lệnh `if` và thực thi `count++`
    @Test
    public void testStatementCoverage() {
        int[] input = {2}; // Mảng có 1 phần tử chẵn
        int result = utils.countEvens(input);
        assertEquals(1, result, "Nên trả về 1 vì có một số chẵn");
    }
}