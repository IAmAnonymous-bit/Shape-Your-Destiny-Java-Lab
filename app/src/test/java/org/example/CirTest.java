package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CirTest 
{
    Circle c1;
    Circle c2;
    Circle c3;

    @BeforeEach
    void setUpCircles()
    {
        c1 = new Circle(3.0);
        c2 = new Circle(100.5);
        c3 = new Circle(120000.5);

    }

    @Test
    void checkc1Area()
    {
        double testc1A = (3.0 * 3.0) * 3.14;
        assertEquals(c1.getArea(), testc1A);

    }

    @Test
    void checkc1Peri()
    {
        double testc1P = 2 * 3.14 * 3.0;
        assertEquals(c1.getPerimeter(), testc1P);

    }

    @Test
    void checkc2Area()
    {
        double testc2A = (100.5 * 100.5) * 3.14;
        assertEquals(c2.getArea(), testc2A);

    }

    @Test
    void checkc2Peri()
    {
        double testc2P = 2 * 3.14 * 100.5;
        assertEquals(c2.getPerimeter(), testc2P);
        
    }

    @Test
    void checkc3Area()
    {
        double testc3A = (120000.5 * 120000.5) * 3.14;
        assertEquals(c3.getArea(), testc3A);

    }

    @Test
    void checkc3Peri()
    {
        double testc3P = 2 * 3.14 * 120000.5;
        assertEquals(c3.getPerimeter(), testc3P);
        
    }
  
}