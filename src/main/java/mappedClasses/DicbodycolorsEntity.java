package mappedClasses;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "dicbodycolors", schema = "", catalog = "usedcarsdealer")
public class DicbodycolorsEntity {
    private int idBodyColor;
    private String nameBodyColor;
    private Collection<LogbooksEntity> logbooksesByIdBodyColor;

    @Id
    @Column(name = "IdBodyColor")
    public int getIdBodyColor() {
        return idBodyColor;
    }

    public void setIdBodyColor(int idBodyColor) {
        this.idBodyColor = idBodyColor;
    }

    @Basic
    @Column(name = "NameBodyColor")
    public String getNameBodyColor() {
        return nameBodyColor;
    }

    public void setNameBodyColor(String nameBodyColor) {
        this.nameBodyColor = nameBodyColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DicbodycolorsEntity that = (DicbodycolorsEntity) o;

        if (idBodyColor != that.idBodyColor) return false;
        if (nameBodyColor != null ? !nameBodyColor.equals(that.nameBodyColor) : that.nameBodyColor != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBodyColor;
        result = 31 * result + (nameBodyColor != null ? nameBodyColor.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dicbodycolorsByIdBodyColor")
    public Collection<LogbooksEntity> getLogbooksesByIdBodyColor() {
        return logbooksesByIdBodyColor;
    }

    public void setLogbooksesByIdBodyColor(Collection<LogbooksEntity> logbooksesByIdBodyColor) {
        this.logbooksesByIdBodyColor = logbooksesByIdBodyColor;
    }
}
