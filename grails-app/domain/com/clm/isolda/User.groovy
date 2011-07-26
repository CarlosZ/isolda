package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder
import org.joda.time.LocalDate
import org.joda.time.contrib.hibernate.PersistentLocalDate

class User {

    Address address
    String firstName
    String lastName
    LocalDate birthDate
    File image

    static constraints = {
    }

    static mapping = {
        birthDate(type: PersistentLocalDate, lazy: false)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        User user = (User) o

        if (address != user.address) return false
        if (birthDate != user.birthDate) return false
        if (firstName != user.firstName) return false
        if (image != user.image) return false
        if (lastName != user.lastName) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * result + (address != null ? address.hashCode() : 0)
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0)
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0)
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0)
        result = 31 * result + (image != null ? image.hashCode() : 0)
        return result
    }

    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("address", address).
                append("firstName", firstName).
                append("lastName", lastName).
                append("birthDate", birthDate).
                append("image", image).
                toString()
    }
}
