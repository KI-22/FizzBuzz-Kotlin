import org.example.FizzBuzz
import kotlin.test.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test fun testAnswersForInput1() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1", fizzbuzz.checkFizzBuzz(1))

    }
    @Test fun testAnswersForInput2() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2", fizzbuzz.checkFizzBuzz(2))
    }
    @Test fun testAnswersForInput3() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz", fizzbuzz.checkFizzBuzz(3))
    }
    @Test fun testAnswersForInput4() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4", fizzbuzz.checkFizzBuzz(4))

    }
    @Test fun testAnswersForInput5() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz", fizzbuzz.checkFizzBuzz(5))
    }
    @Test fun testAnswersForInput6() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz", fizzbuzz.checkFizzBuzz(6))
    }
    @Test fun testAnswersForInput7() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7", fizzbuzz.checkFizzBuzz(7))
    }
    @Test fun testAnswersForInput8() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8", fizzbuzz.checkFizzBuzz(8))
    }
    @Test fun testAnswersForInput9() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz", fizzbuzz.checkFizzBuzz(9))
    }
    @Test fun testAnswersForInput10() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", fizzbuzz.checkFizzBuzz(10))
    }
    @Test fun testAnswersForInput11() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11", fizzbuzz.checkFizzBuzz(11))
    }
    @Test fun testAnswersForInput12() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz", fizzbuzz.checkFizzBuzz(12))
    }
    @Test fun testAnswersForInput13() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13", fizzbuzz.checkFizzBuzz(13))
    }
    @Test fun testAnswersForInput14() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14", fizzbuzz.checkFizzBuzz(14))
    }
    @Test fun testAnswersForInput15() {
        val fizzbuzz = FizzBuzz()
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", fizzbuzz.checkFizzBuzz(15))
    }

}