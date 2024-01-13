package problems;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LeftRotationTest {

    /**
     * Testing the LeftRotation problem
     */
    @Test
    public void test () {
        final ArrayList<Integer> array = new ArrayList<Integer>();
        array.add( 1 );
        array.add( 2 );
        array.add( 3 );
        array.add( 4 );
        array.add( 5 );

        final List<Integer> result = LeftRotation.rotateLeft( 4, array );

        final ArrayList<Integer> solution = new ArrayList<Integer>();

        solution.add( 5 );
        solution.add( 1 );
        solution.add( 2 );
        solution.add( 3 );
        solution.add( 4 );

        assertEquals( result.size(), solution.size() );
        assertEquals( result.get( 0 ), solution.get( 0 ) );
        assertEquals( result.get( 1 ), solution.get( 1 ) );
        assertEquals( result.get( 2 ), solution.get( 2 ) );
        assertEquals( result.get( 3 ), solution.get( 3 ) );
        assertEquals( result.get( 4 ), solution.get( 4 ) );

    }

}
