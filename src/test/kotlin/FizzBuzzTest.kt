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
//    @Test fun testAnswersForInput3() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz")
//    }
//    @Test fun testAnswersForInput4() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4")
//    }
//    @Test fun testAnswersForInput5() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz")
//    }
//    @Test fun testAnswersForInput6() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz")
//    }
//    @Test fun testAnswersForInput7() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7")
//    }
//    @Test fun testAnswersForInput8() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8")
//    }
//    @Test fun testAnswersForInput9() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz")
//    }
//    @Test fun testAnswersForInput10() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz")
//    }
//    @Test fun testAnswersForInput11() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11")
//    }
//    @Test fun testAnswersForInput12() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz")
//    }
//    @Test fun testAnswersForInput13() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13")
//    }
//    @Test fun testAnswersForInput14() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14")
//    }
//    @Test fun testAnswersForInput15() {
//        val fizzbuzz = FizzBuzz()
//        assert(fizzbuzz.checkFizzBuzz(15) == "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz")
//    }

}