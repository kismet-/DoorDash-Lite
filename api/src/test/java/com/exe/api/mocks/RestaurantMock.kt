package com.exe.api.mocks

import com.exe.doordashlite.model.*

object GenerateRemoteTestData {

    fun generateSessionRestaurant(): Restaurant{
        return Restaurant(
            is_time_surging = false,
            max_order_size = "4",
            max_composite_score = (0..10).random(),
            delivery_fee = (0..10).random(),
            id = (0..100000).random(),
            merchant_promotions = listOf(
                MerchantPromotions(
                minimum_subtotal_monetary_fields = MinimumSubtotalMonetaryFields(
                    currency = "United Stated Dollar",
                    displayString = "USD",
                    unitAmount = "1",
                    decimalPlaces = 2
                ),
                delivery_fee = "2.00",
                delivery_fee_monetary_fields = DeliveryFeeMonetaryFields(
                    currency = "USD",
                    displayString = "$0.00",
                    unitAmount = "3",
                    decimalPlaces = 2
                ),
                    minimum_subtotal = "2",
                    new_store_customers_only = false,
                    id = (0..100000).random()
                )
                ),
            average_rating = 40.0,
            menus = listOf(Menus(popular_items = listOf(PopularItems(price = 4, description = "food", imgUrl = "google.com", id = (0..838278).random(), name = "Ron")),
            is_catering = true,
            subtitle = "Is food",
            name = "Item",
            id = (0..838278).random())
            ),
            composite_score = (0..838278).random(),
            status_type = "Fulfilled",
            is_only_catering = false,
            status = "Unavailable",
            number_of_ratings = 3184,
            asap_time = 0,
            description = "Sushi Bars, Asian, Asian Food, Takeout, Sushi, Japanese, Pickup",
            business = Business(
                id = (0..939902).random(),
                name = "Ruby Sushi"
            ),
            tags = listOf("Sushi Bars",
                "Asian",
                "Asian Food",
                "Takeout",
                "Sushi",
                "Japanese",
                "Pickup"
            ),
            yelp_rating = 0.0,
            business_id = (0..939902).random(),
            extra_sos_delivery_fee = 0,
            yelp_review_count = 9,
            cover_img_url = null,
            header_img_url = "google.com",
            address = Address(
                city = "Palo Alto",
            state = "CA",
        street = "201 University Avenue",
        lat = 37.4448944,
        lng = -122.1628303,
        printableAddress = "Ruby Sushi, 201 University Ave, Palo Alto, CA 94301, USA"
        ),
            price_range = 2,
            slug = "ruby-sushi-palo-alto",
            name = "Ruby Sushi (University Ave)",
        is_newly_added = false,
        url = "/store/ruby-sushi-palo-alto-348838/",
        service_rate = 11,
        promotion = null,
        featured_category_description = null
        )
    }
}