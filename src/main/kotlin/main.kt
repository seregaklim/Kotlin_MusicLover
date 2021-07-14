
fun main () {
    val product = 1500
    val quantity = 10
    val meloman = 0.01
    val isRegularCustomer = true
    val purchasePrice = product * quantity
    val discountSilver = product * quantity - 100
    val discountGold = purchasePrice - (product * quantity * 0.05).toInt()
    val discont  = if (purchasePrice >= 1000) purchasePrice else if (purchasePrice >= 1001 && purchasePrice >= 10000)
        discountSilver else if (purchasePrice <= 10001) discountGold else 0
    val regularCustomer = purchasePrice - discont * meloman
    val result = if (isRegularCustomer) regularCustomer else discont
    println("$result рублей")
}











