package com.exe.doordashlite.model

import com.google.gson.annotations.SerializedName

data class PopularItems (

	@SerializedName("price") val price : Int,
	@SerializedName("description") val description : String,
	@SerializedName("img_url") val imgUrl : String,
	@SerializedName("id") val id : Int,
	@SerializedName("name") val name : String
)