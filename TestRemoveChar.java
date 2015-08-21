package jUnitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRemoveChar {
   String expectedString = "Mdhvi Krn";
   String originalString = "Madhavi Karna";
   String c = "a";
   char ch = 'a';
   
   RemoveChar rc = new RemoveChar();
   
   @Test
   public void removeOneCharViaLooping() {
	  String str = rc.removeOneCharViaLooping(originalString, ch);
      assertEquals(expectedString,str);
   }
   
   
   @Test
   public void removeUsingStringMethods() {
	  String str = rc.removeUsingStringMethods(originalString, c);
      assertEquals(expectedString, str);
   }
   
   
   // Testing with invalid string
   @Test
   public void testRemoveWrongOriginalString() {
	  String str = rc.removeUsingStringMethods("ABCD", c);
      assertEquals(expectedString, str);
   }
   
   // Testing String Case sensitivity
   @Test
   public void testRemoveWrongCaseString() {
	  String str = rc.removeUsingStringMethods("MADHAVI KARNA", c);
      assertEquals(expectedString, str);
   }
}