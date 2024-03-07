package songs;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Playlist{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String posterLink;
	String genre;
	@ManyToMany
	List<Songs> songs;
	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Playlist(int id, String name, String posterLink, String genre, List<Songs> songs) {
		super();
		this.id = id;
		this.name = name;
		this.posterLink = posterLink;
		this.genre = genre;
		this.songs = songs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosterLink() {
		return posterLink;
	}
	public void setPosterLink(String posterLink) {
		this.posterLink = posterLink;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Songs> getSongs() {
		return songs;
	}
	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + ", posterLink=" + posterLink + ", genre=" + genre + ", songs="
				 + "]";
	}

	

}
