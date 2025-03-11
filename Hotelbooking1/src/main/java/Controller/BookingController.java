package Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BookingService;
import com.example.demo.entity.Booking;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
  
  @Autowired
  private BookingService bookingService;
  
  @GetMapping
  public ResponseEntity<List<Booking>> getAllBookings() {
    List<Booking> bookings = BookingService.getAllBooking();
    return ResponseEntity.ok(bookings);
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
    Booking booking = bookingService.getBookingById(id);
    if (booking == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(booking);
  }
  
  @PostMapping
  public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
    Booking newBooking = bookingService.createBooking(booking);
    return ResponseEntity.status(HttpStatus.CREATED).body(newBooking);
  }
  
  @PutMapping("/{id}")
  public ResponseEntity<Booking> updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
    Booking updatedBooking = bookingService.updateBooking(booking);
    if (updatedBooking == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(updatedBooking);
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
    bookingService.deleteBooking(id);
    return ResponseEntity.noContent().build();
  }
}

