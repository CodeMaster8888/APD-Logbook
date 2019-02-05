package genericMethods;

import java.util.Arrays;

/**
 * Created by U1755050 on 15/10/2018.
 */
public class Swap {


    static <T> Object[] swap(T[] array,int place1, int place2){
        if(place1 < array.length || place2 > array.length){
            new IndexOutOfBoundsException();
        }
        T[] checkArray = array;
        T temp = array[place1];
        array[place1] = array[place2];
        array[place2] = temp;
        return array;
    }












}
