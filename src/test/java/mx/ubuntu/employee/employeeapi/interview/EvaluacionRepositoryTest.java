package mx.ubuntu.employee.employeeapi.interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Sort;


@DataJpaTest(showSql = true)
public class EvaluacionRepositoryTest {

    @Autowired
    private EvaluacionUsuarioRepo evaluacionUsuarioRepo;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void Test() {        
        evaluacionUsuarioRepo.findByIds(1L, 2L, 3L,Sort.by(Sort.Direction.ASC, "id"));

        /*
        
        Hibernate: select eue1_0.id,eue1_0.estatus_evaluacion_id,eue1_0.evaluacion_id,eue1_0.fd_fecha_creacio
        n,eue1_0.fd_fecha_fin,eue1_0.fd_fecha_inicio,eue1_0.fd_fecha_modificacion,eue1_0.fi_a
        ctiva,eue1_0.fi_admin_creacion,eue1_0.fi_admin_modificacion,eue1_0.fi_aprobada,eue1_
        0.fi_calificacion,eue1_0.fi_intentos_extra,eue1_0.fi_num_intento,eue1_0.fi_resultado,eue1
        _0.user_id from evaluacion_usuario_entity eue1_0 where eue1_0.user_id=? and
        eue1_0.evaluacion_id=? and eue1_0.estatus_evaluacion_id=? order by eue1_0.id               
         
         */
    }

}
