import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

/**
 * @author aha-oretama
 */
object CalculatorSpec: Spek({
    given("a calculator") {
        on("addition") {
            val sum = 2 + 4
            it("should return the result of adding the first number to the second number") {
                println(sum)
                assertEquals(6, sum)
            }
        }
    }
})