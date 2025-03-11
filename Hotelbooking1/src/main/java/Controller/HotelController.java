package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.HotelService;
import com.example.demo.entity.Hotel;

@RestController
@RequestMapping("api/users")
public class HotelController
{
private HotelService Hs;
@PostMapping
public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
{
	Hotel ho=Hs.createHotel(hotel);
	return new ResponseEntity<User>(saveHotel,HttpStatus.CREATED) ;
	}
}
