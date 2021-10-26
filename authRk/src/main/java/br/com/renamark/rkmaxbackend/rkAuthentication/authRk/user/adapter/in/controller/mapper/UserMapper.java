package br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.in.controller.mapper;


import br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.in.controller.response.AuthResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    //AuthResponseDTO domainToResponse(UserVO userVO);


}


// https://mapstruct.org/documentation/stable/api/org/mapstruct/Mapper.html
// https://www.tabnine.com/code/java/methods/org.mapstruct.factory.Mappers/getMapper
// https://caiosantesso.dev/livro-de-receitas-mapstruct/

