package mappedClasses;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicstates", schema = "", catalog = "usedcarsdealer")
public class DicstatesEntity {
    private int idState;
    private String nameState;
    private Collection<CarsEntity> carsesByIdState;
    private Collection<OffersEntity> offersesByIdState;

    @Id
    @Column(name = "IdState")
    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    @Basic
    @Column(name = "NameState")
    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicstatesEntity that = (DicstatesEntity) o;

        if (idState != that.idState) return false;
        if (nameState != null ? !nameState.equals(that.nameState) : that.nameState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idState;
        result = 31 * result + (nameState != null ? nameState.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicstatesByIdState")
    public Collection<CarsEntity> getCarsesByIdState() {
        return carsesByIdState;
    }

    public void setCarsesByIdState(Collection<CarsEntity> carsesByIdState) {
        this.carsesByIdState = carsesByIdState;
    }

    @OneToMany(mappedBy = "dicstatesByIdState")
    public Collection<OffersEntity> getOffersesByIdState() {
        return offersesByIdState;
    }

    public void setOffersesByIdState(Collection<OffersEntity> offersesByIdState) {
        this.offersesByIdState = offersesByIdState;
    }
}
