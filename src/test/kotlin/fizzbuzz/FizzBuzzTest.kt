package fizzbuzz

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest : FunSpec({
    test("si on passe 6, on retourne fizz") {
        //arrange
        var resultat = FizzBuzz.eval(6)

        //assert
        resultat shouldBe "Fizz"
    }

    test("si on passe 4, on retourne 4") {
        //arrange
        var resultat = FizzBuzz.eval(4)

        //assert
        resultat shouldBe "4"
    }

    test("si on passe 3, on retourne fizz") {
        //arrange
        var resultat = FizzBuzz.eval(3)

        //assert
        resultat shouldBe "Fizz"
    }

    test("si on passe 5, on retourne buzz") {
        //arrange
        var resultat = FizzBuzz.eval(5)

        //assert
        resultat shouldBe "Buzz"
    }

    test("si on passe 15, on retourne fizzbuzz") {
        //arrange
        var resultat = FizzBuzz.eval(15)

        //assert
        resultat shouldBe "FizzBuzz"
    }

    test("si on passe 105, on retourne fizzbuzzquiz") {
        //arrange
        var resultat = FizzBuzz.eval(105)

        //assert
        resultat shouldBe "FizzBuzzQuiz"
    }


})