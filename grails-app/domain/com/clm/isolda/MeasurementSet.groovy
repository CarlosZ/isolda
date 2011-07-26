package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder

class MeasurementSet {

    Measurement weight
    Measurement bodyMassIndex
    Measurement fat
    Measurement chest
    Measurement waist
    Measurement belly
    Measurement arms
    Measurement legs
    Measurement bloodPressure


    static constraints = {
        bodyMassIndex(nullable: true)
        fat(nullable: true)
        chest(nullable: true)
        waist(nullable: true)
        belly(nullable: true)
        arms(nullable: true)
        legs(nullable: true)
        bloodPressure(nullable: true)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        MeasurementSet that = (MeasurementSet) o

        if (arms != that.arms) return false
        if (belly != that.belly) return false
        if (bodyMassIndex != that.bodyMassIndex) return false
        if (chest != that.chest) return false
        if (fat != that.fat) return false
        if (legs != that.legs) return false
        if (waist != that.waist) return false
        if (weight != that.weight) return false
        if (bloodPressure != that.bloodPressure) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * result + (weight != null ? weight.hashCode() : 0)
        result = 31 * result + (bodyMassIndex != null ? bodyMassIndex.hashCode() : 0)
        result = 31 * result + (fat != null ? fat.hashCode() : 0)
        result = 31 * result + (chest != null ? chest.hashCode() : 0)
        result = 31 * result + (waist != null ? waist.hashCode() : 0)
        result = 31 * result + (belly != null ? belly.hashCode() : 0)
        result = 31 * result + (arms != null ? arms.hashCode() : 0)
        result = 31 * result + (legs != null ? legs.hashCode() : 0)
        result = 31 * result + (bloodPressure != null ? bloodPressure.hashCode() : 0)
        return result
    }


    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("arms", arms).
                append("weight", weight).
                append("bodyMassIndex", bodyMassIndex).
                append("fat", fat).
                append("chest", chest).
                append("waist", waist).
                append("belly", belly).
                append("legs", legs).
                append("bloodPressure", bloodPressure).
                toString()
    }
}
