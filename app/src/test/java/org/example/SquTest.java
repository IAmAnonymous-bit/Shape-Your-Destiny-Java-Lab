package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class SquTest 
{
  Square s1;
  Square s2;
  Square s3;

  @BeforeEach
  void setUpSquares()
  {
    s1 = new Square(3.0);
    s2 = new Square(100.5);
    s3 = new Square(120000.5);

  }

  @Test
  void checkSides()
  {
    assertEquals(s1.numberOfSides(), 4);

  }

  @Test
  void checks1Area()
  {
    double tests1A = 3.0 * 3.0;
    assertEquals(s1.getArea(), tests1A);

  }

  @Test
  void checks1Peri()
  {
    double tests1P = 4 * 3.0;
    assertEquals(s1.getPerimeter(), tests1P);

  }

  @Test
  void checks2Area()
  {
    double tests2A = 100.5 * 100.5;
    assertEquals(s2.getArea(), tests2A);

  }

  @Test
  void checks2Peri()
  {
    double tests2P = 4 * 100.5;
    assertEquals(s2.getPerimeter(), tests2P);

  }

  @Test
  void checks3Area()
  {
    double tests3A = 120000.5 * 120000.5;
    assertEquals(s3.getArea(), tests3A);

  }

  @Test
  void checks3Peri()
  {
    double tests3P = 4 * 120000.5;
    assertEquals(s3.getPerimeter(), tests3P);

  }
  
}