package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder

class Measurement {

    String name
    String unit
    String value

    static constraints = {
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Measurement that = (Measurement) o

        if (name != that.name) return false
        if (unit != that.unit) return false
        if (value != that.value) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * result + (name != null ? name.hashCode() : 0)
        result = 31 * result + (unit != null ? unit.hashCode() : 0)
        result = 31 * result + (value != null ? value.hashCode() : 0)
        return result
    }


    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("name", name).
                append("unit", unit).
                append("value", value).
                toString()
    }

}
