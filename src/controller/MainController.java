/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AffEquipementDao;
import entities.AffEquipement;
import helpper.MachineHelpper;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

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

    private List<AffEquipement> affEquipements;

    private MachineHelpper machineHelpper;
    private AffEquipementDao affEquipementDao = new AffEquipementDao();

    @FXML
    private void onClickActualiserCase(ActionEvent event) {

    }

    @FXML
    private void onClickAjouterCase(ActionEvent event) {
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        machineHelpper = new MachineHelpper(machineTable);
    }

}
