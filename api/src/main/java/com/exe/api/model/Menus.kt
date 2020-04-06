package com.exe.doordashlite.model


import com.google.gson.annotations.SerializedName

data class Menus (

    @SerializedName("popular_items") val popular_items : List<PopularItems>,
    @SerializedName("is_catering") val is_catering : Boolean,
    @SerializedName("subtitle") val subtitle : String,
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String
)