fun main() {

    var isRegular: Boolean = true
    var fee: Int = 0

    var lastSum: Int = 15_000

    var saleNow: Int = 2_000

    if (lastSum <= 1_000) { saleNow
    }  else if (lastSum in 1001..10_000) {
        saleNow -= 100
    }  else if (lastSum > 10_000) {
        saleNow -= saleNow * 5 / 100
    } else {
        println("введите корректное число")}

   var result = if (!isRegular) saleNow else saleNow / 100 * 99
    println("Сумма с учётом скидки: $result")

}