package bursh.com.musicService.models.dto;

import java.util.List;

import bursh.com.musicService.models.entities.Track;
import bursh.com.musicService.models.entities.User;
import lombok.Data;

@Data
public class AlbumDTO {
    private int id;
    private String title;
    private List<Track> tracks;
    private User user;
}
