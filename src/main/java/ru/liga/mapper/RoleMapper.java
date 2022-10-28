package ru.liga.mapper;

import org.mapstruct.Mapper;
import ru.liga.dto.RoleDto;
import ru.liga.dto.UserDto;
import ru.liga.entity.Role;
import ru.liga.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDto toDto(Role role);

    Role toEntity(RoleDto roleDto);

    List<RoleDto> toDtoList(List<Role> role);

    List<Role> toEntityList(List<RoleDto> roleDto);
}
