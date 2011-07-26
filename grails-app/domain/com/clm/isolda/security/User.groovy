package com.clm.isolda.security

import com.clm.isolda.Address
import org.apache.commons.lang.builder.ToStringBuilder
import org.joda.time.LocalDate
import org.joda.time.contrib.hibernate.PersistentLocalDate

class User {

    String username
    String password
    boolean enabled
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired
    String email
    Address address
    String firstName
    String lastName
    LocalDate birthDate
    File picture

    static constraints = {
        firstName(maxSize: 25)
        lastName(maxSize: 25)
        email(maxSize: 100)
        picture(nullable: true)
        username blank: false, unique: true
        password blank: false
    }

    static mapping = {
        birthDate(type: PersistentLocalDate, lazy: false)
    }


    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this).collect { it.role } as Set
    }

    @Override
    def boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        User user = (User) o;

        if (accountExpired != user.accountExpired) return false;
        if (accountLocked != user.accountLocked) return false;
        if (enabled != user.enabled) return false;
        if (passwordExpired != user.passwordExpired) return false;
        if (address != user.address) return false;
        if (birthDate != user.birthDate) return false;
        if (email != user.email) return false;
        if (firstName != user.firstName) return false;
        if (lastName != user.lastName) return false;
        if (password != user.password) return false;
        if (picture != user.picture) return false;
        if (username != user.username) return false;

        return true;
    }

    @Override
    def int hashCode() {
        int result = 17;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (enabled ? 1 : 0);
        result = 31 * result + (accountExpired ? 1 : 0);
        result = 31 * result + (accountLocked ? 1 : 0);
        result = 31 * result + (passwordExpired ? 1 : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("accountExpired", accountExpired).
                append("username", username).
                append("password", password).
                append("enabled", enabled).
                append("accountLocked", accountLocked).
                append("passwordExpired", passwordExpired).
                append("email", email).
                append("address", address).
                append("firstName", firstName).
                append("lastName", lastName).
                append("birthDate", birthDate).
                append("picture", picture).
                toString();
    }
}
