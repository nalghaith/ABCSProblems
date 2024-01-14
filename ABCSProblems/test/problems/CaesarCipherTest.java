package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the caesar cipher algorithm
 *
 * @author Nabeel Alghaith
 */
public class CaesarCipherTest {

    /**
     * Tests the algorithm
     */
    @Test
    public void test () {
        final String example = "one";

        final String solution = CaesarCipher.caesarCipher( example, 1 );

        assertEquals( 'p', solution.charAt( 0 ) );
        assertEquals( 'o', solution.charAt( 1 ) );
        assertEquals( 'f', solution.charAt( 2 ) );
    }

}
