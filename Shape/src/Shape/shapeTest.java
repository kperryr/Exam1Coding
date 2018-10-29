package Shape;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class shapeTest {
	
	// Tests for Rectangle Class

	@Test
	public void RecConstructor_test1() {
		Rectangle rec = new Rectangle(5,5);
		int length =5;
		int width =5;
	    assertEquals(rec.getiWidth(), width);
	    assertEquals(rec.getiLength(), length);
		
	}

	@Test
	public void RecConstructor_test2() {
		Rectangle rec = new Rectangle(7,9);
		int length =9;
		int width =7;
	    assertEquals(rec.getiWidth(), width);
	    assertEquals(rec.getiLength(), length);
	}
	
	@Test
	public void RecGetterWidth_test1() {
	    Rectangle rec = new Rectangle(5,5);
	    int width = 5;
	    int expectedWidth = rec.getiWidth();
	    assertEquals(expectedWidth, width);
	}
	
	@Test
	public void RecGetterLength_test2() {
		 Rectangle rec = new Rectangle(5,7);
		    int length = 7;
		    int expectedLength = rec.getiLength();
		    assertEquals(expectedLength, length);
	}
	
	@Test
	public void RecSetterWidth_test1() {
		int width = 8;
	    Rectangle rec = new Rectangle(5,7);
	    rec.setiWidth(width);
	    assertEquals(rec.getiWidth(), width);
	}
	
	@Test
	public void RecSetterLength_test2() {
	    int length = 8;
	    Rectangle rec = new Rectangle(5,7);
	    rec.setiLength(length);
	    assertEquals(rec.getiLength(), length);
	}
	
	@Test
	public void RecArea_test1() {
		int expectedArea= 35;
		Rectangle rec = new Rectangle(5,7);
		assertEquals(expectedArea, rec.area());
	}
	
	@Test
	public void RecArea_test2() {
		int expectedArea= 28;
		Rectangle rec = new Rectangle(4,7);
		assertEquals(expectedArea, rec.area());
	}
	
	@Test
	public void RecPerimeter_test1() {
		int expectedPerimeter= 24;
		Rectangle rec = new Rectangle(5,7);
		assertEquals(expectedPerimeter, rec.perimeter());
	}
	
	@Test
	public void RecPerimeter_test2() {
		int expectedPerimeter= 30;
		Rectangle rec = new Rectangle(5,10);
		assertEquals(expectedPerimeter, rec.perimeter());
	}
	
	@Test 
	public void RecCompareTo_test1() {
		Rectangle rec = new Rectangle(4,5);
		Rectangle rec1= new Rectangle(5,5);
		
		int expectedVal = rec.compareTo(rec1);
		assertEquals(expectedVal, -5);
	}
	
	@Test 
	public void RecCompareTo_test2() {
		Rectangle rec = new Rectangle(5,5);
		Rectangle rec1= new Rectangle(4,5);
		
		int expectedVal = rec.compareTo(rec1);
		assertEquals(expectedVal, 5);
	}
	@Test 
	public void RecCompareTo_test3() {
		Rectangle rec = new Rectangle(5,5);
		Rectangle rec1= new Rectangle(5,5);
		
		int expectedVal = rec.compareTo(rec1);
		assertEquals(expectedVal, 0);
	}
	
	
	//Tests for Cuboid Class
	
	@Test
	public void CubConstructor_test1() {
		Cuboid cub = new Cuboid(5,5,5);
		int length =5;
		int width =5;
		int depth=5;
	    assertEquals(cub.getiWidth(), width);
	    assertEquals(cub.getiLength(), length);
	    assertEquals(cub.getiDepth(), depth);
		
	}

	@Test
	public void CubConstructor_test2() {
		Cuboid cub = new Cuboid(4,5,6);
		int length =5;
		int width =4;
		int depth=6;
	    assertEquals(cub.getiWidth(), width);
	    assertEquals(cub.getiLength(), length);
	    assertEquals(cub.getiDepth(), depth);
	}
	
	@Test
	public void CubGetterWidth_test1() {
		Cuboid cub = new Cuboid(4,5,6);
	    int width = 4;
	    int expectedWidth = cub.getiWidth();
	    assertEquals(expectedWidth, width);
	}
	
	@Test
	public void CubGetterLength_test2() {
		Cuboid cub = new Cuboid(4,5,6);
		    int length = 5;
		    int expectedLength = cub.getiLength();
		    assertEquals(expectedLength, length);
	}
	
	@Test
	public void CubGetterDepth_test3() {
		Cuboid cub = new Cuboid(4,5,6);
		    int depth = 6;
		    int expectedDepth = cub.getiDepth();
		    assertEquals(expectedDepth, depth);
	}
	
	@Test
	public void CubSetterWidth_test1() {
		int width = 8;
		Cuboid cub = new Cuboid(4,5,6);
	    cub.setiWidth(width);
	    assertEquals(cub.getiWidth(), width);
	}
	
	@Test
	public void CubSetterLength_test2() {
	    int length = 8;
	    Cuboid cub = new Cuboid(4,5,6);
	    cub.setiLength(length);
	    assertEquals(cub.getiLength(), length);
	}
	
	@Test
	public void CubSetterDepth_test3() {
	    int depth = 8;
	    Cuboid cub = new Cuboid(4,5,6);
	    cub.setiDepth(depth);
	    assertEquals(cub.getiDepth(), depth);
	}
	
	@Test
	public void CubArea_test1() {
		int expectedArea= 148;
		Cuboid cub = new Cuboid(4,5,6);
		assertEquals(expectedArea, cub.area());
	}
	
	@Test
	public void CubArea_test2() {
		int expectedArea= 158;
		Cuboid cub = new Cuboid(3,5,8);
		assertEquals(expectedArea, cub.area());
	}
	
	@Test
	public void CubPerimeter_test1() {
		boolean thrown= false;
		Cuboid cub = new Cuboid(3,5,8);
		 try {
			    cub.perimeter();
			  } catch (UnsupportedOperationException  e) {
			    thrown = true;
			  }

		assertTrue(thrown);
	}
	
	@Test
	public void CubVolume_test1() {
		int expectedVol= 120;
		Cuboid cub = new Cuboid(4,5,6);
		assertEquals(expectedVol, cub.volume());
	}
	
	@Test
	public void CubVolume_test2() {
		int expectedVol= 120;
		Cuboid cub = new Cuboid(3,5,8);
		assertEquals(expectedVol, cub.volume());
	}
	
	@Test
	void CubSortByArea_test_1() {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		Cuboid cub1 = new Cuboid(1,2,3); 
		Cuboid cub2= new Cuboid(4,5,6);
		Cuboid cub3 = new Cuboid(10,11,1);
		cub.add(cub3);
		cub.add(cub1);
		cub.add(cub2);
		
        Collections.sort(cub, new SortByArea());
        
        assertTrue(cub.get(0)==cub1);
        assertTrue(cub.get(1)==cub2);
        assertTrue(cub.get(2)==cub3);
        }
	
	@Test
	void CubSortByVol_test_2() {
		ArrayList<Cuboid> cub = new ArrayList<Cuboid>();
		Cuboid cub1 = new Cuboid(1,2,3); 
		Cuboid cub2= new Cuboid(4,5,6);
		Cuboid cub3 = new Cuboid(10,11,1);
		cub.add(cub3);
		cub.add(cub1);
		cub.add(cub2);
        
        Collections.sort(cub, new SortByVolume());
        
        assertTrue(cub.get(0)==cub1);
        assertTrue(cub.get(1)==cub3);
        assertTrue(cub.get(2)==cub2);
	}
	
}
