package br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.out.database.entity;


import br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.out.database.entity.pk.PkUser;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user", schema = "rkauth")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PkUser userPk;

    @Column(name = "user_name", nullable = false)
    private String userName;

    public PkUser getUserPk() {
        return userPk;
    }

    public void setUserPk(PkUser userPk) {
        this.userPk = userPk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
