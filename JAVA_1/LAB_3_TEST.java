/***** DO NOT ATTEMPT To CHANGE ANY CODE LINES ****/
package edu.uqu.cs;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

/**
 * Unit test for our Lab 1.
 */
public class AppTest {

    @Test
    public void testPart1_1() {

        String input = "7.6";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part1();

        String actual = baos.toString();
        String expected = "1.90\n";
        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);
        try {
            assertEquals("Should match "+expected, escan.nextDouble(), ascan.nextDouble(), 0.01);
        }
        finally {
            ascan.close();
            escan.close();
        }
    }

    @Test
    public void testPart1_2() {

        String input = "2.2";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part1();

        String actual = baos.toString();
        String expected = "0.55\n";
        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);
        try {
            assertEquals("Should match "+expected, escan.nextDouble(), ascan.nextDouble(), 0.01);
        }
        finally {
            ascan.close();
            escan.close();
        }
    }

    @Test
    public void testPart1_3() {

        String input = "104";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part1();

        String actual = baos.toString();
        String expected = "26.0\n";
        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);
        try {
            assertEquals("Should match "+expected, escan.nextDouble(), ascan.nextDouble(), 0.01);
        }
        finally {
            ascan.close();
            escan.close();
        }
    }

    @Test
    public void testPart2_1() {
        String input = "20.0 3.1599";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part2();

        String actual = baos.toString();
        String expected = "1.58 7.90 63.20\n";
        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);
        try {
            assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
            assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
            assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        }
        finally {
            ascan.close();
            escan.close();
        }
    }

    @Test
    public void testPart2_2() {
        String input = "30.0 3.8999";
        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part2();

        String actual = baos.toString();
        String expected = "1.30 6.50 52.00\n";
        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);
        try {
            assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
            assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
            assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        }
        finally {
            ascan.close();
            escan.close();
        }
    }

    @Test
    public void testPart3_1() {
        String input = "3.6 4.5 2.0";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part3();

        String actual = baos.toString();
        String expected = "12.96 1.841304610218211E11 4.5 16.2\n";

        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);

        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);

        ascan.close();
        escan.close();
    }

    @Test
    public void testPart3_2() {
        String input = "-3.7 -3 5";

        ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.part3();

        String actual = baos.toString();
        String expected = "-693.4395700000001 -8.452419664263233E-139 3.0 410.49459863681534";

        InputStream ais = new ByteArrayInputStream(actual.getBytes());
        InputStream eis = new ByteArrayInputStream(expected.getBytes());

        Scanner ascan = new Scanner(ais);
        Scanner escan = new Scanner(eis);

        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);
        assertEquals(escan.nextDouble(), ascan.nextDouble(), 0.01);

        ascan.close();
        escan.close();
    }

}