fun main()
{
    print("Enter number1 : ")
    val n1 = readLine()!!.toInt()

    print("Enter number2 : ")
    val n2 = readLine()!!.toInt()

    val sum = n1 + n2
    val sub = n1 - n2
    val mul = n1 * n2
    val div = (n1 / n2).toDouble()
    val mood = n1 % n2

    println("$n1 + $n2 = $sum")

    println("Sum = $sum")
    println("Sub = $sub")
    println("Mul = $mul")
    println("Div = $div")
    println("Mood = $mood")

}