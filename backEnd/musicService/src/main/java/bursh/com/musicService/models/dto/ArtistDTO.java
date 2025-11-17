package bursh.com.musicService.models.dto;

import java.util.List;

import bursh.com.musicService.models.entities.Track;
import lombok.Data;

@Data
public class ArtistDTO {
    private int id;
    private String nickName;
    private List<Track> tracks;
}
