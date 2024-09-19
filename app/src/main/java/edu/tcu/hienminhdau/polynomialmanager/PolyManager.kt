package edu.tcu.hienminhdau.polynomialmanager

class PolyManager{
    // The PolyList object to be used
    private val polyList = PolyList(ArrayList())

    // Parse the program
    // Input: String
    // Output:
    fun commandParse(cmd: String){
        // Split the command
        val components = cmd.split(" ")

        // Extract the operator
        val op = components[0]
        when(op){
            "INSERT" -> {
                val name = components[1]
                val terms = ArrayList<Term>()

                // for each input term, construct a Term object and add to the list
                for(num in 2..<components.size){
                    val term = Term(components[num].split(","))
                    terms.add(term)
                }

                // Construct the polynomial from terms
                val polynomial = Polynomial(name, terms)
                // Insert the polynomial
                val insertedPoly = polyList.insert(polynomial)

                if(insertedPoly != null){
                    println(insertedPoly.toString())
                }else{
                    println("POLYNOMIAL $name ALREADY INSERTED")
                }
            }

            "DELETE" -> {
                val name = components[1]
                // Delete the named polynomial
                val deletedName = polyList.delete(name)

                if(deletedName != null){
                    println("POLYNOMIAL $deletedName SUCCESSFULLY DELETED")
                }else{
                    println("POLYNOMIAL $name DOES NOT EXIST")
                }
            }

            "SEARCH" -> {
                val name = components[1]
                // Search for the named polynomial
                val resultPoly = polyList.search(name)
                if(resultPoly != null){
                    println(resultPoly.toString())
                }else{
                    println("POLYNOMIAL $name DOES NOT EXIST")
                }
            }

            "QUIT" -> {
                println("Thank you for using our tool!")
                // Quit
                polyList.quit()
            }
        }
    }
}

fun main(){
    println("Welcome to the polynomial management tool!")
    // Initiate the PolyManager object
    val polyManager = PolyManager()

    while(true){
        // Prompt
        print("poly manager> ")

        // Read the command from stdin
        val cmd = readln()
        // Parse the command and execute
        polyManager.commandParse(cmd)
    }
}

