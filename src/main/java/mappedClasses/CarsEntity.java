package mappedClasses;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "cars", schema = "", catalog = "usedcarsdealer")
public class CarsEntity {
    private int idCar;
    private int idLogbook;
    private Integer idState;
    private Integer distanceDriven;
    private String listOfComponents;
    private Date dateOfInsuranceExpiration;
    private BigDecimal price;
    private Integer idDriveType;
    private String description;
    private DicdrivetypesEntity dicdrivetypesByIdDriveType;
    private LogbooksEntity logbooksByIdLogbook;
    private DicstatesEntity dicstatesByIdState;

    @Id
    @Column(name = "IdCar")
    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    @Basic
    @Column(name = "IdLogbook")
    public int getIdLogbook() {
        return idLogbook;
    }

    public void setIdLogbook(int idLogbook) {
        this.idLogbook = idLogbook;
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
    @Column(name = "ListOfComponents")
    public String getListOfComponents() {
        return listOfComponents;
    }

    public void setListOfComponents(String listOfComponents) {
        this.listOfComponents = listOfComponents;
    }

    @Basic
    @Column(name = "DateOfInsuranceExpiration")
    public Date getDateOfInsuranceExpiration() {
        return dateOfInsuranceExpiration;
    }

    public void setDateOfInsuranceExpiration(Date dateOfInsuranceExpiration) {
        this.dateOfInsuranceExpiration = dateOfInsuranceExpiration;
    }

    @Basic
    @Column(name = "Price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "IdDriveType")
    public Integer getIdDriveType() {
        return idDriveType;
    }

    public void setIdDriveType(Integer idDriveType) {
        this.idDriveType = idDriveType;
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

        CarsEntity that = (CarsEntity) o;

        if (idCar != that.idCar) return false;
        if (idLogbook != that.idLogbook) return false;
        if (dateOfInsuranceExpiration != null ? !dateOfInsuranceExpiration.equals(that.dateOfInsuranceExpiration) : that.dateOfInsuranceExpiration != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (distanceDriven != null ? !distanceDriven.equals(that.distanceDriven) : that.distanceDriven != null)
            return false;
        if (idDriveType != null ? !idDriveType.equals(that.idDriveType) : that.idDriveType != null) return false;
        if (idState != null ? !idState.equals(that.idState) : that.idState != null) return false;
        if (listOfComponents != null ? !listOfComponents.equals(that.listOfComponents) : that.listOfComponents != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCar;
        result = 31 * result + idLogbook;
        result = 31 * result + (idState != null ? idState.hashCode() : 0);
        result = 31 * result + (distanceDriven != null ? distanceDriven.hashCode() : 0);
        result = 31 * result + (listOfComponents != null ? listOfComponents.hashCode() : 0);
        result = 31 * result + (dateOfInsuranceExpiration != null ? dateOfInsuranceExpiration.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (idDriveType != null ? idDriveType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdDriveType", referencedColumnName = "IdDriveType")
    public DicdrivetypesEntity getDicdrivetypesByIdDriveType() {
        return dicdrivetypesByIdDriveType;
    }

    public void setDicdrivetypesByIdDriveType(DicdrivetypesEntity dicdrivetypesByIdDriveType) {
        this.dicdrivetypesByIdDriveType = dicdrivetypesByIdDriveType;
    }

    @ManyToOne
    @JoinColumn(name = "IdLogbook", referencedColumnName = "IdLogbook", nullable = false)
    public LogbooksEntity getLogbooksByIdLogbook() {
        return logbooksByIdLogbook;
    }

    public void setLogbooksByIdLogbook(LogbooksEntity logbooksByIdLogbook) {
        this.logbooksByIdLogbook = logbooksByIdLogbook;
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
