package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicbrands", schema = "", catalog = "usedcarsdealer")
public class Brand {
    private int idBrand;
    private String nameBrand;
    private Collection<ModelsEntity> modelsesByIdBrand;
    private Collection<OffersEntity> offersesByIdBrand;

    @Id
    @Column(name = "IdBrand")
    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    @Basic
    @Column(name = "NameBrand")
    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicbrandsEntity that = (DicbrandsEntity) o;

        if (idBrand != that.idBrand) return false;
        if (nameBrand != null ? !nameBrand.equals(that.nameBrand) : that.nameBrand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBrand;
        result = 31 * result + (nameBrand != null ? nameBrand.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicbrandsByIdBrand")
    public Collection<ModelsEntity> getModelsesByIdBrand() {
        return modelsesByIdBrand;
    }

    public void setModelsesByIdBrand(Collection<ModelsEntity> modelsesByIdBrand) {
        this.modelsesByIdBrand = modelsesByIdBrand;
    }

    @OneToMany(mappedBy = "dicbrandsByIdBrand")
    public Collection<OffersEntity> getOffersesByIdBrand() {
        return offersesByIdBrand;
    }

    public void setOffersesByIdBrand(Collection<OffersEntity> offersesByIdBrand) {
        this.offersesByIdBrand = offersesByIdBrand;
    }
}
