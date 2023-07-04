package fizzbuzz

class buzz {
    companion object {

        val rules = mapOf(
            { x: Int -> (x % 3 == 0) } to "Fizz",
            { x: Int -> (x % 5 == 0) } to "Buzz",
            { x: Int -> (x % 7 == 0) } to "Quiz")

        fun eval(nombre: Int): String {

            var res = rules.entries.fold("") { acc, rule ->
                if (rule.key(nombre)) (acc + rule.value) else acc
            }
            when {
                res.isEmpty() -> return nombre.toString()
                else -> return res
            }
        }
    }
}
