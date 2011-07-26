package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder
import org.joda.time.LocalDateTime
import org.joda.time.contrib.hibernate.PersistentLocalDateTime

class Appointment {

    static expose = 'appointment'

    LocalDateTime date
    AppointmentStatus status
    String notes
    MeasurementSet measurements
    String recommendations
    Objective objective

    static belongsTo = [patient: Patient]

    static constraints = {
        notes(nullable: true, maxSize: 2000)
        recommendations(nullable: true, maxSize: 2000)
    }

    static mapping = {
        date(type: PersistentLocalDateTime, lazy: false)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Appointment that = (Appointment) o

        if (date != that.date) return false
        if (measurements != that.measurements) return false
        if (notes != that.notes) return false
        if (objective != that.objective) return false
        if (recommendations != that.recommendations) return false
        if (status != that.status) return false
        if (patient != that.patient) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 + result + (date != null ? date.hashCode() : 0)
        result = 31 * result + (status != null ? status.hashCode() : 0)
        result = 31 * result + (notes != null ? notes.hashCode() : 0)
        result = 31 * result + (measurements != null ? measurements.hashCode() : 0)
        result = 31 * result + (recommendations != null ? recommendations.hashCode() : 0)
        result = 31 * result + (objective != null ? objective.hashCode() : 0)
        result = 31 * result + (patient != null ? patient.hashCode() : 0)
        return result
    }


    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("date", date).
                append("status", status).
                append("notes", notes).
                append("measurements", measurements).
                append("recommendations", recommendations).
                append("objective", objective).
                append("patient", patient).
                toString()
    }

}
