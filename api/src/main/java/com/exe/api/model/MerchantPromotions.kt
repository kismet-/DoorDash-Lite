package com.exe.doordashlite.model

import com.google.gson.annotations.SerializedName

data class MerchantPromotions (

    @SerializedName("minimum_subtotal_monetary_fields") val minimum_subtotal_monetary_fields : MinimumSubtotalMonetaryFields,
    @SerializedName("delivery_fee") val delivery_fee : String,
    @SerializedName("delivery_fee_monetary_fields") val delivery_fee_monetary_fields : DeliveryFeeMonetaryFields,
    @SerializedName("minimum_subtotal") val minimum_subtotal : String,
    @SerializedName("new_store_customers_only") val new_store_customers_only : Boolean,
    @SerializedName("id") val id : Int
)