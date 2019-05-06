
package javafxapplication1;
import java.io.IOException;
import periodic.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addEle implements Initializable {

    @FXML
    private TextArea desc = new TextArea();
    @FXML
    private TextField atomicNo = new TextField();
    @FXML
    private TextField name = new TextField();
    @FXML
    private TextField symbol = new TextField();
    @FXML
    private TextField atomicMass = new TextField();
    @FXML
    private TextField group = new TextField();
    @FXML
    private TextField block = new TextField();
    @FXML
    private TextField period = new TextField();
    @FXML
    private TextField ec = new TextField();
    @FXML
    private TextField stp = new TextField();
    @FXML
    private TextField mp = new TextField();
    @FXML
    private TextField density = new TextField();
    @FXML
    private TextField by = new TextField();
    @FXML
    private Button ok;
    @FXML
    private TextField bp = new TextField();
    
    public void addOnOk() throws ClassNotFoundException, IOException, NoSuchMethodException{
        int atomicno = Integer.parseInt(atomicNo.getText());
        String Name = name.getText();
        String Symbol = symbol.getText();
        Double atomicmass = Double.parseDouble(atomicMass.getText());
        int Group = Integer.parseInt(group.getText());
        int Period = Integer.parseInt(period.getText());
        char Block = (group.getText()).charAt(0);
        String EC = ec.getText();
        String pas = stp.getText();
        Double MP = Double.parseDouble(mp.getText());
        Double BP = Double.parseDouble(bp.getText());
        Double Density = Double.parseDouble(density.getText());
        String Desc = desc.getText();
        String By = by.getText();
        addElement.addelement(new Element(atomicno,Name,Symbol,atomicmass,Group,Period,Block,EC,pas,MP,BP,Density,Desc,By));
       Stage stage = (Stage) ok.getScene().getWindow();
        stage.close();
        }
//    @FXML
//    public void handleCloseButtonAction(ActionEvent event) {
//    
//}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
