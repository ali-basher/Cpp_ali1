import kotlin.text.toInt as toInt1

fun main()
{
    print("Enter any : ")
    val num:Int = readLine()!!.toInt()

    when(num){
        1-> println("the number is 1")

        2-> println("the number is 2")

        3,4-> println("the number is 3,4")

        in 20..50-> println("the number is between 20 t0 50")
    }
}