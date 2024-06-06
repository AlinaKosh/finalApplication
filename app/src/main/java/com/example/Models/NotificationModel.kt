package com.example.Models

class NotificationModel {

    private var image: Int? = null
    private var notification: String = ""


    constructor()
    constructor( image: Int?, notification: String) {
        this.notification = notification
        this.image = image
    }

    fun getNotification(): String {
        return notification
    }

    fun getImage(): Int? {
        return image
    }

    fun setNotification(notification: String) {
        this.notification = notification
    }

    fun setImage(image: Int?) {
        this.image = image
    }


}