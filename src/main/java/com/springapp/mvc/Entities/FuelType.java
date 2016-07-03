package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicfueltypes", schema = "", catalog = "usedcarsdealer")
public class FuelType {
    private int idFuelType;
    private String nameFuelType;
    private Collection<EnginesEntity> enginesesByIdFuelType;
    private Collection<LogbooksEntity> logbooksesByIdFuelType;
    private Collection<OffersEntity> offersesByIdFuelType;

    @Id
    @Column(name = "IdFuelType")
    public int getIdFuelType() {
        return idFuelType;
    }

    public void setIdFuelType(int idFuelType) {
        this.idFuelType = idFuelType;
    }

    @Basic
    @Column(name = "NameFuelType")
    public String getNameFuelType() {
        return nameFuelType;
    }

    public void setNameFuelType(String nameFuelType) {
        this.nameFuelType = nameFuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicfueltypesEntity that = (DicfueltypesEntity) o;

        if (idFuelType != that.idFuelType) return false;
        if (nameFuelType != null ? !nameFuelType.equals(that.nameFuelType) : that.nameFuelType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFuelType;
        result = 31 * result + (nameFuelType != null ? nameFuelType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicfueltypesByIdFuelType")
    public Collection<EnginesEntity> getEnginesesByIdFuelType() {
        return enginesesByIdFuelType;
    }

    public void setEnginesesByIdFuelType(Collection<EnginesEntity> enginesesByIdFuelType) {
        this.enginesesByIdFuelType = enginesesByIdFuelType;
    }

    @OneToMany(mappedBy = "dicfueltypesByIdFuelType")
    public Collection<LogbooksEntity> getLogbooksesByIdFuelType() {
        return logbooksesByIdFuelType;
    }

    public void setLogbooksesByIdFuelType(Collection<LogbooksEntity> logbooksesByIdFuelType) {
        this.logbooksesByIdFuelType = logbooksesByIdFuelType;
    }

    @OneToMany(mappedBy = "dicfueltypesByIdFuelType")
    public Collection<OffersEntity> getOffersesByIdFuelType() {
        return offersesByIdFuelType;
    }

    public void setOffersesByIdFuelType(Collection<OffersEntity> offersesByIdFuelType) {
        this.offersesByIdFuelType = offersesByIdFuelType;
    }
}
