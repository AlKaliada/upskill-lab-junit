package com.epam.kaliada;

import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest 
{

    @Test(expected = IllegalArgumentException.class)
    public void quadraticEquation_throw_exception_with_a_0(){
        App.quadraticEquation(0, 1,2);
    }

    @Test
    public void quadraticEquation_two_roots(){
        double[] result = App.quadraticEquation(3, -14, -5);
        double[] expected = {5, -0.33333};
        assertArrayEquals(expected, result, 1e-5);
    }

    @Test
    public void quadraticEquation_one_roots(){
        double[] result = App.quadraticEquation(1, 2, 1);
        double[] expected = {-1};
        assertArrayEquals(expected, result, 1e-5);
    }

    @Test
    public void quadraticEquation_no_roots(){
        double[] result = App.quadraticEquation(2, 2, 4);
        double[] expected = {};
        assertArrayEquals(expected, result, 1e-5);
    }

    @Test
    public void quadraticEquation_with_b_and_c_0(){
        double[] result = App.quadraticEquation(5, 0, 0);
        double[] expected = {0};
        assertArrayEquals(expected, result, 1e-5);
    }

    @Test
    public void quadraticEquation_with_b_0(){
        double[] result = App.quadraticEquation(4, 0, 3);
        double[] expected = {};
        assertArrayEquals(expected, result, 1e-5);
    }
}
