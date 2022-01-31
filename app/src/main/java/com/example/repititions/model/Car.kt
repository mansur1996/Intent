package com.example.repititions.model

import java.io.Serializable

class Car(private var id : Int, private var name: String) : Serializable {
    override fun toString(): String {
        return "id: $id name: $name"
    }
}