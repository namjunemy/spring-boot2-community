package com.community.domain;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Book {

    private Integer idx;
    private String title;
    private LocalDateTime publicedAt;

    @Builder
    public Book(String title, LocalDateTime publicedAt) {
        this.title = title;
        this.publicedAt = publicedAt;
    }
}
