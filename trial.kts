fun main(args: Array<String>) {
    var age = 18;
    if (age < 18){
        println("sorry,we can't allow you to the party")
    }else{
        println("you are an adult.Enjoy the party")
    }
    var marks = 90
    if (marks < 40){
        println("E")

    }else if (marks < 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if (marks < 70){
        println("B")
    }else if (marks < 80){
        println("A")

    }
    ATEMENTS //WHEN ST
    var bettingnumber = 0
    when(bettingnumber){
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
