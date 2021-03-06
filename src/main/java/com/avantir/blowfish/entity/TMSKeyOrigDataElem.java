package com.avantir.blowfish.entity;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lekanomotayo on 01/01/2018.
 */

@Entity
@DynamicInsert
@Table(name = "tbl_tms_key_original_data_elements")
@SuppressWarnings("serial")
public class TMSKeyOrigDataElem extends BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long tmsKeyOrigDataElemId;
    @Column(name = "original_data_element", nullable = false, unique = true)
    private String originalDataElement;

    public TMSKeyOrigDataElem(){

    }

    public Long getTmsKeyOrigDataElemId() {
        return tmsKeyOrigDataElemId;
    }

    public void setTmsKeyOrigDataElemId(Long tmsKeyOrigDataElemId) {
        this.tmsKeyOrigDataElemId = tmsKeyOrigDataElemId;
    }

    public String getOriginalDataElement() {
        return originalDataElement;
    }

    public void setOriginalDataElement(String originalDataElement) {
        this.originalDataElement = originalDataElement;
    }
}
