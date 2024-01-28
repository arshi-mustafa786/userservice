package dev.deepak.userservicetestfinal.secutiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.deepak.userservicetestfinal.models.Role;
import dev.deepak.userservicetestfinal.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.jackson.JsonMixin;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize( as = CustomGrantedAuthority.class)
public class CustomGrantedAuthority implements GrantedAuthority {

    private Role role;
    @Override
    @JsonIgnore
    public String getAuthority() {
        return role.getRole();
    }
}
