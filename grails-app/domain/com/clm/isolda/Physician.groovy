package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder

class Physician extends User {

    static expose = 'physician'

    static hasMany = [patients: Patient]

    static constraints = {
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Physician physician = (Physician) o

        if (patients != physician.patients) return false

        return true
    }

    @Override
    def int hashCode() {
        return 31 * (patients != null ? patients.hashCode() : 0)
    }

    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("patients", patients).
                toString()
    }
}
