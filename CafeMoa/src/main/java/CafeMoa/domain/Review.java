package CafeMoa.domain;

import java.util.List;
import CafeMoa.domain.category.ReviewCategory;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "like_count")
    private Integer likeCount;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @OneToMany(mappedBy = "review")
    @Column(name = "category_list")
    private List<ReviewCategory> reviewCategoryList;

    @ManyToOne
    @JoinColumn(name = "cafe_id", nullable = false)
    private Cafe cafe;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member author;
}
