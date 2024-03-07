package songs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Artists {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String cover;
	String profile;
	@OneToMany
	List<Songs> songs;
	
	
	public Artists() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artists(int id, String name, String cover, String profile, List<Songs> songs) {
		super();
		this.id = id;
		this.name = name;
		this.cover = cover;
		this.profile = profile;
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
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public List<Songs> getSongs() {
		return songs;
	}
	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "Artists [id=" + id + ", name=" + name + ", cover=" + cover + ", profile=" + profile + ", songs=" + songs
				+ "]";
	}
	
	
}