package br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.out.database.repository;

import br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.out.database.entity.UserEntity;
import br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.out.database.entity.pk.PkUser;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepository extends JpaRepository<UserEntity, PkUser> {

    List<UserEntity> findByUserPkUserId (UUID userId);

}

//https://stackoverflow.com/questions/10649691/using-embeddedid-with-jparepository
