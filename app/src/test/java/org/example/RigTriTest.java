package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;

class RigTriTest 
{
  RightTriangle rt1;
  RightTriangle rt2;
  RightTriangle rt3;

  @BeforeEach
  void setUpRightTriangles()
  {
    rt1 = new RightTriangle(3.0, 1.5);
    rt2 = new RightTriangle(100.5, 120.0);
    rt3 = new RightTriangle(120000.5, 325000.0);
  }

  @Test
  void checkSides()
  {
    assertEquals(rt1.numberOfSides(), 3);
  }

  @Test
  void checkrt1Area()
  {
    double testrt1A = (3.0 * 1.5) / 2;
    assertEquals(rt1.getArea(), testrt1A);
  }

  @Test
  void checkrt1Peri()
  {
    double temp1 = (3.0 * 3.0) + (1.5 * 1.5);
    double testrt1P = 3.0 + 1.5 + Math.sqrt(temp1);
    assertEquals(rt1.getPerimeter(), testrt1P);
  }

  @Test
  void checkrt2Area()
  {
    double testrt2A = (100.5 * 120.0) / 2;
    assertEquals(rt2.getArea(), testrt2A);
  }

  @Test
  void checkrt2Peri()
  {
    double temp2 = (100.5 * 100.5) + (120.0 * 120.0);
    double testrt2P = 100.5 + 120.0 + Math.sqrt(temp2);
    assertEquals(rt2.getPerimeter(), testrt2P);
  }

  @Test
  void checkrt3Area()
  {
    double testrt3A = (120000.5 * 325000.0) / 2;
    assertEquals(rt3.getArea(), testrt3A);
  }

  @Test
  void checkrt3Peri()
  {
    double temp3 = (120000.5 * 120000.5) + (325000.0 * 325000.0);
    double testrt3P = 120000.5 + 325000.0 + Math.sqrt(temp3);
    assertEquals(rt3.getPerimeter(), testrt3P);
  }
  
}