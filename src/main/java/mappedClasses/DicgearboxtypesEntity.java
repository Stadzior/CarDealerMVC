package mappedClasses;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicgearboxtypes", schema = "", catalog = "usedcarsdealer")
public class DicgearboxtypesEntity {
    private int idGearBoxType;
    private String nameGearBoxType;
    private Collection<GearboxesEntity> gearboxesesByIdGearBoxType;

    @Id
    @Column(name = "IdGearBoxType")
    public int getIdGearBoxType() {
        return idGearBoxType;
    }

    public void setIdGearBoxType(int idGearBoxType) {
        this.idGearBoxType = idGearBoxType;
    }

    @Basic
    @Column(name = "NameGearBoxType")
    public String getNameGearBoxType() {
        return nameGearBoxType;
    }

    public void setNameGearBoxType(String nameGearBoxType) {
        this.nameGearBoxType = nameGearBoxType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicgearboxtypesEntity that = (DicgearboxtypesEntity) o;

        if (idGearBoxType != that.idGearBoxType) return false;
        if (nameGearBoxType != null ? !nameGearBoxType.equals(that.nameGearBoxType) : that.nameGearBoxType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGearBoxType;
        result = 31 * result + (nameGearBoxType != null ? nameGearBoxType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicgearboxtypesByIdGearBoxType")
    public Collection<GearboxesEntity> getGearboxesesByIdGearBoxType() {
        return gearboxesesByIdGearBoxType;
    }

    public void setGearboxesesByIdGearBoxType(Collection<GearboxesEntity> gearboxesesByIdGearBoxType) {
        this.gearboxesesByIdGearBoxType = gearboxesesByIdGearBoxType;
    }
}
