package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import static java.lang.String.valueOf;

public class Controller {
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Field field;

    public Controller() {
        field = new Field();

    }

    public void initialize() {
        Tile[][] arrTiles = field.getTiles();
        btn0.setText(valueOf(arrTiles[0][0].getValue()));
        btn1.setText(valueOf(arrTiles[0][1].getValue()));
        btn2.setText(valueOf(arrTiles[1][0].getValue()));
        btn3.setText(valueOf(arrTiles[1][1].getValue()));
    }

    public void clickBtn0(ActionEvent event) {
        Tile[][] arrTiles = field.getTiles();

        btn0.setText(valueOf(arrTiles[0][0].getValue() - 1));
        if (Integer.parseInt(btn0.getText()) < 0) {
            btn0.setText("0");
        } else {
            btn1.setText(valueOf(arrTiles[0][1].getValue() + 1));
            btn2.setText(valueOf(arrTiles[1][0].getValue() + 1));

            arrTiles[0][0].setValue(Integer.parseInt(btn0.getText()));
            arrTiles[0][1].setValue(Integer.parseInt(btn1.getText()));
            arrTiles[1][0].setValue(Integer.parseInt(btn2.getText()));
        }
    }

    public void clickBtn1(ActionEvent event) {
        Tile[][] arrTiles = field.getTiles();

        btn1.setText(valueOf(arrTiles[0][1].getValue() - 1));
        if (Integer.parseInt(btn1.getText()) < 0) {
            btn1.setText("0");
        } else {
            btn0.setText(valueOf(arrTiles[0][0].getValue() + 1));
            btn3.setText(valueOf(arrTiles[1][1].getValue() + 1));

            arrTiles[0][1].setValue(Integer.parseInt(btn1.getText()));
            arrTiles[0][0].setValue(Integer.parseInt(btn0.getText()));
            arrTiles[1][1].setValue(Integer.parseInt(btn3.getText()));
        }
    }

    public void clickBtn2(ActionEvent event) {
        Tile[][] arrTiles = field.getTiles();

        btn2.setText(valueOf(arrTiles[1][0].getValue() - 1));
        if (Integer.parseInt(btn2.getText()) < 0) {
            btn2.setText("0");
        } else {
            btn0.setText(valueOf(arrTiles[0][0].getValue() + 1));
            btn3.setText(valueOf(arrTiles[1][1].getValue() + 1));

            arrTiles[1][0].setValue(Integer.parseInt(btn2.getText()));
            arrTiles[0][0].setValue(Integer.parseInt(btn0.getText()));
            arrTiles[1][1].setValue(Integer.parseInt(btn3.getText()));
        }
    }

    public void clickBtn3(ActionEvent event) {
        Tile[][] arrTiles = field.getTiles();

        btn3.setText(valueOf(arrTiles[1][1].getValue() - 1));
        if (Integer.parseInt(btn3.getText()) < 0) {
            btn3.setText("0");
        } else {
            btn1.setText(valueOf(arrTiles[0][1].getValue() + 1));
            btn2.setText(valueOf(arrTiles[1][0].getValue() + 1));

            arrTiles[1][1].setValue(Integer.parseInt(btn3.getText()));
            arrTiles[0][1].setValue(Integer.parseInt(btn1.getText()));
            arrTiles[1][0].setValue(Integer.parseInt(btn2.getText()));
        }
    }
}
