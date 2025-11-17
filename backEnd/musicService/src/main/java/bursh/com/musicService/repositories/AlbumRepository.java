package bursh.com.musicService.repositories;

import bursh.com.musicService.models.entities.Album;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Optional<Album> findByTitle(String title);
    List<Album> findByUsername(String username);
}
