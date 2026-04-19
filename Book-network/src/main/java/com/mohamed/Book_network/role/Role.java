package com.mohamed.Book_network.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mohamed.Book_network.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Role {


    @Id
    @Generated
    private Integer id;

    @Column(unique = true)
    private String name;


    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private List<User> users;

    @Generated
    @Column(nullable = false, updatable = false)
    private LocalDate createdDate ;
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDate lastModified ;
}
