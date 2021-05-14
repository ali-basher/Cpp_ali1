fun main()
{
    print("Enter degree : ")
    var deg:Int = readLine()!!.toInt()

    if((deg == 45))
    {
        deg += 5
        println("degree after pulse is $deg")
    }

    if(deg >= 50)
    {
        println("Is successful")
    }

    if(deg < 45)
    {
        println("Is unsuccessful")
    }

}