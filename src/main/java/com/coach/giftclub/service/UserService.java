package com.coach.giftclub.service;

import com.coach.giftclub.domain.user.UserRepository;
import com.coach.giftclub.web.dto.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void save(UserSaveRequestDto userSaveRequestDto) {
        userRepository.save(userSaveRequestDto.toEntity());
    }
}
