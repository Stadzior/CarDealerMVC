package mappedClasses;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "logbooks", schema = "", catalog = "usedcarsdealer")
public class LogbooksEntity {
    private int idLogbook;
    private Integer idCar;
    private String numberLogbook;
    private String vin;
    private String numberPlate;
    private Integer idCarType;
    private Integer idModel;
    private Integer idBodyColor;
    private Integer idBodyType;
    private Integer idEngine;
    private Integer idFuelType;
    private Integer idGearBox;
    private Date dateOfServicingExpiration;
    private Integer amountOfSeats;
    private Integer amountOfDoors;
    private Integer yearOfProduction;
    private Collection<CarsEntity> carsesByIdLogbook;
    private DicbodycolorsEntity dicbodycolorsByIdBodyColor;
    private DicbodytypesEntity dicbodytypesByIdBodyType;
    private DiccartypesEntity diccartypesByIdCarType;
    private EnginesEntity enginesByIdEngine;
    private GearboxesEntity gearboxesByIdGearBox;
    private ModelsEntity modelsByIdModel;
    private DicfueltypesEntity dicfueltypesByIdFuelType;

    @Id
    @Column(name = "IdLogbook")
    public int getIdLogbook() {
        return idLogbook;
    }

    public void setIdLogbook(int idLogbook) {
        this.idLogbook = idLogbook;
    }

    @Basic
    @Column(name = "IdCar")
    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    @Basic
    @Column(name = "NumberLogbook")
    public String getNumberLogbook() {
        return numberLogbook;
    }

    public void setNumberLogbook(String numberLogbook) {
        this.numberLogbook = numberLogbook;
    }

    @Basic
    @Column(name = "VIN")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Basic
    @Column(name = "NumberPlate")
    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

//    @Basic
//    @Column(name = "IdCarType")
//    public Integer getIdCarType() {
//        return idCarType;
//    }
//
//    public void setIdCarType(Integer idCarType) {
//        this.idCarType = idCarType;
//    }
//
//    @Basic
//    @Column(name = "IdModel")
//    public Integer getIdModel() {
//        return idModel;
//    }
//
//    public void setIdModel(Integer idModel) {
//        this.idModel = idModel;
//    }

//    @Basic
//    @Column(name = "IdBodyColor")
//    public Integer getIdBodyColor() {
//        return idBodyColor;
//    }
//
//    public void setIdBodyColor(Integer idBodyColor) {
//        this.idBodyColor = idBodyColor;
//    }
//
//    @Basic
//    @Column(name = "IdBodyType")
//    public Integer getIdBodyType() {
//        return idBodyType;
//    }
//
//    public void setIdBodyType(Integer idBodyType) {
//        this.idBodyType = idBodyType;
//    }
//
//    @Basic
//    @Column(name = "IdEngine")
//    public Integer getIdEngine() {
//        return idEngine;
//    }
//
//    public void setIdEngine(Integer idEngine) {
//        this.idEngine = idEngine;
//    }
//
//    @Basic
//    @Column(name = "IdFuelType")
//    public Integer getIdFuelType() {
//        return idFuelType;
//    }
//
//    public void setIdFuelType(Integer idFuelType) {
//        this.idFuelType = idFuelType;
//    }
//
//    @Basic
//    @Column(name = "IdGearBox")
//    public Integer getIdGearBox() {
//        return idGearBox;
//    }
//
//    public void setIdGearBox(Integer idGearBox) {
//        this.idGearBox = idGearBox;
//    }

    @Basic
    @Column(name = "DateOfServicingExpiration")
    public Date getDateOfServicingExpiration() {
        return dateOfServicingExpiration;
    }

    public void setDateOfServicingExpiration(Date dateOfServicingExpiration) {
        this.dateOfServicingExpiration = dateOfServicingExpiration;
    }

    @Basic
    @Column(name = "AmountOfSeats")
    public Integer getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(Integer amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    @Basic
    @Column(name = "AmountOfDoors")
    public Integer getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(Integer amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    @Basic
    @Column(name = "YearOfProduction")
    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogbooksEntity that = (LogbooksEntity) o;

        if (idLogbook != that.idLogbook) return false;
        if (amountOfDoors != null ? !amountOfDoors.equals(that.amountOfDoors) : that.amountOfDoors != null)
            return false;
        if (amountOfSeats != null ? !amountOfSeats.equals(that.amountOfSeats) : that.amountOfSeats != null)
            return false;
        if (dateOfServicingExpiration != null ? !dateOfServicingExpiration.equals(that.dateOfServicingExpiration) : that.dateOfServicingExpiration != null)
            return false;
        if (idBodyColor != null ? !idBodyColor.equals(that.idBodyColor) : that.idBodyColor != null) return false;
        if (idBodyType != null ? !idBodyType.equals(that.idBodyType) : that.idBodyType != null) return false;
        if (idCar != null ? !idCar.equals(that.idCar) : that.idCar != null) return false;
        if (idCarType != null ? !idCarType.equals(that.idCarType) : that.idCarType != null) return false;
        if (idEngine != null ? !idEngine.equals(that.idEngine) : that.idEngine != null) return false;
        if (idFuelType != null ? !idFuelType.equals(that.idFuelType) : that.idFuelType != null) return false;
        if (idGearBox != null ? !idGearBox.equals(that.idGearBox) : that.idGearBox != null) return false;
        if (idModel != null ? !idModel.equals(that.idModel) : that.idModel != null) return false;
        if (numberLogbook != null ? !numberLogbook.equals(that.numberLogbook) : that.numberLogbook != null)
            return false;
        if (numberPlate != null ? !numberPlate.equals(that.numberPlate) : that.numberPlate != null) return false;
        if (vin != null ? !vin.equals(that.vin) : that.vin != null) return false;
        if (yearOfProduction != null ? !yearOfProduction.equals(that.yearOfProduction) : that.yearOfProduction != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLogbook;
        result = 31 * result + (idCar != null ? idCar.hashCode() : 0);
        result = 31 * result + (numberLogbook != null ? numberLogbook.hashCode() : 0);
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        result = 31 * result + (numberPlate != null ? numberPlate.hashCode() : 0);
        result = 31 * result + (idCarType != null ? idCarType.hashCode() : 0);
        result = 31 * result + (idModel != null ? idModel.hashCode() : 0);
        result = 31 * result + (idBodyColor != null ? idBodyColor.hashCode() : 0);
        result = 31 * result + (idBodyType != null ? idBodyType.hashCode() : 0);
        result = 31 * result + (idEngine != null ? idEngine.hashCode() : 0);
        result = 31 * result + (idFuelType != null ? idFuelType.hashCode() : 0);
        result = 31 * result + (idGearBox != null ? idGearBox.hashCode() : 0);
        result = 31 * result + (dateOfServicingExpiration != null ? dateOfServicingExpiration.hashCode() : 0);
        result = 31 * result + (amountOfSeats != null ? amountOfSeats.hashCode() : 0);
        result = 31 * result + (amountOfDoors != null ? amountOfDoors.hashCode() : 0);
        result = 31 * result + (yearOfProduction != null ? yearOfProduction.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "logbooksByIdLogbook")
    public Collection<CarsEntity> getCarsesByIdLogbook() {
        return carsesByIdLogbook;
    }

    public void setCarsesByIdLogbook(Collection<CarsEntity> carsesByIdLogbook) {
        this.carsesByIdLogbook = carsesByIdLogbook;
    }

    @ManyToOne
    @JoinColumn(name = "IdBodyColor", referencedColumnName = "IdBodyColor")
    public DicbodycolorsEntity getDicbodycolorsByIdBodyColor() {
        return dicbodycolorsByIdBodyColor;
    }

    public void setDicbodycolorsByIdBodyColor(DicbodycolorsEntity dicbodycolorsByIdBodyColor) {
        this.dicbodycolorsByIdBodyColor = dicbodycolorsByIdBodyColor;
    }

    @ManyToOne
    @JoinColumn(name = "IdBodyType", referencedColumnName = "IdBodyType")
    public DicbodytypesEntity getDicbodytypesByIdBodyType() {
        return dicbodytypesByIdBodyType;
    }

    public void setDicbodytypesByIdBodyType(DicbodytypesEntity dicbodytypesByIdBodyType) {
        this.dicbodytypesByIdBodyType = dicbodytypesByIdBodyType;
    }

    @ManyToOne
    @JoinColumn(name = "IdCarType", referencedColumnName = "IdCarType")
    public DiccartypesEntity getDiccartypesByIdCarType() {
        return diccartypesByIdCarType;
    }

    public void setDiccartypesByIdCarType(DiccartypesEntity diccartypesByIdCarType) {
        this.diccartypesByIdCarType = diccartypesByIdCarType;
    }

    @ManyToOne
    @JoinColumn(name = "IdEngine", referencedColumnName = "IdEngine")
    public EnginesEntity getEnginesByIdEngine() {
        return enginesByIdEngine;
    }

    public void setEnginesByIdEngine(EnginesEntity enginesByIdEngine) {
        this.enginesByIdEngine = enginesByIdEngine;
    }

    @ManyToOne
    @JoinColumn(name = "IdGearBox", referencedColumnName = "IdGearBox")
    public GearboxesEntity getGearboxesByIdGearBox() {
        return gearboxesByIdGearBox;
    }

    public void setGearboxesByIdGearBox(GearboxesEntity gearboxesByIdGearBox) {
        this.gearboxesByIdGearBox = gearboxesByIdGearBox;
    }

    @ManyToOne
    @JoinColumn(name = "IdModel", referencedColumnName = "IdModel")
    public ModelsEntity getModelsByIdModel() {
        return modelsByIdModel;
    }

    public void setModelsByIdModel(ModelsEntity modelsByIdModel) {
        this.modelsByIdModel = modelsByIdModel;
    }

    @ManyToOne
    @JoinColumn(name = "IdFuelType", referencedColumnName = "IdFuelType")
    public DicfueltypesEntity getDicfueltypesByIdFuelType() {
        return dicfueltypesByIdFuelType;
    }

    public void setDicfueltypesByIdFuelType(DicfueltypesEntity dicfueltypesByIdFuelType) {
        this.dicfueltypesByIdFuelType = dicfueltypesByIdFuelType;
    }
}
