package com.example.fullstack.dto.member;

import com.example.fullstack.entity.member.MemberEntity;
import com.example.fullstack.role.UserRole;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자를 자동으로 만들어준다.
@AllArgsConstructor
@ToString
@Builder
public class MemberDTO {

    private int userNo;
    private String userId;
    private String userPwd;
    private String userName;
    private String userNickname;
    private int userAge;
    private String userGender;
    private String userTel;
    private String userAddress;
    private UserRole userRole;
    private LocalDateTime userCreated;
    private LocalDateTime userUpdated;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        return MemberDTO.builder()
                .userNo(memberEntity.getUserNo())
                .userId(memberEntity.getUserId())
                .userPwd(memberEntity.getUserPwd())
                .userName(memberEntity.getUserName())
                .userNickname(memberEntity.getUserNickname())
                .userAge(memberEntity.getUserAge())
                .userGender(memberEntity.getUserGender())
                .userTel(memberEntity.getUserTel())
                .userAddress(memberEntity.getUserAddress())
                .userRole(memberEntity.getUserRole())
                .userCreated(memberEntity.getUserCreated())
                .userUpdated(memberEntity.getUserUpdated())
                .build();
    }
}
