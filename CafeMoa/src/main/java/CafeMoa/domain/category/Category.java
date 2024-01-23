package CafeMoa.domain.category;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long categoryId;

    private String tagTitle; // 태그 이름;

    @OneToMany(mappedBy = "category")
    private List<CafeCategory> cafeCategoryList = new ArrayList<>(); // category 를 가지고 있는 카페 목록

    @OneToMany(mappedBy = "category")
    private List<ReviewCategory> reviewCategoryList = new ArrayList<>(); // category 를 가지고 있는 리뷰 목록

}
