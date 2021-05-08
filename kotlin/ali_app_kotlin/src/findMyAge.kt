import java.util.*

fun main()
{
    //input

    print("Enter your year of birth : ")
    val yearOfBirth:Int = readLine()!!.toInt()

    //process

    val year:Int = Calendar.getInstance().get(Calendar.YEAR)
    val age:Int = year - yearOfBirth

    //output

    println("Your age is $age years")

}