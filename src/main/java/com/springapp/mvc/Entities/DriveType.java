package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicdrivetypes", schema = "", catalog = "usedcarsdealer")
public class DriveType {
    private int idDriveType;
    private String nameDriveType;
    private Collection<CarsEntity> carsesByIdDriveType;

    @Id
    @Column(name = "IdDriveType")
    public int getIdDriveType() {
        return idDriveType;
    }

    public void setIdDriveType(int idDriveType) {
        this.idDriveType = idDriveType;
    }

    @Basic
    @Column(name = "NameDriveType")
    public String getNameDriveType() {
        return nameDriveType;
    }

    public void setNameDriveType(String nameDriveType) {
        this.nameDriveType = nameDriveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicdrivetypesEntity that = (DicdrivetypesEntity) o;

        if (idDriveType != that.idDriveType) return false;
        if (nameDriveType != null ? !nameDriveType.equals(that.nameDriveType) : that.nameDriveType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDriveType;
        result = 31 * result + (nameDriveType != null ? nameDriveType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicdrivetypesByIdDriveType")
    public Collection<CarsEntity> getCarsesByIdDriveType() {
        return carsesByIdDriveType;
    }

    public void setCarsesByIdDriveType(Collection<CarsEntity> carsesByIdDriveType) {
        this.carsesByIdDriveType = carsesByIdDriveType;
    }
}
