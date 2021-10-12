package com.example.homework_012

import androidx.annotation.StringRes
import com.google.gson.annotations.SerializedName

data class TestJSON(

    val id: String,
    val projectId: String?,
    val equipmentId: String,
    val status: String,
    val requestedBy: String,
    val acceptedBy: String? = null,
    val author: String,
    @SerializedName("category")
    val category: String,               //in case want to change name from JSON
    val locations: Locations,
    val filters: List<Filters>,
    val type: String?,
    val organization: String,
    val address: String?,
    val startDate: String?,
    val endDate: String?,
    val description: String? = null,
    val prolongDates: List<String>?,
    val releaseDates: List<String>?,
    val isDummy: Boolean?,
    val hasDriver: Boolean?,
    val overwriteDate: String? = null,
    val metaInfo: String? = null,
    val warehouseId: String? = null,
    val rentalDescription: String? = null,
    val internalTransportations: InternalTransportations?,
    val startDateMilliseconds: Long,
    val endDateMilliseconds: Long,
    val equipment: Equipment?,

    ) {

    data class Locations(val type: String, val coordinates: List<Double>)
    data class Filters(val name: String, val value: Value)
    data class Value(val max: Int, val min: Int)
    data class InternalTransportations(
        val id: String,
        val projectRequestId: String,
        val pickUpDate: String?,
        val deliveryDate: String?,
        val description: String? = null,
        val status: String,
        val startDateOption: String? = null,
        val endDateOption: String? = null,
        val pickUpLocation: PickUpLocation,
        val deliveryLocation: DeliveryLocation
        val provider: String?,
        val pickUpLocationAddress: String?,
        val deliveryLocationAddress: String?,
        val pGroup: String?,
        val isOrganizedWithoutSam: String? = null,
        val templatePGroup: String,
        val pickUpDateMilliseconds: Long,
        val deliveryDateMilliseconds: Long,
        val startDateOptionMilliseconds: Long?,
        val endDateOptionMilliseconds: Long?
    )

    data class PickUpLocation(val type: String, val coordinates: List<Double>)
    data class DeliveryLocation(val type: String, val coordinates: List<Double>)
    data class Equipment(
        val id: String,
        val title: String,
        val invNumber: String,
        val categoryID: String,
        val modelID: String,
        val brandID: String,
        val year: Int,
        val specifications: List<Specifications>

    )
    data class Specifications()
}
