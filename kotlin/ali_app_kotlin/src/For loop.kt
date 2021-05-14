fun main()
{
   for(i in 1..9)
    {
        if((i >= 1) && (i < 5))
        {
            for(k in 1..7)
            {
                print("  ")
            }
            for(j in 1..i)
            {
                print("* ")
            }

            print("\n")
        }

        else if(i == 5)
        {
            for(k in 1..12)
            {
                print("* ")
            }

            print("\n")
        }

        else
        {
            for(k in 1..7)
            {
                print("  ")
            }
            var j1 = 9
            while (j1 >= i)
            {
                print("* ")
                j1--
            }

            print("\n")
        }
    }

}