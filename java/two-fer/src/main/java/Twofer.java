import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (name == null){
            name = "you";
        }
        return "One for " + name + ", one for me.";
    }
}
