package com.clm.isolda.security

import org.apache.commons.lang.builder.ToStringBuilder

class Role {

    String authority

    static mapping = {
        cache true
    }

    static constraints = {
        authority blank: false, unique: true
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        Role role = (Role) o;

        if (authority != role.authority) return false;

        return true;
    }

    @Override
    def int hashCode() {
        return 31 * (authority != null ? authority.hashCode() : 0);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("authority", authority).
                toString();
    }
}
