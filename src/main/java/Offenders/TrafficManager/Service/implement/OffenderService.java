package Offenders.TrafficManager.Service.implement;

import Offenders.TrafficManager.Model.People;
import Offenders.TrafficManager.Repository.OffenderRepository;
import Offenders.TrafficManager.Service.Offenders;
import Offenders.TrafficManager.dto.RegisterDTO;
import org.springframework.stereotype.Service;

@Service
public class OffenderService implements Offenders {
    private OffenderRepository offenderRepository;

    public OffenderService(OffenderRepository offenderRepository) {
        this.offenderRepository = offenderRepository;
    }

    @Override
    public RegisterDTO createOffender(RegisterDTO registerDTO) {
        People offender =  new People();
        offender.setFirstName(registerDTO.getFirstName());
        offender.setLastName(registerDTO.getLastName());
        offender.setGender(registerDTO.getGender());
        offender.setAge(registerDTO.getAge());
        People save = offenderRepository.save(offender);

        RegisterDTO register = new RegisterDTO();
        register.setFirstName(save.getFirstName());
        register.setLastName(save.getLastName());
        register.setGender(save.getGender());
        register.setAge(save.getAge());
        return register;




    }
}
