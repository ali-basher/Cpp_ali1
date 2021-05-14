fun main() {

    print("Enter degree : ")
    var deg:Int = readLine()!!.toInt()

    if(deg >= 50)
    {
        println("Successful")
        println("degree is : $deg")
    }else{
        if(deg >= 45){
            deg += 5

            println("degree after curve is : $deg")
        }else{
            println("failure")
        }


    }




}