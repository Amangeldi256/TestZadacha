package com.example.TestZadacha.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "textOne", uniqueConstraints = {@UniqueConstraint(name = "tek_name", columnNames = "name")})
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "text_gener")
    @SequenceGenerator(name = "text_gener", sequenceName = "text_sequence_name", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

}
