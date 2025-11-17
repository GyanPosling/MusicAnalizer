package bursh.com.musicService.models.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "albums")
@Data
public class Album {
    @Id
    private int id;

    @Column(name = "title")
    private String title;  
    
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Track> tracks;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
