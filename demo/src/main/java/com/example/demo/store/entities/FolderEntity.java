package com.example.demo.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FolderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private CollectionEntity collection;

    @OneToMany(mappedBy = "folder", cascade = CascadeType.ALL)
    private List<PlantEntity> plants = new ArrayList<>();
}
