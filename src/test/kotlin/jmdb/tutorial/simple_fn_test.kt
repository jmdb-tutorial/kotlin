package jmdb.tutorial

import kotlin.test.*
import org.junit.Test

class simple_fn_test {

   @Test fun simple_fn() {
       val result = addTwoIntegers(2, 2)
	   assertEquals(4, result)
   }


   @Test fun say_hello() {
               val result = sayHelloTo("bob")
               assertEquals(true, result.contains("bob"))
   }



}
