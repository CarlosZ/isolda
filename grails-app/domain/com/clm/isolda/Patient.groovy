package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder
import org.joda.time.LocalDate
import org.joda.time.contrib.hibernate.PersistentLocalDate

class Patient extends User {

    static expose = 'patient'

    LocalDate programStart
    LocalDate programEnd
    Physician secondaryPhysician
    Set<DietaryProgram> programs
    MeasurementSet initialMeasurements

    static belongsTo = [physician: Physician]  // This is the primary physician
    static hasMany = [appointments: Appointment, objectives: Objective, programs: DietaryProgram]

    static constraints = {
        secondaryPhysician(nullable: true)
        programEnd(nullable: true)
        initialMeasurements(nullable: true)
    }

    static mapping = {
        programStart(type: PersistentLocalDate, lazy: false)
        programEnd(type: PersistentLocalDate, lazy: false)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Patient patient = (Patient) o

        if (initialMeasurements != patient.initialMeasurements) return false
        if (objectives != patient.objectives) return false
        if (physician != patient.physician) return false
        if (programStart != patient.programStart) return false
        if (secondaryPhysician != patient.secondaryPhysician) return false

        return true
    }

    @Override
    int hashCode() {
        int result = 17
        result = 31 * result + (programStart != null ? programStart.hashCode() : 0)
        result = 31 * result + (physician != null ? physician.hashCode() : 0)
        result = 31 * result + (secondaryPhysician != null ? secondaryPhysician.hashCode() : 0)
        result = 31 * result + (objectives != null ? objectives.hashCode() : 0)
        result = 31 * result + (initialMeasurements != null ? initialMeasurements.hashCode() : 0)
        return result
    }


    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("programStart", programStart).
                append("primaryPhysician", physician).
                append("secondaryPhysician", secondaryPhysician).
                append("objectives", objectives).
                append("initialMeasurements", initialMeasurements).
                toString()
    }
}
