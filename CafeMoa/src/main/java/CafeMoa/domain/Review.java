package CafeMoa.domain;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name ="Review_Entity")


public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "like_count", nullable = true)
    private int likeCount;

    @Column(name = "rating", nullable = false)
    private int rating;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    @Column(name = "category_list")
    private List<Category> categoryList;

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name = "cafe", nullable = false)
    private Cafe cafe;

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name = "author", nullable = false)
    private Member author;
}
