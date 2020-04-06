package com.exe.doordashlite.model


import com.google.gson.annotations.SerializedName

data class DeliveryFeeMonetaryFields (

	@SerializedName("currency") val currency : String,
	@SerializedName("display_string") val displayString : String,
	@SerializedName("unit_amount") val unitAmount : String,
	@SerializedName("decimal_places") val decimalPlaces : Int
)