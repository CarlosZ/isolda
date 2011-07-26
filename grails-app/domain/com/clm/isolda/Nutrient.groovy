package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder

class Nutrient {

    String name
    String description
    Map<String, Double> equivalences

    static constraints = {
        name(maxSize: 100)
        description(maxSize: 2000)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Nutrient nutrient = (Nutrient) o

        if (description != nutrient.description) return false
        if (equivalences != nutrient.equivalences) return false
        if (name != nutrient.name) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * result + (name != null ? name.hashCode() : 0)
        result = 31 * result + (description != null ? description.hashCode() : 0)
        result = 31 * result + (equivalences != null ? equivalences.hashCode() : 0)
        return result
    }

    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("description", description).
                append("name", name).
                append("equivalences", equivalences).
                toString()
    }

}
