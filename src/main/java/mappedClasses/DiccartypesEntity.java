package mappedClasses;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "diccartypes", schema = "", catalog = "usedcarsdealer")
public class DiccartypesEntity {
    private int idCarType;
    private String nameCarType;
    private Collection<LogbooksEntity> logbooksesByIdCarType;

    @Id
    @Column(name = "IdCarType")
    public int getIdCarType() {
        return idCarType;
    }

    public void setIdCarType(int idCarType) {
        this.idCarType = idCarType;
    }

    @Basic
    @Column(name = "NameCarType")
    public String getNameCarType() {
        return nameCarType;
    }

    public void setNameCarType(String nameCarType) {
        this.nameCarType = nameCarType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiccartypesEntity that = (DiccartypesEntity) o;

        if (idCarType != that.idCarType) return false;
        if (nameCarType != null ? !nameCarType.equals(that.nameCarType) : that.nameCarType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCarType;
        result = 31 * result + (nameCarType != null ? nameCarType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "diccartypesByIdCarType")
    public Collection<LogbooksEntity> getLogbooksesByIdCarType() {
        return logbooksesByIdCarType;
    }

    public void setLogbooksesByIdCarType(Collection<LogbooksEntity> logbooksesByIdCarType) {
        this.logbooksesByIdCarType = logbooksesByIdCarType;
    }
}
