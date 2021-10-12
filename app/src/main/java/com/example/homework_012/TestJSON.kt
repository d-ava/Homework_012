package com.example.homework_012

import com.google.gson.annotations.SerializedName

data class TestJSON(

    val id: String,
    val projectId: String?,
    val equipmentId: String,
    val status: String,
    val requestedBy: String,
    val acceptedBy: String? = null,
    val author: String,
    val category: String,
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
        val deliveryLocation: DeliveryLocation,
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
        val specifications: List<Specifications>,
        val weight: Int,
        @SerializedName("additional_specifications")
        val additionalSpecifications: String? = null,
        val structureId: String,
        val organizationId: String,
        val beaconType: String? = null,
        val beaconVendor: String,
        val RFID: String,
        val dailyPrice: String? = null,
        val inactive: String? = null,
        val tag: Tag,
        val telematicBox: String? = null,
        val createdAt: String,
        @SerializedName("special_number")
        val specialNumber: String? = null,
        @SerializedName("last_check")
        val lastCheck: String,
        @SerializedName("next_check")
        val nextCheck: String,
        @SerializedName("responsible_person")
        val responsiblePerson: String? = null,
        @SerializedName("test_type")
        val testType: String? = null,
        @SerializedName("unique_equipment_id")
        val uniqueEquipmentId: String,
        @SerializedName("bgl_number")
        val bglNumber: String,
        @SerializedName("serial_number")
        val serialNumber: String? = null,
        val inventory: String? = null,
        val warehouseId: String,
        val trackingTag: String? = null,
        val workingHours: String,
        @SerializedName("navaris_criteria")
        val navarisCriteria: String? = null,
        @SerializedName("dont_send_to_as400")
        val dontSendToAs400: Boolean,
        val model: Model,
        val brand: Brand,
        val category: Category,
        val structure: Structure,
        val wareHouse: String? = null,
        val equipmentMedia: List<EquipmentMedia>,
        val telematics: List<Telematics>,
        val isMoving: Boolean

    )

    data class Specifications(val key: String, val value: Any)
    data class Tag(val date: String, val authorise: String, val media: List<String>?)
    data class Model(
        val id: String,
        val name: String,
        val createdAt: String,
        val brand: Brand,

        )

    data class Brand(val id: String, val name: String, val createdAt: String)
    data class Category(
        val id: String,
        val name: String,
        @SerializedName("name_de")
        val nameDe: String,
        val createdAt: String,
        val media: List<String>?
    )

    data class Structure(
        val id: String,
        val name: String,
        val type: String,
        val color: String
    )

    data class EquipmentMedia(
        val id: String,
        val name: String,
        val files: List<SizePath>
    )

    data class SizePath(val size: String, val path: String)
    data class Telematics(
        val timestamp: Long,
        val eventType: String,
        val projectId:String,
        val equipmentId:String,
        val locationName: String,
        val location: Location,
        val costCenter:String,
        val lastLatitude: Double,
        val lastLongitude: Double,
        val lastLatLonPrecise: Boolean,
        val lastAddressByLatLon:String

    )
    data class Location(
        val type:String,
        val coordinates : List<List<List<List<Double>>>>,

    )
}
