package com.exe.doordashlite.model

import com.google.gson.annotations.SerializedName

data class Business (

	@SerializedName("id") val id : Int,
	@SerializedName("name") val name : String
)