package songs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongsController {
	@GetMapping("get")
	public Artists getArtist(@RequestParam("id") int id) {
		
		Artists a = new Artists();
		List<Playlist> pl = new ArrayList<>();
		Playlist p1 = new Playlist();
		Playlist p2 = new Playlist();
		pl.add(p1);
		pl.add(p2);
		
		Songs song = new Songs(1, "sam", "dhruv", "link.com", "calm",
				"s.com",a, pl);
		List<Songs> songs= new ArrayList<>();
		songs.add(song);
		a.setId(111);
		a.setCover("cov");
		a.setName("sonu");
		a.setProfile("pro");
		a.setSongs(songs);
		System.out.println(a);
		
		return a;
		
	}
}
