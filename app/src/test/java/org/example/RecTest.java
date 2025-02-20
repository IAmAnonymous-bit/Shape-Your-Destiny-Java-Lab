package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class RecTest 
{
  Rectangle r1;
  Rectangle r2;
  Rectangle r3;

  @BeforeEach
  void setUpRectangles()
  {
    r1 = new Rectangle(3.0, 1.5);
    r2 = new Rectangle(100.5, 120.0);
    r3 = new Rectangle(120000.5, 325000.0);
  }

  @Test
  void checkSides()
  {
    assertEquals(r1.numberOfSides(), 4);
  }

  @Test
  void checkr1Area()
  {
    double testr1A = 3.0 * 1.5;
    assertEquals(r1.getArea(), testr1A);
  }

  @Test
  void checkr1Peri()
  {
    double testr1P = 2 * (3.0 + 1.5);
    assertEquals(r1.getPerimeter(), testr1P);
  }

  @Test
  void checkr2Area()
  {
    double testr2A = 100.5 * 120.0;
    assertEquals(r2.getArea(), testr2A);
  }

  @Test
  void checkr2Peri()
  {
    double testr2P = 2 * (100.5 + 120.0);
    assertEquals(r2.getPerimeter(), testr2P);
  }

  @Test
  void checkr3Area()
  {
    double testr3A = 120000.5 * 325000.0;
    assertEquals(r3.getArea(), testr3A);
  }

  @Test
  void checkr3Peri()
  {
    double testr3P = 2 * (120000.5 + 325000.0);
    assertEquals(r3.getPerimeter(), testr3P);
  }
  
}