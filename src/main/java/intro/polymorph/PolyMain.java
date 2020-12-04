package intro.polymorph;

public class PolyMain {

    public static void main(String[] args) {
        execute(new Button());
        execute(new CheckBox());
    }

    public static void execute(UIElement element) {
        element.draw();
    }
}
