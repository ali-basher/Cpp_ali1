fun main()
{
    print("Enter degree :")
    val deg:Int = readLine()!!.toInt()

    if(deg >= 90)
    {
        println("- A -")
    }
    else if((deg >= 80) && (deg < 90))
    {
        println("- B -")
    }
    else if((deg >= 70) && (deg < 80))
    {
        println("- C -")
    }
    else
    {
        println("Failure")
    }

}