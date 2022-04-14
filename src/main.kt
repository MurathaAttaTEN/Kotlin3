fun main(){
    deposit()
    withdraw()
    item()







}
 open class CurrentAccount(var accountnumber: String, var accountname:String,var balance:String){
    fun deposit(amount:Double){
        var x=balance+amount
        println(x)
    }
    fun withdraw(amount: Double){
        amount-=balance


    }
    fun details(accountnumber: String,balance:String,accountname: String){
        println("Account number $x with balance $y is operated by $z")

    }
}
class SavingsAccount(var withdrawals:Int){
    var z = 1*12
}
data class Soap(var name:String,var weight:Int,var price:Int,var category:String){
    fun item(product:Array<String>){
        var b= product
        when(category in b is $y){
            println("b")
        }

    }
    fun evenIndices (num:String):String{
        var l= "banana"
        var n=l.toString()+l[2]+l[4]
        return  l
    }










