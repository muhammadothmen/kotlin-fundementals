package com.example2.kotlinbasics

fun main (){
// todo: add function
    var m : String = "muhammad"
    var v : Char
    v = 'f'
    var k:Float = 13.4F
    var t =m[0]


    var n = "kk"
        println ("hello $t and len is ${m.length}")

     m = "othman"
    println ("hello " +v)
    println (m.length)
    var s =123_45545_785
    println (s)
/*val a=5.0
    val b = 2
    var r:Double = 8.2
    r= (a/b)
    println(r)
    println(r++)
    println(++r)*/

//create a variable for testing all condition
    var age =33
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 15

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    println("current age is $currentAge")

    val z =if (true){
        println("lk")
        12
    }else
        13

    println(z)

    when (age){
      !in  0..30 -> println("You may vvv now")
        16 -> println("You may drive now")
        21, 18 ->  println("You are ff")
        in 0..15  ->  println("You are too young")
        else -> println("You are gg")
    }
    var o : Any ='j'

    when (o){
        is Int -> println("int")
        is Double -> println("do")
        //else -> println("none")
    }

    val x : Any = 13.37
//assign when to a variable
    val result =  when(x) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    print("$x $result")
    var f=20
    while (f<30)
    {
        println(5)
        if (f==22)
            println(6)
        f++

    }
    for (mun in 1..10 step 2)
        println(mun)
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    for (i in 1..10000)
        if (i==9001)
            println("IT'S OVER 9000!!!")

   var humdity="humid"
    var humlevel=80

    while (humdity=="humid")
    {
        humlevel-=5
        println( "humidity decreased")
        if (humlevel<60){
            println( "it's comfy now")
        humdity="comfy"}
    }

var r=ave (5 , 6)
    println(r)

    var name : String? = "Denes"
   name= null
    name?.let { println("h") }
   // println(name?.toLowerCase())
    val ds = name ?:"jskdf"
    println(ds)
 //println(name!!.toLowerCase())
    while (humdity=="humid")
    {
        humlevel-=5
        println( "humidity decreased")
        if (humlevel<60){
            println( "it's comfy now")
            humdity="comfy"}
    }



}
fun ave (a: Int ,b: Int) :Float {

    return (a+b).toFloat()/2

}