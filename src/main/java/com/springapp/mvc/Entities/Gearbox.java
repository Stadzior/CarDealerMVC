package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "gearboxes", schema = "", catalog = "usedcarsdealer")
public class Gearbox {
    private int idGearBox;
    private Integer idGearBoxType;
    private Integer amountOfGears;
    private DicgearboxtypesEntity dicgearboxtypesByIdGearBoxType;
    private Collection<LogbooksEntity> logbooksesByIdGearBox;

    @Id
    @Column(name = "IdGearBox")
    public int getIdGearBox() {
        return idGearBox;
    }

    public void setIdGearBox(int idGearBox) {
        this.idGearBox = idGearBox;
    }

//    @Basic
//    @Column(name = "IdGearBoxType")
//    public Integer getIdGearBoxType() {
//        return idGearBoxType;
//    }
//
//    public void setIdGearBoxType(Integer idGearBoxType) {
//        this.idGearBoxType = idGearBoxType;
//    }

    @Basic
    @Column(name = "AmountOfGears")
    public Integer getAmountOfGears() {
        return amountOfGears;
    }

    public void setAmountOfGears(Integer amountOfGears) {
        this.amountOfGears = amountOfGears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GearboxesEntity that = (GearboxesEntity) o;

        if (idGearBox != that.idGearBox) return false;
        if (amountOfGears != null ? !amountOfGears.equals(that.amountOfGears) : that.amountOfGears != null)
            return false;
        if (idGearBoxType != null ? !idGearBoxType.equals(that.idGearBoxType) : that.idGearBoxType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGearBox;
        result = 31 * result + (idGearBoxType != null ? idGearBoxType.hashCode() : 0);
        result = 31 * result + (amountOfGears != null ? amountOfGears.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdGearBoxType", referencedColumnName = "IdGearBoxType")
    public DicgearboxtypesEntity getDicgearboxtypesByIdGearBoxType() {
        return dicgearboxtypesByIdGearBoxType;
    }

    public void setDicgearboxtypesByIdGearBoxType(DicgearboxtypesEntity dicgearboxtypesByIdGearBoxType) {
        this.dicgearboxtypesByIdGearBoxType = dicgearboxtypesByIdGearBoxType;
    }

    @OneToMany(mappedBy = "gearboxesByIdGearBox")
    public Collection<LogbooksEntity> getLogbooksesByIdGearBox() {
        return logbooksesByIdGearBox;
    }

    public void setLogbooksesByIdGearBox(Collection<LogbooksEntity> logbooksesByIdGearBox) {
        this.logbooksesByIdGearBox = logbooksesByIdGearBox;
    }
}
