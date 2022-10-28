package ru.liga.service.api;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.liga.dto.UserDto;
import ru.liga.entity.User;

import java.util.List;

public interface UserServise extends UserDetailsService {
    void save(User user);

    User findByUsername(String username);

    List<UserDto> getUsers();

    boolean deleteUser(Long userId);
}
