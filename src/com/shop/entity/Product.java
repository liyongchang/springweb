package com.shop.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lyc on 16-3-8.
 */
@Entity
public class Product {
    private int pid;
    private String pname;
    private Double marketPrice;
    private Double shopPrice;
    private String image;
    private String pdesc;
    private Integer isHot;
    private Timestamp pdate;
    private Categorysecond categorysecondByCsid;

    @Id
    @Column(name = "pid", nullable = false, insertable = true, updatable = true)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pname", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "market_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Basic
    @Column(name = "shop_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    @Basic
    @Column(name = "image", nullable = true, insertable = true, updatable = true, length = 255)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "pdesc", nullable = true, insertable = true, updatable = true, length = 255)
    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    @Basic
    @Column(name = "is_hot", nullable = true, insertable = true, updatable = true)
    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "pdate", nullable = true, insertable = true, updatable = true)
    public Timestamp getPdate() {
        return pdate;
    }

    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (pid != product.pid) return false;
        if (pname != null ? !pname.equals(product.pname) : product.pname != null) return false;
        if (marketPrice != null ? !marketPrice.equals(product.marketPrice) : product.marketPrice != null) return false;
        if (shopPrice != null ? !shopPrice.equals(product.shopPrice) : product.shopPrice != null) return false;
        if (image != null ? !image.equals(product.image) : product.image != null) return false;
        if (pdesc != null ? !pdesc.equals(product.pdesc) : product.pdesc != null) return false;
        if (isHot != null ? !isHot.equals(product.isHot) : product.isHot != null) return false;
        if (pdate != null ? !pdate.equals(product.pdate) : product.pdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (shopPrice != null ? shopPrice.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (pdesc != null ? pdesc.hashCode() : 0);
        result = 31 * result + (isHot != null ? isHot.hashCode() : 0);
        result = 31 * result + (pdate != null ? pdate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "csid", referencedColumnName = "csid")
    public Categorysecond getCategorysecondByCsid() {
        return categorysecondByCsid;
    }

    public void setCategorysecondByCsid(Categorysecond categorysecondByCsid) {
        this.categorysecondByCsid = categorysecondByCsid;
    }
}
