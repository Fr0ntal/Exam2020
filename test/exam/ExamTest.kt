package exam

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExamTest {

    @Test
    fun testExample() {
        assertEquals(42, example("input/example.txt"))
    }

    @Test
    fun testMyExamTask() {
        assertEquals(listOf("Вымыть пол", "Приготовить еду"), foo("test.txt", limit = 90))
        assertEquals(listOf("a","b"), foo("text2.txt", limit = 5))
        assertEquals(listOf("a","b"), foo("text2.txt", limit = 90))
    }
}
@Test
fun foo(){
    assertEquals(listOf("Вымыть пол", "Приготовить еду"), foo("example.txt", limit = 90))
}