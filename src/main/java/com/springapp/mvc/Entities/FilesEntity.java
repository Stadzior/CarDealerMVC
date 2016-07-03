package com.springapp.mvc.Entities;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Kamil on 2016-05-16.
 */
@Entity
@Table(name = "files", schema = "", catalog = "usedcarsdealer")
public class FilesEntity {
    private int idFile;
    private byte[] data;

    @Id
    @Column(name = "IdFile")
    public int getIdFile() {
        return idFile;
    }

    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }

    @Basic
    @Column(name = "Data")
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilesEntity that = (FilesEntity) o;

        if (idFile != that.idFile) return false;
        if (!Arrays.equals(data, that.data)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFile;
        result = 31 * result + (data != null ? Arrays.hashCode(data) : 0);
        return result;
    }
}
