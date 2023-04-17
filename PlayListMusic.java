import java.util.ArrayList;
public class PlayListMusic {
    public static void main(String[] args){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("I wish you roses");
        listaParaIlhaDeserta.add("Upgrade U");
        listaParaIlhaDeserta.add("Damage");
        listaParaIlhaDeserta.add("Remind ne");
        listaParaIlhaDeserta.add("Thriller");
        listaParaIlhaDeserta.add("People");
        listaParaIlhaDeserta.add("Talk 2 u");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());

        listaParaIlhaDeserta.remove("Remind ne");
        listaParaIlhaDeserta.remove("Thriller");
        listaParaIlhaDeserta.remove("People");
        listaParaIlhaDeserta.remove("Talk 2 u");
        System.out.println(listaParaIlhaDeserta.size());

        int a = 2;
        int b = 1;

        String temp = listaParaIlhaDeserta.get(a);

        listaParaIlhaDeserta.set (a, listaParaIlhaDeserta.get(b));
        listaParaIlhaDeserta.set(b,temp);
        System.out.println(listaParaIlhaDeserta);
    }
}