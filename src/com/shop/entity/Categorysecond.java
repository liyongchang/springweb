package com.shop.entity;

import javax.persistence.*;

/**
 * Created by lyc on 16-3-8.
 */
@Entity
public class Categorysecond {
    private int csid;
    private String csname;
    private Category categoryByCid;

    @Id
    @Column(name = "csid", nullable = false, insertable = true, updatable = true)
    public int getCsid() {
        return csid;
    }

    public void setCsid(int csid) {
        this.csid = csid;
    }

    @Basic
    @Column(name = "csname", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCsname() {
        return csname;
    }

    public void setCsname(String csname) {
        this.csname = csname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categorysecond that = (Categorysecond) o;

        if (csid != that.csid) return false;
        if (csname != null ? !csname.equals(that.csname) : that.csname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = csid;
        result = 31 * result + (csname != null ? csname.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    public Category getCategoryByCid() {
        return categoryByCid;
    }

    public void setCategoryByCid(Category categoryByCid) {
        this.categoryByCid = categoryByCid;
    }
}
