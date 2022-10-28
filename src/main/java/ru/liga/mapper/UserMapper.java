package ru.liga.mapper;

import org.mapstruct.Mapper;
import ru.liga.dto.UserDto;
import ru.liga.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

    List<UserDto> toDtoList(List<User> user);

    List<User> toEntityList(List<UserDto> userDto);
}
