package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private String school;


    public Principal(String firstname, String lastname, String school) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.school = school;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstname, principal.firstname) && Objects.equals(lastname, principal.lastname) && Objects.equals(school, principal.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, school);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}