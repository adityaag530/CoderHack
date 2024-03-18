package com.crio.coderhack.entity;

import lombok.Data;

import java.util.List;
import java.util.Set;

/*
 * @author adityagupta
 * @date 18/03/24
 */
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String userId; // Unique Identifier

    private String username;

    private int score;

    private Set<Badge> badges = new HashSet<>(); // Using a Set to ensure uniqueness

    public User(String username) {
        this.username = username;
        this.score = 0;
    }

    public void updateBadges() {
        badges.clear(); // Clear existing badges

        if (score >= 1 && score <= 30) {
            badges.add(Badge.CODE_NINJA);
        } else if (score >= 31 && score <= 60) {
            badges.add(Badge.CODE_CHAMP);
        } else if (score >= 61 && score <= 100) {
            badges.add(Badge.CODE_MASTER);
        }
    }
}
