package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "models", schema = "", catalog = "usedcarsdealer")
public class Model {
    private int idModel;
    private Integer idBrand;
    private String nameModel;
    private Collection<LogbooksEntity> logbooksesByIdModel;
    private DicbrandsEntity dicbrandsByIdBrand;

    @Id
    @Column(name = "IdModel")
    public int getIdModel() {
        return idModel;
    }

    public void setIdModel(int idModel) {
        this.idModel = idModel;
    }
//
//    @Basic
//    @Column(name = "IdBrand")
//    public Integer getIdBrand() {
//        return idBrand;
//    }
//
//    public void setIdBrand(Integer idBrand) {
//        this.idBrand = idBrand;
//    }

    @Basic
    @Column(name = "NameModel")
    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelsEntity that = (ModelsEntity) o;

        if (idModel != that.idModel) return false;
        if (idBrand != null ? !idBrand.equals(that.idBrand) : that.idBrand != null) return false;
        if (nameModel != null ? !nameModel.equals(that.nameModel) : that.nameModel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idModel;
        result = 31 * result + (idBrand != null ? idBrand.hashCode() : 0);
        result = 31 * result + (nameModel != null ? nameModel.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "modelsByIdModel")
    public Collection<LogbooksEntity> getLogbooksesByIdModel() {
        return logbooksesByIdModel;
    }

    public void setLogbooksesByIdModel(Collection<LogbooksEntity> logbooksesByIdModel) {
        this.logbooksesByIdModel = logbooksesByIdModel;
    }

    @ManyToOne
    @JoinColumn(name = "IdBrand", referencedColumnName = "IdBrand")
    public DicbrandsEntity getDicbrandsByIdBrand() {
        return dicbrandsByIdBrand;
    }

    public void setDicbrandsByIdBrand(DicbrandsEntity dicbrandsByIdBrand) {
        this.dicbrandsByIdBrand = dicbrandsByIdBrand;
    }
}
