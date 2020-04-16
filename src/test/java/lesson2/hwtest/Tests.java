package lesson2.hwtest;

import lesson2.hw.ArrayDataException;
import lesson2.hw.ArraySizeException;
import lesson2.hw.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {

    public ArrayUtils utils;

    @Before
    public void init() {
        utils = new ArrayUtils();
    }

    @Test(expected = ArraySizeException.class)
    public void testSize() {
        Object [][] objects = new Object[3][50];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 50; j++) {
                objects[i][j] = 10;
            }
        }
        utils.arraySum(objects);
    }

    @Test(expected = ArrayDataException.class)
    public void testData() {
        Object [][] objects = new Object[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                objects[i][j] = 10;
            }
        }
        objects[3][3] = "String";
        objects[1][2] = new ArrayList<Integer>();
        utils.arraySum(objects);
    }

    @Test
    public void testSum() {
        Object [][] objects = new Object[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                objects[i][j] = 10;
            }
        }
        long result = utils.arraySum(objects);
        Assert.assertEquals(160, result);
    }

}
