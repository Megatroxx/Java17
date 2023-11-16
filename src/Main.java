public class Main {
    public static void main(String[] args) {
        GUIModel model = new GUIModel();
        GUIView view = new GUIView();
        GUIController controller = new GUIController(model, view);
        view.setVisible(true);
    }
}
