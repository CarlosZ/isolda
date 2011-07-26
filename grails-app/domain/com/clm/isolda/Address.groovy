package com.clm.isolda

import org.apache.commons.lang.builder.ToStringBuilder

class Address {

    String address1
    String address2
    String phoneNumber1
    String phoneNumber2
    String phoneNumber3

    static constraints = {
        address1(maxSize: 200)
        address2(nullable: true, maxSize: 200)
        phoneNumber1(maxSize: 18)
        phoneNumber2(nullable: true, maxSize: 18)
        phoneNumber3(nullable: true, maxSize: 18)
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true
        if (!o instanceof Address) return false

        Address address = (Address) o

        if (address1 != address.address1) return false
        if (address2 != address.address2) return false
        if (phoneNumber1 != address.phoneNumber1) return false
        if (phoneNumber2 != address.phoneNumber2) return false
        if (phoneNumber3 != address.phoneNumber3) return false

        return true
    }

    @Override
    def int hashCode() {
        int result = 17
        result = 31 * result + (address1 != null ? address1.hashCode() : 0)
        result = 31 * result + (address2 != null ? address2.hashCode() : 0)
        result = 31 * result + (phoneNumber1 != null ? phoneNumber1.hashCode() : 0)
        result = 31 * result + (phoneNumber2 != null ? phoneNumber2.hashCode() : 0)
        result = 31 * result + (phoneNumber3 != null ? phoneNumber3.hashCode() : 0)
        return result
    }

    @Override
    def String toString() {
        return new ToStringBuilder(this).
                append("address1", address1).
                append("address2", address2).
                append("phoneNumber1", phoneNumber1).
                append("phoneNumber2", phoneNumber2).
                append("phoneNumber3", phoneNumber3).
                toString()
    }

}
