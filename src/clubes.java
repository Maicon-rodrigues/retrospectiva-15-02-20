import java.util.*;


public class clubes {
    public static void main(String[] args) {

        List<String> melhoresTimesMundo = new ArrayList<>();
        melhoresTimesMundo.add("Liverpool"); // indice 0
        melhoresTimesMundo.add("Juventus"); // indice 1
        melhoresTimesMundo.add("XV de piracicaba"); //indice 2
        melhoresTimesMundo.add("Arsenlnal");


        System.out.print(melhoresTimesMundo);

        Collections.sort(melhoresTimesMundo);
        System.out.println("clube" + "melhoresTimesMundo");


    }
}
