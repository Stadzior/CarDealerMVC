package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "engines", schema = "", catalog = "usedcarsdealer")
public class EnginesEntity {
    private int idEngine;
    private Integer idFuelType;
    private Integer volumeEngine;
    private Integer horsePower;
    private String description;
    private DicfueltypesEntity dicfueltypesByIdFuelType;
    private Collection<LogbooksEntity> logbooksesByIdEngine;

    @Id
    @Column(name = "IdEngine")
    public int getIdEngine() {
        return idEngine;
    }

    public void setIdEngine(int idEngine) {
        this.idEngine = idEngine;
    }

//    @Basic
//    @Column(name = "IdFuelType")
//    public Integer getIdFuelType() {
//        return idFuelType;
//    }
//
//    public void setIdFuelType(Integer idFuelType) {
//        this.idFuelType = idFuelType;
//    }

    @Basic
    @Column(name = "VolumeEngine")
    public Integer getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(Integer volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    @Basic
    @Column(name = "HorsePower")
    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnginesEntity that = (EnginesEntity) o;

        if (idEngine != that.idEngine) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (horsePower != null ? !horsePower.equals(that.horsePower) : that.horsePower != null) return false;
        if (idFuelType != null ? !idFuelType.equals(that.idFuelType) : that.idFuelType != null) return false;
        if (volumeEngine != null ? !volumeEngine.equals(that.volumeEngine) : that.volumeEngine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEngine;
        result = 31 * result + (idFuelType != null ? idFuelType.hashCode() : 0);
        result = 31 * result + (volumeEngine != null ? volumeEngine.hashCode() : 0);
        result = 31 * result + (horsePower != null ? horsePower.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdFuelType", referencedColumnName = "IdFuelType")
    public DicfueltypesEntity getDicfueltypesByIdFuelType() {
        return dicfueltypesByIdFuelType;
    }

    public void setDicfueltypesByIdFuelType(DicfueltypesEntity dicfueltypesByIdFuelType) {
        this.dicfueltypesByIdFuelType = dicfueltypesByIdFuelType;
    }

    @OneToMany(mappedBy = "enginesByIdEngine")
    public Collection<LogbooksEntity> getLogbooksesByIdEngine() {
        return logbooksesByIdEngine;
    }

    public void setLogbooksesByIdEngine(Collection<LogbooksEntity> logbooksesByIdEngine) {
        this.logbooksesByIdEngine = logbooksesByIdEngine;
    }
}
