
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.StringsFr;
import static javafx.application.Application.launch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aimad.JAOUHAR
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/Main.fxml"));
        initializeStrings(fxmlLoader);

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initializeStrings(FXMLLoader fxmlLoader) {
        fxmlLoader.getNamespace().put("actualiserCase", StringsFr.BTN_TITLE_ACTUALISERCASE);
        fxmlLoader.getNamespace().put("ajouterCase", StringsFr.BTN_TITLE_AJOUTERCASE);
        fxmlLoader.getNamespace().put("ganttCase", StringsFr.BTN_TITLE_GANTTCASE);
        fxmlLoader.getNamespace().put("supprimerCase", StringsFr.BTN_TITLE_SUPPRIMERCASE);
        fxmlLoader.getNamespace().put("modifierCase", StringsFr.BTN_TITLE_MODIFIERCASE);
        fxmlLoader.getNamespace().put("affichGraph", StringsFr.BTN_TITLE_AFFICHGRAPH);
        fxmlLoader.getNamespace().put("actualiserMachine", StringsFr.BTN_TITLE_ACTUALISERMACHINE);
        fxmlLoader.getNamespace().put("ganttMachine", StringsFr.BTN_TITLE_GANTTMACHINE);
        fxmlLoader.getNamespace().put("ajouterPrelevement", StringsFr.BTN_TITLE_AJOUTERPRELEVEMENT);
    }
}
