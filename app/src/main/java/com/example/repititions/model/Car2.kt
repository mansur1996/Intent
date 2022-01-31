package com.example.repititions.model

import java.io.Serializable

class Car2(var img : Int, var name : String, var cost : String) : Serializable{
    override fun toString(): String {
        return "name:$name cost:$cost"
    }
}