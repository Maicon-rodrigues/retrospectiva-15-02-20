import pais.Pais;

import java.util.*;

public class exercicio1e2 {
    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<>();
        Random aleatorio = new Random();

        for(int contador = 1; contador<=10; contador++){
            idades.add(aleatorio.nextInt(99));
        }

        System.out.println("idades: " + idades);

    }
}
