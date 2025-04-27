package com.example.bootcamp_odev2

class Odev2{
    // parametre olarak girilen dereceyi fahrenhiet a döndüren metod
     fun Fahrenhiet(derece: Int): Int {
         return (derece * 9 / 5) + 32
        }

     fun Cevre(kenar1 : Int,kenar2 :Int):Int{
         return (kenar2+kenar1)*2
     }
    fun Faktoriyel(sayi : Int):Int{
        var result = 1
        for (i in sayi downTo 1){
            result *= i

        }
        return result

    }
    fun KacHarf(yazi : String) : Int {
        var aharfi  = 0
        for (c in yazi){
            if(c== 'a' || c=='A'){
                aharfi++
            }

        }
        return aharfi

    }





}
fun main() {
    val o =Odev2()

    val cevap =o.Fahrenhiet(60)
    println("sonuç: ${cevap}")

    val cevre = o.Cevre(20,25)
    println("sonuç: ${cevre}")

    val faktoriyel = o.Faktoriyel(6)
    println("sonuç: ${faktoriyel}")

    val aharfisayisi= o.KacHarf("Darende")
    println("sonuç: ${aharfisayisi}")

}