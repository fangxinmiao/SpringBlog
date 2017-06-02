package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * A generic setting model
 *
 * @author Raysmond
 */
@Entity
@Table(name = "settings")
@Getter
@Setter
public class Setting extends BaseModel {
    @Column(length = 32, name = "property", unique = true, nullable = false)
    private String key;

    @Lob
    @Column(name = "val")
    private Serializable value;
}
