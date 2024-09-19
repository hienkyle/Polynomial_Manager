package edu.tcu.hienminhdau.polynomialmanager

class Polynomial(var name: String, private var listOfTerms: MutableList<Term>) {
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("$name = ")
        for(index in listOfTerms.indices){
            if(index == 0) {
                sb.append(listOfTerms[index].toStringFirstEle())
            }else{
                sb.append(listOfTerms[index].toStringOtherEle())
            }
        }

        return sb.toString()
    }
}