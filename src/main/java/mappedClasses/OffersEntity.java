package mappedClasses;

import javax.persistence.*;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "offers", schema = "", catalog = "usedcarsdealer")
public class OffersEntity {
    private int idOffer;
    private Integer price;
    private Integer yearOfProduction;
    private Integer idFuelType;
    private Integer idBrand;
    private Integer idState;
    private Integer distanceDriven;
    private Integer phoneNumber;
    private String description;
    private DicbrandsEntity dicbrandsByIdBrand;
    private DicfueltypesEntity dicfueltypesByIdFuelType;
    private DicstatesEntity dicstatesByIdState;

    @Id
    @Column(name = "IdOffer")
    public int getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(int idOffer) {
        this.idOffer = idOffer;
    }

    @Basic
    @Column(name = "Price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "YearOfProduction")
    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Basic
    @Column(name = "IdFuelType")
    public Integer getIdFuelType() {
        return idFuelType;
    }

    public void setIdFuelType(Integer idFuelType) {
        this.idFuelType = idFuelType;
    }

    @Basic
    @Column(name = "IdBrand")
    public Integer getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    @Basic
    @Column(name = "IdState")
    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

    @Basic
    @Column(name = "DistanceDriven")
    public Integer getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(Integer distanceDriven) {
        this.distanceDriven = distanceDriven;
    }

    @Basic
    @Column(name = "PhoneNumber")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
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

        OffersEntity that = (OffersEntity) o;

        if (idOffer != that.idOffer) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (distanceDriven != null ? !distanceDriven.equals(that.distanceDriven) : that.distanceDriven != null)
            return false;
        if (idBrand != null ? !idBrand.equals(that.idBrand) : that.idBrand != null) return false;
        if (idFuelType != null ? !idFuelType.equals(that.idFuelType) : that.idFuelType != null) return false;
        if (idState != null ? !idState.equals(that.idState) : that.idState != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (yearOfProduction != null ? !yearOfProduction.equals(that.yearOfProduction) : that.yearOfProduction != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOffer;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (yearOfProduction != null ? yearOfProduction.hashCode() : 0);
        result = 31 * result + (idFuelType != null ? idFuelType.hashCode() : 0);
        result = 31 * result + (idBrand != null ? idBrand.hashCode() : 0);
        result = 31 * result + (idState != null ? idState.hashCode() : 0);
        result = 31 * result + (distanceDriven != null ? distanceDriven.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdBrand", referencedColumnName = "IdBrand")
    public DicbrandsEntity getDicbrandsByIdBrand() {
        return dicbrandsByIdBrand;
    }

    public void setDicbrandsByIdBrand(DicbrandsEntity dicbrandsByIdBrand) {
        this.dicbrandsByIdBrand = dicbrandsByIdBrand;
    }

    @ManyToOne
    @JoinColumn(name = "IdFuelType", referencedColumnName = "IdFuelType")
    public DicfueltypesEntity getDicfueltypesByIdFuelType() {
        return dicfueltypesByIdFuelType;
    }

    public void setDicfueltypesByIdFuelType(DicfueltypesEntity dicfueltypesByIdFuelType) {
        this.dicfueltypesByIdFuelType = dicfueltypesByIdFuelType;
    }

    @ManyToOne
    @JoinColumn(name = "IdState", referencedColumnName = "IdState")
    public DicstatesEntity getDicstatesByIdState() {
        return dicstatesByIdState;
    }

    public void setDicstatesByIdState(DicstatesEntity dicstatesByIdState) {
        this.dicstatesByIdState = dicstatesByIdState;
    }
}
