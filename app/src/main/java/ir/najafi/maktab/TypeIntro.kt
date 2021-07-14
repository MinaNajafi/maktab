 package ir.najafi.maktab

const val MAX_EXPERIENCE: Int = 5000

fun main() {
    
}

fun printExperiencePoints() {

    var experiencePoints: Int = 5
    println(experiencePoints)

}

fun addToExperiencePoints() {

    var experiencePoints: Int = 5
    experiencePoints += 5
    println(experiencePoints)

}

fun setPlayerName() {

    val playerName: String = "Estragon"
    var experiencePoints: Int = 5
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)

}

fun changePlayerName() {

//    Trying to change playerName’s value to "Madrigal"
    val playerName: String = "Estragon"
    playerName = "Madrigal"
    var experiencePoints: Int = 5
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)

}

fun reassignPlayerName() {

//    val playerName: String = "Estragon"
    var playerName: String = "Estragon"
    playerName="Madgarial"
    var experiencePoints: Int = 5
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)

}