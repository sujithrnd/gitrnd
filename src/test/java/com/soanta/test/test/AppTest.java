package com.soanta.test.test;

import org.testng.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
    
    @org.testng.annotations.Test
    public void testSample(){
    	Assert.assertEquals(true,true,"");
    }
    @org.testng.annotations.Test
    public void testSample2(){
    	Assert.assertEquals(true,true,"Failed ");
    }
}
