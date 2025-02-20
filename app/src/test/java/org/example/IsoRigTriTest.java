package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;

class IsoRigTriTest 
{
    IsoRightTriangle irt1;
    IsoRightTriangle irt2;
    IsoRightTriangle irt3;

  @BeforeEach
  void setUpRightTriangles()
  {
    irt1 = new IsoRightTriangle(3.0);
    irt2 = new IsoRightTriangle(100.5);
    irt3 = new IsoRightTriangle(120000.5);
  }

  @Test
  void checkSides()
  {
    assertEquals(irt1.numberOfSides(), 3);
  }

  @Test
  void checkirt1Area()
  {
    double testirt1A = (3.0 * 3.0) / 2;
    assertEquals(irt1.getArea(), testirt1A);
  }

  @Test
  void checkirt1Peri()
  {
    double temp1 = (3.0 * 3.0) * 2;
    double testirt1P = (3.0 * 2) + Math.sqrt(temp1);
    assertEquals(irt1.getPerimeter(), testirt1P);
  }

  @Test
  void checkirt2Area()
  {
    double testirt2A = (100.5 * 100.5) / 2;
    assertEquals(irt2.getArea(), testirt2A);
  }

  @Test
  void checkirt2Peri()
  {
    double temp2 = (100.5 * 100.5) * 2;
    double testirt2P = (100.5 * 2) + Math.sqrt(temp2);
    assertEquals(irt2.getPerimeter(), testirt2P);
  }

  @Test
  void checkirt3Area()
  {
    double testirt3A = (120000.5 * 120000.5) / 2;
    assertEquals(irt3.getArea(), testirt3A);
  }

  @Test
  void checkirt3Peri()
  {
    double temp3 = (120000.5 * 120000.5) * 2;
    double testirt3P = (120000.5 * 2) + Math.sqrt(temp3);
    assertEquals(irt3.getPerimeter(), testirt3P);
  }
  
}