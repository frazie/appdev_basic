fun main() {
    //IF THE EXPRESSION
    var age = 18
    var result = if (age < 18){
        "You are under age"
    }else{
        "you qualify"
    }
    println(result)


    //WHEN EXPRESSIONS
    var bettingnumber = 0
    var bettingresult
    1->{
        println("Ooops!!!You lost")
    }
    2->{
        println("Ooops!!!You lost")
    }
    3->{
        println("Congrats!!!You won!!!")
    }
    4->{
        println("Ooops!!!You lost")
    }
    else->{
        println("Please enter a number from 1 - 4 to win")
    }
}


}