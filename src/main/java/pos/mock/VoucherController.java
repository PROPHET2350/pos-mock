package pos.mock;

import net.datafaker.Faker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voucher")
public class VoucherController {

    @PostMapping("/save")
    public ResponseEntity<?> save() {
        Faker faker = new Faker();
        Voucher voucher = new Voucher(1L,faker.code().isbn10());
        return new ResponseEntity<>(voucher, HttpStatus.UNAUTHORIZED);
    }
}
