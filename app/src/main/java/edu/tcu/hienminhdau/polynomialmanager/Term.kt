package edu.tcu.hienminhdau.polynomialmanager

class Term(input: List<String>) {
    private val c = input[0].toInt()
    private val x = input[1].toInt()
    private val y = input[2].toInt()
    private val z = input[3].toInt()

    fun toStringFirstEle(): String{
        val sb = StringBuilder()
        if(c != 1 && c != -1){
            sb.append(c)
        }else if(c == -1){
            sb.append("-")
        }

        if(x > 1){
            sb.append("(x^$x)")
        }else if(x == 1){
            sb.append("(x)")
        }

        if(y > 1){
            sb.append("(y^$y)")
        }else if(y == 1){
            sb.append("(y)")
        }

        if(z > 1){
            sb.append("(z^$z)")
        }else if(z == 1){
            sb.append("(z)")
        }

        return sb.toString()
    }

    fun toStringOtherEle(): String{
        val sb = StringBuilder()
        if(c > 1){
            sb.append(" + $c")
        }else if(c == -1){
            sb.append(" - ")
        }else if(c < 0){
            sb.append(" - ${-c}")
        }else{
            sb.append(" + ")
        }

        if(x > 1){
            sb.append("(x^$x)")
        }else if(x == 1){
            sb.append("(x)")
        }

        if(y > 1){
            sb.append("(y^$y)")
        }else if(y == 1){
            sb.append("(y)")
        }

        if(z > 1){
            sb.append("(z^$z)")
        }else if(z == 1){
            sb.append("(z)")
        }

        return sb.toString()
    }
}