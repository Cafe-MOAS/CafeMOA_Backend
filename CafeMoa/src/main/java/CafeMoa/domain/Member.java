package CafeMoa.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Members")
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

    @OneToMany(mappedBy = "member_id")
    private List<Cafe> favoriteCafeList;

    @OneToMany(mappedBy = "member_id")
    private List<Review> reviewList;

    @OneToMany(mappedBy = "member_id2")
    private List<Review> likeReviewList;
}
