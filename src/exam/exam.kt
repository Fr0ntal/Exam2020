package exam

import java.io.File

fun example(inputName: String): Int {
    if ("ultimate question" in File(inputName).readText().toLowerCase()) {
        return 42
    }
    throw IllegalStateException()
}

// Пожалуйста добавьте необходимые параметры,
// тип результата, и измените имя функции (Shift+F6)

fun foo(inputName: String, limit: Int): List<String> {
        var a = mutableMapOf<String, Pair<Int, Int>>()
        File(inputName).readLines().forEach {
            val split = it.split(" -- ")
            val name = split[0]
            val split2 = split[1].split(", ")
            val importancy = split2[0].split(" ")[1].toInt()
            val time = split2[1].split(" ")[0].toInt()
            a[name] = Pair(importancy, time)
        }
        val sorted = a.toList()
            .sortedWith(compareBy<Pair<String, Pair<Int, Int>>> { -it.second.first }.thenBy { it.second.second })
            .toMutableList()
        val list = a.toList()
        var max = 0
        var ans = listOf("")
            for (i in (0 until list.size)) {
                for(j in (1 until list.size))
                if (i != j && list[i].second.second + list[j].second.second <= limit){
                    if(list[i].second.first + list[j].second.first > max){
                        max = list[i].second.first + list[j].second.first
                        ans = listOf(list[i].first, list[j].first)

                    }
                }
            }
    if (ans != listOf("")){
        return ans.sortedBy { value -> value }
    } else {
        throw IllegalArgumentException()
       }
}






/*
* В файле с именем inputName содержится список дел, например:
*
* Вымыть пол -- важность 2, 45 мин
* Сходить в магазин -- важность 2, 75 мин
* Приготовить еду -- важность 3, 30 мин
* Написать программу -- важность 1, 45 мин
*
* Для каждого дела через чёрточки указана его важность (целое число)
* и занимаемое время.
* Отдельным параметром limit задан лимит времени в минутах, например 90 мин
*
* “Удовлетворительно” -- найти два дела, суммарное время выполнения которых
* умещается в заданный лимит, и которые при этом имеют максимально
* возможную суммарную важность. Для примера это
* Вымыть пол и Приготовить еду, сумма важности 5, сумма времени 75 мин.
* Бросить IllegalArgumentException, если двух таких дел нет.
*
*
* Тип результата функции предложить самостоятельно.
*/


