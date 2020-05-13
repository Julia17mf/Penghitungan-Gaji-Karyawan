import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetunjukController {
    PetunjukView petunjukView;

    public PetunjukController(PetunjukView petunjukView) {
        this.petunjukView = petunjukView;

        petunjukView.home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMVC();
                petunjukView.setVisible(false);
            }
        });
    }
}
