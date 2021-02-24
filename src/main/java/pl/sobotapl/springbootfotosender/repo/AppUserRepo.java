package pl.sobotapl.springbootfotosender.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sobotapl.springbootfotosender.model.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository <AppUser, Long> {

    AppUser findByUsername(String username);

}
