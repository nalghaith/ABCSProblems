package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Performs a Caesar cipher on any string you input by the integer number of
 * times.
 *
 */
public class CaesarCipher {

    public static void main ( final String[] args ) {
        final String example = "one";

        final String solution = caesarCipher( example, 1 );

        // System.out.println( solution );

    }

    /**
     * Does a caesar cipher on the given string based on the integer k moves
     *
     * @param s
     *            is the string
     * @param k
     *            is the number of times it's shifted
     * @return the string value of the character array
     */
    public static String caesarCipher ( final String s, final int k ) {
        // Get alphabet string
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        final char convertedAlphabet[] = alphabet.toCharArray();

        // Create an array list to make the alphabet to be rotated
        final ArrayList<Character> convertToArray = new ArrayList<Character>();
        final ArrayList<Character> originalList = new ArrayList<Character>();
        for ( int i = 0; i < alphabet.length(); i++ ) {
            convertToArray.add( convertedAlphabet[i] );
            originalList.add( convertedAlphabet[i] );
        }
        // Uses method to rotate the alphabet k number of times
        final List<Character> rotate = rotateLeft( k, convertToArray );
        final char result[] = s.toCharArray();
        char checkCharacter;
        // Goes through each character and checks case and mapping to new
        // alphabet
        for ( int i = 0; i < result.length; i++ ) {
            // Check if character is capital
            boolean isCapital = false;
            // Checks if character is a letter, skips over it otherwise
            if ( Character.isLetter( result[i] ) ) {
                // Checks if the character is uppercase
                if ( Character.isUpperCase( result[i] ) ) {
                    isCapital = true;
                }
                // Set to lowercase to find mapping to rotate alphabet
                if ( isCapital ) {
                    result[i] = Character.toLowerCase( result[i] );
                }
                checkCharacter = rotate.get( originalList.indexOf( result[i] ) );
                // Checks if originally capital and sets it back
                if ( isCapital ) {
                    result[i] = Character.toUpperCase( result[i] );
                }
                // Sets the shifted character to uppercase if the original was
                // uppercase
                if ( Character.isUpperCase( result[i] ) ) {
                    checkCharacter = Character.toUpperCase( checkCharacter );
                }
                result[i] = checkCharacter;
            }
        }

        return String.valueOf( result );
    }

    /*
     * Complete the 'rotateLeft' function below. The function is expected to
     * return an INTEGER_ARRAY. The function accepts following parameters: 1.
     * INTEGER d 2. INTEGER_ARRAY arr
     */

    public static List<Character> rotateLeft ( final int d, final List<Character> arr ) {
        // Write your code here
        // int firstInteger = arr[0];
        if ( d == 0 ) {
            return arr;
        }
        final char firstElement = arr.get( 0 );
        for ( int i = 0; i < arr.size() - 1; i++ ) {
            arr.set( i, arr.get( i + 1 ) );
        }
        arr.set( arr.size() - 1, firstElement );
        return rotateLeft( d - 1, arr );
    }

}
