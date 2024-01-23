package CafeMoa.domain.category;

import CafeMoa.domain.Review;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ReviewCategory {
    @Id
    @GeneratedValue
    @Column(name = "review_category_id")
    private Long reviewCategoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private Review review;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
