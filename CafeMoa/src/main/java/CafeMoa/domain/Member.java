package CafeMoa.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;

    @OneToMany(mappedBy = "member")
    private List<Cafe> favoriteCafeList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Review> likeReviewList = new ArrayList<>();
}
