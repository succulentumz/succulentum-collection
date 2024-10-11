package com.example.demo.store.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "collections")
public class CollectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Boolean isShared;
    private Timestamp createdAt;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<FolderEntity> folders = new ArrayList<>();

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<UserCollectionEntity> userCollections = new ArrayList<>();

}
