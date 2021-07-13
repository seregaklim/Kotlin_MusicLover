fun main () {

    val product = 1500
    val quantity = 10
    val meloman = 0.01

    var purchasePrice = product * quantity
    val discountSilver = product * quantity - 100
    val discountGold = product * quantity * 0.05

    var melomanPurchase = purchasePrice - (purchasePrice * meloman)
    var melomanSilver = discountSilver- (discountSilver * meloman)
    var milomanGold = discountGold - (discountGold * meloman)

    if (purchasePrice >= 1000) {} else println("Без скидок $purchasePrice рублей")
    if (purchasePrice >= 1001 && purchasePrice >= 10000) {}
    else println("Со скидкой 100р, цена составляет $discountSilver рублей")
    if (purchasePrice <= 10001) {} else println("Со скидкой 5 процентов, цена составляет $discountGold рублей")

    if (purchasePrice >= 1000) {} else println("C дополнительной скидкой постоянного клиента $melomanPurchase рублей")
    if (purchasePrice >= 1001 && purchasePrice >= 10000) {}
    else println("C дополнительной скидкой постоянного клиента $melomanSilver рублей")
    if (purchasePrice <= 10001) {} else println("C дополнительной скидкой постоянного клиента $milomanGold рублей")
}
