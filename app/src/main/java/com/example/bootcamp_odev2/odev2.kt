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
    fun IcAcılar(kenarSayisi : Int): Int{
        return (kenarSayisi - 2)*180

    }
    fun GunSayisiBul(gunSayisi : Int){
        val calismaUcreti= 10*gunSayisi
        val mesai = (gunSayisi-160)*20
        val maas = calismaUcreti + mesai
        return println("maas : ${maas} ")

    }
    fun KotaUcreti(kotaMiktari : Int){
        var ucret = 0
        if (kotaMiktari <= 50){
            ucret += 100
        }else{
            ucret = 100 + (kotaMiktari-50)*4

        }
        return println("Ücret : ${ucret}")

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

    val icAcı = o.IcAcılar(4)
    println("sonuç : ${icAcı}")

    o.GunSayisiBul(200)
    o.KotaUcreti(55)

}