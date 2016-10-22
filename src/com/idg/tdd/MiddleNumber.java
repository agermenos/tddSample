package com.idg.tdd;

import org.junit.Test;

/**
 *
 Created by agermenos on 9/29/2016.

 Given two numbers n and m, find their digital average.

 The digital average can be calculated only if all digits in their sum are even. To obtain the digital average, each digit of this sum should be divided by 2.

 If the digital average cannot be calculated, return -1 instead.

 Example

 For n = 273 and m = 415, the output should be
 middleNumber(n, m) = 344.

 n + m = 688. 6 / 2 = 3, and 8 / 2 = 4. Thus, the answer is 344.

 Please have fun!

 [time limit] 3000ms (java)
 [input] integer n

 Constraints:
 1 ≤ n ≤ 500.

 [input] integer m

 Constraints:
 1 ≤ m ≤ 500.

 [output] integer

 An integer value which is a middle number of the two given integer else -1 is returned.
 */
public class MiddleNumber {

    int middleNumber(int n, int m) {
        return -1;
    }

    public void prepare (int n, int m, int expected){
        System.out.println("\n======================\nInput: \t\tn: " + n + "\n\t\t\tm: " + m +
                "\nOutput: \t\t\t" + middleNumber(n,m) +
                "\nExpected Output: \t"+expected);
        assert (middleNumber(n,m)==expected);
    }

    @Test
    public void test1(){
        prepare(273, 415, 344);
    }
    @Test
    public void test2(){
        prepare (43, 25, 34);
    }
    @Test
    public void test3(){
        prepare(57, 44, -1);
    }
    @Test
    public void test4(){
        prepare(109, 101, -1);
    }
    @Test
    public void test5(){
        prepare(66, 22, 44);
    }
    @Test
    public void test6(){
        prepare(23, 77, -1);
    }
    @Test
    public void test7(){
        prepare(33, 47, 40);
    }
    @Test
    public void test8(){
        prepare(23, 44, -1);
    }
}
