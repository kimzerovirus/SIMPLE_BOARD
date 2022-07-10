package me.kzv.okvue.web.board.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.kzv.okvue.common.persistence.BaseEntity;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Qna extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;

    @Column(columnDefinition = "text")
    private String content;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Account account;

    // 추천수
    // 조회수
}
