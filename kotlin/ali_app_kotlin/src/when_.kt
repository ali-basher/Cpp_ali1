fun main() {

    when(readLine()!!.toInt())
    {
        1-> {
            println("1")
        }
        2-> println("2")
        3,4-> println("3, 4")
        in 20..50-> println("20 to 50")
    }
}