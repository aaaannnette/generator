package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generatorButton;

    @FXML
    private TextArea generatorAns;

    @FXML
    private TextField seed;

    @FXML
    private TextField mod;

    @FXML
    private TextField multiplier;

    @FXML
    private TextField inc;

    @FXML
    private TextField noOfRandomNum;

    @FXML
    void initialize() {
        generatorButton.setOnAction(ignored -> someMethod(true));            //задает действие кнопке Зашифровать

    }

    private void someMethod(boolean flag) {                                     //метод для отлика события, чтобы сгенерировать числа
        int seedValue = Integer.parseInt(seed.getText());
        int noOfRandomNumValue = Integer.parseInt(noOfRandomNum.getText());
        int incValue = Integer.parseInt(inc.getText());
        int multiplierValue = Integer.parseInt(multiplier.getText());
        int modValue = Integer.parseInt(mod.getText());
        if (seed.getText().isEmpty()
                || noOfRandomNum.getText().isEmpty()
                || inc.getText().isEmpty()
                || multiplier.getText().isEmpty()
                || mod.getText().isEmpty()) {                     //проверка на пустоту полей
            generatorAns.setText("Введите значение/значения в поля ввода");
        } else {
            generatorAns.setText(Arrays.toString(gfg
                    .lcm(seedValue, modValue, multiplierValue, incValue, noOfRandomNumValue))
            .replace("[", "")
            .replace("]", ""));     //вывод результата в окне ответа
        }
    }
}

