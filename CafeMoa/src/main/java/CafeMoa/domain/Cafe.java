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
@Table(name = "Cafes")

public class Cafe {
    //카페 식별자
    @Id
    @GeneratedValue
    @Column(name = "cafe_id")
    private Long id;

    //멤버 id
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    //카페 이름
    @Column(name = "cafe_mame", nullable = false, unique = true)
    private String cafeName;

    //카페 주소
    @Column(name = "cafe_address", nullable = false)
    private String cafeAddress;

    //오픈 시간
    @Column(name = "open_hour", nullable = false)
    private String openHour;

    //평점
    @Column(name = "rating")
    private Float rating;

    //찜 수
    @Column(name = "favorite_count")
    private Float favoriteCounts;

    //리뷰들
    @OneToMany(mappedBy = "cafe_id")
    private List<Cafe> reviewList;

    //카테고리 목록
    @OneToMany(mappedBy = "category_id")
    private List<Category> categoryList;
}
