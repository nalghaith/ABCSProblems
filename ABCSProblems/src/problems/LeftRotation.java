package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Left rotation operation on an array of size n shifts of the array's elements
 * 1 unit to the left given integer d.
 *
 * @author Nabeel Alghaith
 */
public class LeftRotation {

    public static void main ( final String[] args ) {

        final ArrayList<Integer> array = new ArrayList<Integer>();

        array.add( 1 );
        array.add( 2 );
        array.add( 3 );
        array.add( 4 );
        array.add( 5 );

        final List<Integer> result = rotateLeft( 2, array );
    }

    /*
     * Complete the 'rotateLeft' function below. The function is expected to
     * return an INTEGER_ARRAY. The function accepts following parameters: 1.
     * INTEGER d 2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft ( final int d, final List<Integer> arr ) {
        // Write your code here
        // int firstInteger = arr[0];
        if ( d == 0 ) {
            return arr;
        }
        final int firstElement = arr.get( 0 );
        for ( int i = 0; i < arr.size() - 1; i++ ) {
            arr.set( i, arr.get( i + 1 ) );
        }
        arr.set( arr.size() - 1, firstElement );
        return rotateLeft( d - 1, arr );
    }

}
