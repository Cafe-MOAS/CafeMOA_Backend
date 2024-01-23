package CafeMoa.domain.category;

import CafeMoa.domain.Cafe;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class CafeCategory {
    @Id
    @GeneratedValue
    @Column(name = "cafe_category_id")
    private Long cafeCategoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
