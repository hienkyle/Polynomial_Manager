package edu.tcu.hienminhdau.polynomialmanager

import kotlin.system.exitProcess

class PolyList(private var listOfPoly: MutableList<Polynomial>) {
    // INSERT
    // Insert a new polynomial into the list
    // Failed when there is already a polynomial with the same name
    //
    // Input: Polynomial
    // Output:
    // If succeeded: Polynomial
    // If failed: null
    fun insert(polynomial: Polynomial): Polynomial?{
        val name: String = polynomial.name
        for(poly in listOfPoly){
            if(poly.name == name){
                return null
            }
        }

        listOfPoly.add(polynomial)
        return polynomial
    }

    // DELETE
    // Delete an existing named polynomial from the list
    // Failed when the name does not exist
    //
    // Input: String
    // Output:
    // If succeeded: String
    // If failed: null
    fun delete(name: String): String?{
        for(poly in listOfPoly){
            if(poly.name == name){
                listOfPoly.remove(poly)
                return name
            }
        }

        return null
    }

    // SEARCH
    // Search for a named polynomial in the list
    // Failed when the name does not exist
    //
    // Input: String
    // Output:
    // If succeeded: Polynomial
    // If failed: null
    fun search(name: String): Polynomial?{
        for(poly in listOfPoly){
            if(poly.name == name){
                return poly
            }
        }

        return null
    }

    // QUIT
    // Exit the program
    //
    // Input:
    // Output:
    fun quit(){
        exitProcess(0)
    }
}