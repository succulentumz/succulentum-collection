package com.example.demo.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_collections")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCollectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private CollectionEntity collection;

}
