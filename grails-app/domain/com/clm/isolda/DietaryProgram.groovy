package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder
import org.joda.time.LocalDate
import org.joda.time.contrib.hibernate.PersistentLocalDate

class DietaryProgram {

    LocalDate startDate
    LocalDate endDate
    Map<Nutrient, String> nutrientToQuantity

    static belongsTo = [patient: Patient]

    static hasMany = [possibleRecipes: Recipe]

    static constraints = {
    }

    static mapping = {
        startDate(type: PersistentLocalDate, lazy: false)
        endDate(type: PersistentLocalDate, lazy: false)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        DietaryProgram that = (DietaryProgram) o

        if (endDate != that.endDate) return false
        if (nutrientToQuantity != that.nutrientToQuantity) return false
        if (possibleRecipes != that.possibleRecipes) return false
        if (startDate != that.startDate) return false
        if (patient != that.patient) return false

        return true
    }

    @Override
    def int hashCode() {
        int result
        result = (startDate != null ? startDate.hashCode() : 0)
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0)
        result = 31 * result + (nutrientToQuantity != null ? nutrientToQuantity.hashCode() : 0)
        result = 31 * result + (possibleRecipes != null ? possibleRecipes.hashCode() : 0)
        result = 31 * result + (patient != null ? patient.hashCode() : 0)
        return result
    }


    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("endDate", endDate).
                append("startDate", startDate).
                append("nutrientToQuantity", nutrientToQuantity).
                append("possibleRecipes", possibleRecipes).
                append("patient", patient).
                toString()
    }

}
