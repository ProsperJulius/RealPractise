package Miscellenous;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheTester {

    @Test
    public void testSum(){
        int sumfo[]={1,9,3,4,5};
        int results[]={0,1};
        assertEquals(Arrays.toString(results),Arrays.toString(theMain.twoSum(sumfo,10)));
    }
    @Test
    public void testTree(){
        ReserveInteger reverse=new ReserveInteger();
        assertEquals(123456789,ReserveInteger.reverseInteger(987654321));
    }
    @Test
    public void arrayS(){

        int [] numbers={2,4,1,7,8,5};
        int [] expected={1,2,4,5,7,8};
       // ArraySort sorter=new ArraySort();
        ArraySort.divideArray(numbers,numbers.length);
      assertArrayEquals(numbers,expected);
       // ArraySort.arraySort(numbers);
       // assertArrayEquals(expected,numbers);
    }
    @Test
    public void reverseTester(){
       // assertEquals(theMain.optimalReverse("jusa"),"asuj");
      //  assertEquals(theMain.reserveString("jusa"),"asuj");
        LinkedList<Integer> lists= new LinkedList<>();
        lists.add(1);
        lists.add(4);
        lists.add(6);
        lists.add(3);
        lists.add(4);
        lists.add(2);
        lists.add(9);

        assertEquals(3,OntheRun.possibleCombinations(lists,7));
    }
    @Test
    public void palandroneTester(){
        Palandrone palandrone=new Palandrone();
      // assertTrue(palandrone.checkPalandrome("a"));
        assertEquals("bb",palandrone.longestPalandrome("abb"));
    }
}


