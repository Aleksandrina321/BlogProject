package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Role;

public interface RoleRepositiry extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
