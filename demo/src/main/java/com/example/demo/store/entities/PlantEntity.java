package com.example.demo.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "plants")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlantEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private Timestamp addedAt;
    private Timestamp removedAt;
    private Boolean isDead;
    private String deathLocation;
    private String deathCause;
    private Timestamp deathTime;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private FolderEntity folder;

    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
    private List<PlantTagEntity> plantTags = new ArrayList<>();
}
