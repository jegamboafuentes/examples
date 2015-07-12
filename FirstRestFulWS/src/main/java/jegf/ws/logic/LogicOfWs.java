package jegf.ws.logic;

import jegf.ws.model.Model;
import org.springframework.stereotype.Repository;

@Repository
public class LogicOfWs {
        public Model retornoDeLogica(String nombre, String apellido){
            Model oModel = new Model();
            oModel.setNombre(nombre);
            oModel.setApellido(apellido);
            return oModel;
        }
}
