package com.coderscampus.assignment013.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    private Long userId;
    private User user;
    private String streetName;
    private String zipCode;

    @Id
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @OneToOne
    @MapsId
    @JoinColumn(name="user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    @Column(length=200)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    @Column(length=15)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
