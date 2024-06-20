package mx.ubuntu.employee.employeeapi.interview;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionService {

    private final EvaluacionUsuarioRepo evaluacionUsuarioRepo;

    public EvaluacionService(EvaluacionUsuarioRepo evaluacionUsuarioRepo) {
        this.evaluacionUsuarioRepo = evaluacionUsuarioRepo;
    }

    public List<EvaluacionUsuarioEntity> getAll() {
        return evaluacionUsuarioRepo.findAll();
    }

    public List<EvaluacionUsuarioEntity> getAllParams(Long puserId, Long pevalId, Long pestatusEvalId) {
        return evaluacionUsuarioRepo.findByIds(puserId, 
                                                pevalId, 
                                                pestatusEvalId,
                                                Sort.by(Sort.Direction.ASC, "title"));
    }

}
