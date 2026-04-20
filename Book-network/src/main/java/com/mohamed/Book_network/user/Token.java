package com.mohamed.Book_network.user;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity

public class Token {


    @Id
    @Generated
    private Integer id ;

    private String token;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private LocalDateTime validatedAt;

}
