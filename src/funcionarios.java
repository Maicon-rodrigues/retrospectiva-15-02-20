import java.util.Scanner;

import java.util.ArrayList;

public class funcionarios {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String[]funcionarios = new String[4];


        funcionarios[0] = "josé";
        funcionarios[1] = "josefa";
        funcionarios[2] = "jefferson";
        funcionarios[3] = "jroger";

        int contador = 4;
        for (String pessoas : funcionarios){
            contador++;
            System.out.println("funcionario" + ":" + pessoas);


            ArrayList<String> funcionario;
            funcionario = new ArrayList<>();
            System.out.println("remova um funcionario");
            String remove = ler.nextLine();

             funcionarios[0] = "josé";
             funcionarios[1] = "josefa";
             funcionarios[2] = "jefferson";
             funcionarios[3] = "jroger";


        }

    }
}
