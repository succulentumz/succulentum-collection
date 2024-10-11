package com.example.demo.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "plant_tags")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlantTagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private PlantEntity plant;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private TagEntity tag;

}
