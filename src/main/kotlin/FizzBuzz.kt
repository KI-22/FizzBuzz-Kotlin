package org.example

class FizzBuzz {
    fun checkFizzBuzz(toCheck: Int): String {
        val fbArray: MutableList<String> = ArrayList()

        for (num in 1..toCheck) {
            when {
                (num % 3 == 0 && num % 5 == 0) -> fbArray.add("FizzBuzz")
                num % 3 == 0 -> fbArray.add("Fizz")
                num % 5 == 0 -> fbArray.add("Buzz")
                else -> fbArray.add(num.toString())
            }
        }
        val fbString: String = fbArray.joinToString()
        return fbString
    }

}
