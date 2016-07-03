package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicbodytypes", schema = "", catalog = "usedcarsdealer")
public class BodyType {
    private int idBodyType;
    private String nameBodyType;
    private Collection<LogbooksEntity> logbooksesByIdBodyType;

    @Id
    @Column(name = "IdBodyType")
    public int getIdBodyType() {
        return idBodyType;
    }

    public void setIdBodyType(int idBodyType) {
        this.idBodyType = idBodyType;
    }

    @Basic
    @Column(name = "NameBodyType")
    public String getNameBodyType() {
        return nameBodyType;
    }

    public void setNameBodyType(String nameBodyType) {
        this.nameBodyType = nameBodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicbodytypesEntity that = (DicbodytypesEntity) o;

        if (idBodyType != that.idBodyType) return false;
        if (nameBodyType != null ? !nameBodyType.equals(that.nameBodyType) : that.nameBodyType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBodyType;
        result = 31 * result + (nameBodyType != null ? nameBodyType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicbodytypesByIdBodyType")
    public Collection<LogbooksEntity> getLogbooksesByIdBodyType() {
        return logbooksesByIdBodyType;
    }

    public void setLogbooksesByIdBodyType(Collection<LogbooksEntity> logbooksesByIdBodyType) {
        this.logbooksesByIdBodyType = logbooksesByIdBodyType;
    }
}
