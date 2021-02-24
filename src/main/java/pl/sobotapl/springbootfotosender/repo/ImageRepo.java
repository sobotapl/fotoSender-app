package pl.sobotapl.springbootfotosender.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sobotapl.springbootfotosender.model.Image;


@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {

}
