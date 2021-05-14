fun main()
{
    for(n1 in 1..10)
    {
        println("n1 : $n1")
        if(n1 == 8)
        {
            break
        }
    }

    for(n2 in 1..10)
    {
        if(n2 == 5)
        {
            continue
        }
        println("n2 : $n2")
    }

    //labels

    loop@ for(n3 in 1..10)
    {
        for(n4 in 1..3)
        {
            println("n4 : $n4")
            if(n3 == 6)
                break@loop
        }
        println("n3 : $n3")
    }


    loop@ for(x in 1..6)
    {
        for(y in 1..4)
        {
            if(x == 5)
                continue@loop
            println("x = $x , y = $y")
        }
    }


    println("End App")
}