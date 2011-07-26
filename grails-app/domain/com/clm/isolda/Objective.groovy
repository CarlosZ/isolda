package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder
import org.joda.time.LocalDate
import org.joda.time.contrib.hibernate.PersistentLocalDate

class Objective {

    LocalDate proposed
    LocalDate completed
    MeasurementSet targetMeasurements

    static constraints = {
    }

    static mapping = {
        proposed(type: PersistentLocalDate, lazy: false)
        completed(type: PersistentLocalDate, lazy: false)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Objective objective = (Objective) o

        if (completed != objective.completed) return false
        if (proposed != objective.proposed) return false
        if (targetMeasurements != objective.targetMeasurements) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * (proposed != null ? proposed.hashCode() : 0)
        result = 31 * result + (completed != null ? completed.hashCode() : 0)
        result = 31 * result + (targetMeasurements != null ? targetMeasurements.hashCode() : 0)
        return result
    }

    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("completed", completed).
                append("proposed", proposed).
                append("targetMeasurements", targetMeasurements).
                toString()
    }
}
