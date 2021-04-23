fun main() {
    isEven(42)
    var sanitizer = Product("Sanitizer",150.00,250,"hygiene")
    sanitizer.product("Dettle")
    evenaracter()

}
fun isEven(number:Int):Boolean{
    if (number%2==0){
        return true
    }
    else{
        return false
    }
}
data class Product(var name:String,var weight:Double,var price:Int,var category:String){
    fun product(name:String){
        var groceryList = mutableListOf<String>()
        var hygieneList = mutableListOf<String>()
        var other = mutableListOf<String>()
        when(category){
            "grocery" -> groceryList.add(name)
            "hygiene" -> hygieneList.add(name)
            else  -> other.add(name)
        }
        println("${name}:${category}")
    }
}
fun evenaracter(word:String):String{
    var newWord = ""
    for(cha in word){
        if (word.indexOf(cha)%2==0){
            newWord+=cha
        }
    }
    return newWord
}