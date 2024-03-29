package CafeMoa.domain;

import CafeMoa.domain.category.CafeCategory;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Cafe {
    //카페 식별자
    @Id
    @GeneratedValue
    @Column(name = "cafe_id")
    private Long cafeId;

    //멤버 id
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    //카페 이름
    @Column(name = "name", nullable = false)
    private String cafeName;

    //카페 주소
    @Column(name = "address", nullable = false)
    private String cafeAddress;

    //오픈 시간
    @Column(name = "open_hour", nullable = false)
    private String openHour;

    //평점
    @Column(name = "rating")
    private Float rating;

    //찜 수
    @Column(name = "favorite_count")
    private Integer favoriteCounts;

    //리뷰 목록
    @OneToMany(mappedBy = "cafe")
    private List<Review> reviewList;

    //카테고리 목록
    @OneToMany(mappedBy = "cafe")
    private List<CafeCategory> cafeCategoryList;
}