fun main() {
    println(isEven(41))
    var sanitizer = Product("Sanitizer",150.00,250,"hygiene")
    sanitizer.product("Drips")
    var veges = Product("Vegetables",150.00,250,"groceries")
    veges.product("Osuga")
    println(evenCharacter("favoured"))
    println(evenLength(arrayOf("Juliet","Diana","Shady","Nash","Whitney","Faith")))

}
fun isEven(number:Int):Boolean{
    return number%2==0
}
data class Product(var name:String,var weight:Double,var price:Int,var category:String){
    fun product(name:String){
        val groceryList = mutableListOf<String>()
        val hygieneList = mutableListOf<String>()
        val other = mutableListOf<String>()
        when(category){
            "groceries" -> groceryList.add(name)
            "hygiene" -> hygieneList.add(name)
            else  -> other.add(name)
        }
        println("${name}:${category}")
    }
}
fun evenCharacter(word:String):String{
    var newWord = ""
    for(cha in word){
        if (word.indexOf(cha)%2==0){
            newWord+=cha
        }
    }
    return newWord
}
fun evenLength(names:Array<String>): MutableList<String> {
    var nameLists = mutableListOf<String>()
    for(name in names){
        if(name.length%2==0){
            nameLists.add(name)
        }
    }
    return nameLists
}