import java.util.Scanner


fun main(){

    val scn = Scanner(System.`in`)
    val N = scn.nextInt()

    val stringslist : MutableList<String> = mutableListOf()


    for(size in  0 .. N ){

        val input = scn.nextLine()
        stringslist.add(input)
    }

    for (item in stringslist){

        if (item.contains("M" , true) || item.contains("B" , true)){
            println(item.uppercase())
        }
    }
}