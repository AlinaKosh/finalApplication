package com.example.Models

class PopularModel {

    private var foodImage : Int? = null
    private var foodName : String = ""
    private var foodPrice : Int = 0
    private var foodCount : Int = 1
    private var foodPriceConstant : Int = 0

    constructor()
    constructor(foodImage: Int?, foodName: String, foodPrice: Int,foodPriceConstant : Int, foodCount : Int) {
        this.foodImage = foodImage
        this.foodName = foodName
        this.foodPrice = foodPrice
        this.foodCount = foodCount
        this.foodPriceConstant = foodPriceConstant
    }

    fun getFoodImage() : Int? {
        return foodImage;
    }

    fun getFoodName() : String{
        return foodName;
    }

    fun getFoodPrice() : Int {
        return foodPrice;
    }

    fun getFoodPriceConstant() : Int {
        return foodPriceConstant;
    }

    fun setFoodImage(foodImage : Int?){
        this.foodImage = foodImage;
    }

    fun getFoodCount() : Int {
        return foodCount;
    }

    fun setFoodName(foodName: String){
        this.foodName = foodName;
    }

    fun setFoodPrice(foodPrice : Int){
        this.foodPrice = foodPrice;
    }

    fun setFoodPriceConstant(foodPriceConstant : Int){
        this.foodPriceConstant = foodPriceConstant;
    }

    fun setFoodCount(foodCount : Int) {
        this.foodCount = foodCount;
    }
}