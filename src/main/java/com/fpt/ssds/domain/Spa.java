package com.fpt.ssds.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

/**
 * A Spa.
 */
@Entity
@Table(name = "spa")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Spa extends AbstractAuditingEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "hotline")
    private String hotline;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "address")
    private String address;
}
