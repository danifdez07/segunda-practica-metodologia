import BloqueB.persona;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        persona p = new persona("Antonio Moratilla", 97);
        String json = gson.toJson(p);
        System.out.println(json);
    }
}
