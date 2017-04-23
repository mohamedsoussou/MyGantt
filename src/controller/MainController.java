/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXDatePicker;
import dao.AffEquipementDao;
import entities.AffEquipement;
import helpper.MachineHelpper;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.Strings;

/**
 * FXML Controller class
 *
 * @author Aimad.JAOUHAR
 */
public class MainController implements Initializable {

    @FXML
    private Button btnActualiserCase;
    @FXML
    private Button btnAjouterCase;
    @FXML
    private Button btnGanttCase;
    @FXML
    private Button btnSupprimerCase;
    @FXML
    private Button btnModifierCase;
    @FXML
    private TableView<?> caseTable;
    @FXML
    private Button btnAjouterPrelevement;
    @FXML
    private Button btnAffichGraph;
    @FXML
    private ComboBox<?> comboQualite1;
    @FXML
    private ComboBox<?> comboQualite2;
    @FXML
    private ComboBox<?> comboQualite3;
    @FXML
    private LineChart<?, ?> chartEvolutionStock;
    @FXML
    private Button btnActualiserMachine;
    @FXML
    private Button btnGanttMachine;
    @FXML
    private TableView<AffEquipement> machineTable = new TableView<>();
    @FXML
    private ComboBox<?> comboTranche;
    @FXML
    private ComboBox<?> comboCasee;
    @FXML
    private ComboBox<?> comboNivBut;
    @FXML
    private TextField textIndice;
    @FXML
    private JFXDatePicker datePicker;
    @FXML
    private JFXDatePicker timePicker;
    @FXML
    private Button btnEnregistrer;
    @FXML
    private ComboBox<?> comboQualite;
    @FXML
    private TextField txtQuantite;
    @FXML
    private JFXDatePicker datePickerStock;
    @FXML
    private JFXDatePicker timePickerStock;
    @FXML
    private Button btnEnregistrerStock;

    private List<AffEquipement> affEquipements;

    private MachineHelpper machineHelpper;
    private AffEquipementDao affEquipementDao = new AffEquipementDao();

    @FXML
    private void onClickActualiserCase(ActionEvent event) {

    }

    @FXML
    private void onClickAjouterCase(ActionEvent event) throws IOException {
        showDialog(Strings.DIALOGUE_MESSAGE_TITLE);
    }

    @FXML
    private void onClickGanttCase(ActionEvent event) {
    }

    @FXML
    private void onClickSupprimerCase(ActionEvent event) {
    }

    @FXML
    private void onClickModifierCase(ActionEvent event) {
    }

    @FXML
    private void onClickAjouterPrelevement(ActionEvent event) {
    }

    @FXML
    private void onClickBtnAffichGraph(ActionEvent event) {
    }

    @FXML
    private void onSelectComboQualite1(ActionEvent event) {
    }

    @FXML
    private void onSelectComboQualite2(ActionEvent event) {
    }

    @FXML
    private void onSelectComboQualite3(ActionEvent event) {
    }

    @FXML
    private void onClickBtnActualiserMachine(ActionEvent event) {
        affEquipements = affEquipementDao.findAll();
        machineHelpper.setList(affEquipements);
    }

    @FXML
    private void onClickBtnGanttMachine(ActionEvent event) {
    }
    
    @FXML
    private void onClickBtnEnregistrerStock(ActionEvent event) {
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initTables();
        initAllButtons();
    }

    private void initAllButtons() {
        initButton(Strings.BTN_ICON_ACTUALISERCASE, Strings.BTN_TOOLTIP_ACTUALISERCASE, btnActualiserCase);
        initButton(Strings.BTN_ICON_ACTUALISERMACHINE, Strings.BTN_TOOLTIP_ACTUALISERMACHINE, btnActualiserMachine);
        initButton(Strings.BTN_ICON_AFFICHGRAPH, Strings.BTN_TOOLTIP_AFFICHGRAPH, btnAffichGraph);
        initButton(Strings.BTN_ICON_AJOUTERCASE, Strings.BTN_TOOLTIP_AJOUTERCASE, btnAjouterCase);
        initButton(Strings.BTN_ICON_AJOUTERPRELEVEMENT, Strings.BTN_TOOLTIP_AJOUTERPRELEVEMENT, btnAjouterPrelevement);
        initButton(Strings.BTN_ICON_ENREGISTRER, Strings.BTN_TOOLTIP_ENREGISTRER, btnEnregistrer);
        initButton(Strings.BTN_ICON_GANTTCASE, Strings.BTN_TOOLTIP_GANTTCASE, btnGanttCase);
        initButton(Strings.BTN_ICON_GANTTMACHINE, Strings.BTN_TOOLTIP_GANTTMACHINE, btnGanttMachine);
        initButton(Strings.BTN_ICON_MODIFIERCASE, Strings.BTN_TOOLTIP_MODIFIERCASE, btnModifierCase);
        initButton(Strings.BTN_ICON_SUPPRIMERCASE, Strings.BTN_TOOLTIP_SUPPRIMERCASE, btnSupprimerCase);
    }

    private void initButton(String icon, String toolTip, Button btn) {
        btn = new Button();
        btn.setTooltip(new Tooltip(toolTip));
    }

    private void initTables() {
        machineHelpper = new MachineHelpper(machineTable);
    }

    private void showDialog(String message) throws IOException {
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Fenetre1.fxml"));
        final Parent root = loader.load();
        final Scene scene = new Scene(root, 300, 250);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
