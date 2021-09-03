package com.coach.giftclub.web.dto;

import com.coach.giftclub.domain.user.Role;
import com.coach.giftclub.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private String userName;
    private String userEmail;
    private String userPassword;
    private Role role;

    @Builder
    public UserSaveRequestDto(String userName, String userEmail, String userPassword, Role role){
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.role = role;
    }

    public User toEntity(){
        return User.builder()
                .userName(userName)
                .userEmail(userEmail)
                .userPassword(userPassword)
                .role(role)
                .build();
    }
}
