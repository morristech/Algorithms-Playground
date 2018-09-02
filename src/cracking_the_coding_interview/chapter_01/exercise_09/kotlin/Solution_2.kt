package cracking_the_coding_interview.chapter_01.exercise_09.kotlin


fun main(args: Array<String>) {
    println(isRotation("waterbottle", "erbottlewat"))
}

private fun isRotation(first: String, second: String): Boolean {
    if (first.length != second.length)
        return false

    val temp = first + first
    return second.isSubstring(temp)
}

private fun String.isSubstring(text: String): Boolean {
    return text.contains(this)
}