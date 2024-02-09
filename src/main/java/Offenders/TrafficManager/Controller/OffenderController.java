package Offenders.TrafficManager.Controller;

import Offenders.TrafficManager.Service.implement.OffenderService;
import Offenders.TrafficManager.dto.RegisterDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/offenders")
public class OffenderController {
    private final OffenderService offenderService;

    public OffenderController(OffenderService offenderService) {
        this.offenderService = offenderService;
    }

    @PostMapping
    public ResponseEntity<RegisterDTO> createOffender(@RequestBody RegisterDTO registerDTO){
        RegisterDTO offender = offenderService.createOffender(registerDTO);
        return new ResponseEntity<>(offender, HttpStatus.CREATED);
    }
}
