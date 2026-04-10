package ud5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E1226 {
    public List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
        Collections.shuffle(lista);

        List<List<String>> grupos = new ArrayList<>();
        for (int i = 0; i < numGrupos; i++) {
            grupos.add(new ArrayList<>());
        }

        int indiceLista = 0;
        for (String alumno : lista) {
            grupos.get(indiceLista).add(alumno);
            indiceLista++;
            if (indiceLista == numGrupos) {    
                indiceLista = 0;            
            }
        }

        return grupos;
    }
}
