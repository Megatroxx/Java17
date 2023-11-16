import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIController {
    private GUIModel model;
    private GUIView view;

    public GUIController(GUIModel model, GUIView view) {
        this.model = model;
        this.view = view;
        view.addButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setData(view.getText());
                view.setText(model.getData());
            }
        });
    }
}
