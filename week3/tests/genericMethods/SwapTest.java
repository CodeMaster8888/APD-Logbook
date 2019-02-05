package genericMethods;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by U1755050 on 15/10/2018.
 */
class SwapTest extends Swap {

    private Swap test1 = new Swap();


    @Test
    void swapTrueString() {
        String[] array = {"John","Mary","Bob","Jerry","Tom"};
        String[] tempArray = {"John","Jerry","Bob","Mary","Tom"};
        swap(array,1,3);
        assertArrayEquals(array,tempArray);
    }
    @Test
    void swapTrueInteger(){
        Integer[] array = {10,50,0,1000,242933};
        Integer[] tempArray = {242933,50,0,1000,10};
        swap(array,0,4);
        assertArrayEquals(array,tempArray);
    }

    @Test
    void swapFail(){
        Integer[] array = {0,1,2,3,4,5,6};
        Integer[] tempArray = {0,1,2,3,4,5,6};
        swap(array,0,1);
        assertThrows(AssertionError.class,()-> assertArrayEquals(array,tempArray));
    }
    @Test
    void

}