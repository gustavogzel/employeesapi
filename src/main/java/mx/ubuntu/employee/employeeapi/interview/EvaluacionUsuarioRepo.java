package mx.ubuntu.employee.employeeapi.interview;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface EvaluacionUsuarioRepo extends JpaRepository<EvaluacionUsuarioEntity, Long> {

    List<EvaluacionUsuarioEntity> findByEvaluacionId(Long idEvaluacion);

    @Query("select e from EvaluacionUsuarioEntity e where e.userId = :puserId "
    +"and  e.evaluacionId = :pevalId and  e.estatusEvaluacionId = :pestatusEvalId")
    List<EvaluacionUsuarioEntity> findByIds(
        @Param("puserId") Long puserId, 
        @Param("pevalId") Long pevalId, 
        @Param("pestatusEvalId") Long pestatusEvalId
        ,Sort sort);

}
