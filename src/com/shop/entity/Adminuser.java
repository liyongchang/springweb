package com.shop.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by lyc on 16-3-8.
 */
@Entity
public class Adminuser {
    private int uid;
    private String username;
    private String password;

    @Id
    @Column(name = "uid", nullable = false, insertable = true, updatable = true)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adminuser adminuser = (Adminuser) o;

        if (uid != adminuser.uid) return false;
        if (username != null ? !username.equals(adminuser.username) : adminuser.username != null) return false;
        if (password != null ? !password.equals(adminuser.password) : adminuser.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
