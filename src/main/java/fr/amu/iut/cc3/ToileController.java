package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {


    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private TextField comp;

    @FXML
    private TextField comp1;
    @FXML
    private TextField comp2;
    @FXML
    private TextField comp3;
    @FXML
    private TextField comp4;
    @FXML
    private TextField comp5;
    @FXML
    private TextField comp6;
    @FXML
    private Button traceBtn;
    @FXML
    private Button videBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe) {
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe - 1) * angleEnDegre)) * rayonCercleExterieur
                * (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe) {
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe - 1) * angleEnDegre)) * rayonCercleExterieur
                * (value / noteMaximale));
    }

    @FXML
    private void tracer(double value, int axe) {
            double value1 = Double.valueOf(comp1.getText());
            double value2 = Double.valueOf(comp2.getText());
            double value3 = Double.valueOf(comp3.getText());
            double value4 = Double.valueOf(comp4.getText());
            double value5 = Double.valueOf(comp5.getText());
            double value6 = Double.valueOf(comp6.getText());

            double x1 = getXRadarChart(value1, 1);
            double y1 = getYRadarChart(value1, 1);

            double x2 = getXRadarChart(value2, 2);
            double y2 = getYRadarChart(value2, 2);

            double x3 = getXRadarChart(value3, 3);
            double y3 = getYRadarChart(value3, 3);

            double x4 = getXRadarChart(value4, 4);
            double y4 = getYRadarChart(value4, 4);

            double x5 = getXRadarChart(value5, 5);
            double y5 = getYRadarChart(value5, 5);

            double x6 = getXRadarChart(value6, 6);
            double y6 = getYRadarChart(value6, 6);

            Circle circle1 = new Circle(x1, y1, 5);
            Circle circle2 = new Circle(x2, y2, 5);
            Circle circle3 = new Circle(x3, y3, 5);
            Circle circle4 = new Circle(x4, y4, 5);
            Circle circle5 = new Circle(x5, y5, 5);
            Circle circle6 = new Circle(x6, y6, 5);
        }


    }

