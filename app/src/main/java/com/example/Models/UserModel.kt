package com.example.Models

class UserModel {
    public var id: String? = ""
    public var name: String = ""
    public var address: String = ""
    public var email: String = ""
    public var phone: String = ""

    constructor()
    constructor(id: String?, name: String, address: String, email: String, phone: String) {
        this.id = id
        this.name = name
        this.address = address
        this.email = email
        this.phone = phone
    }

    fun getId(): String? {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getAddress(): String {
        return address
    }

    fun getEmail(): String {
        return email
    }

    fun getPhone(): String {
        return phone
    }

    fun setId(id: String) {
        this.id = id;
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setAddress(address : String){
        this.address = address
    }

    fun setEmail(email : String){
        this.email = email
    }

    fun setPhone(phone : String){
        this.phone = phone
    }

}