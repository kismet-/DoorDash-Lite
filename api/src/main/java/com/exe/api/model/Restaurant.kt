package com.exe.doordashlite.model


import com.exe.doordashlite.model.Address
import com.google.gson.annotations.SerializedName

data class Restaurant(

    @SerializedName("is_time_surging") val is_time_surging : Boolean,
    @SerializedName("max_order_size") val max_order_size : String,
    @SerializedName("delivery_fee") val delivery_fee : Int,
    @SerializedName("max_composite_score") val max_composite_score : Int,
    @SerializedName("id") val id : Int,
    @SerializedName("merchant_promotions") val merchant_promotions : List<MerchantPromotions>,
    @SerializedName("average_rating") val average_rating : Double,
    @SerializedName("menus") val menus : List<Menus>,
    @SerializedName("composite_score") val composite_score : Int,
    @SerializedName("status_type") val status_type : String,
    @SerializedName("is_only_catering") val is_only_catering : Boolean,
    @SerializedName("status") val status : String,
    @SerializedName("number_of_ratings") val number_of_ratings : Int,
    @SerializedName("asap_time") val asap_time : Int,
    @SerializedName("description") val description : String,
    @SerializedName("business") val business : Business,
    @SerializedName("tags") val tags : List<String>,
    @SerializedName("yelp_review_count") val yelp_review_count : Int,
    @SerializedName("business_id") val business_id : Int,
    @SerializedName("extra_sos_delivery_fee") val extra_sos_delivery_fee : Int,
    @SerializedName("yelp_rating") val yelp_rating : Double,
    @SerializedName("cover_img_url") val cover_img_url : String?,
    @SerializedName("header_img_url") val header_img_url : String?,
    @SerializedName("address") val address : Address,
    @SerializedName("price_range") val price_range : Int,
    @SerializedName("slug") val slug : String,
    @SerializedName("name") val name : String,
    @SerializedName("is_newly_added") val is_newly_added : Boolean,
    @SerializedName("url") val url : String,
    @SerializedName("service_rate") val service_rate : Int,
    @SerializedName("promotion") val promotion : String,
    @SerializedName("featured_category_description") val featured_category_description : String
)