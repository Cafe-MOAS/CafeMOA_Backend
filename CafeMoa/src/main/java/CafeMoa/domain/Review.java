package CafeMoa.domain;

import java.util.List;

import CafeMoa.domain.category.ReviewCategory;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "like_count")
    private int likeCount;

    @Column(name = "rating", nullable = false)
    private int rating;

    @OneToMany(mappedBy = "review")
    @Column(name = "category_list")
    private List<ReviewCategory> reviewcategoryList;

    @ManyToOne
    @JoinColumn(name = "cafe_id", nullable = false)
    private Cafe cafe;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member author;
}
