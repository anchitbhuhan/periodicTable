
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class DisplayController implements Initializable {

    @FXML
    private Label atomicNo;
    @FXML
    private Label symbol;
    @FXML
    private Label name;
    @FXML
    private Label atomicMass;
    @FXML
    private Label group;
    @FXML
    private Label period;
    @FXML
    private Label block;
    @FXML
    private Label ec;
    @FXML
    private Label stp;
    @FXML
    private Label mp;
    @FXML
    private Label bp;
    @FXML
    private Label density;
    @FXML
    private Label by;
    @FXML
    private TextArea desc;
    
    public void setTexttoatomicNo (int text){
        atomicNo.setText(Integer.toString(text));
    }

    public void setTexttoSymbol(String text){
        symbol.setText(text);
    }
    public void setTexttoName(String text){
        name.setText(text);
    }
    public void setTexttoMass(Double text){
        atomicMass.setText(Double.toString(text));
    }
    public void setTexttoGroup(int text){
        group.setText(Integer.toString(text));
    }
    public void setTexttoPeriod(int text){
        period.setText(Integer.toString(text));
    }
    public void setTexttoBlock(char text){
        block.setText(Character.toString(text));
    }
    public void setTexttoEc(String text){
        ec.setText(text);
    }
    public void setTexttoStp(String text){
        stp.setText(text);
    }
    public void setTexttoMp(Double text){
        mp.setText(Double.toString(text));
    }
    public void setTexttoBp(Double text){
        bp.setText(Double.toString(text));
    }
    public void setTexttoDensity(Double text){
        density.setText(Double.toString(text));
    }
    public void setTexttoDesc(String text){
        desc.setWrapText(true);
        desc.setText(text);
        desc.setEditable(false);
    }
    public void setTexttoDiscovery(String text){
        by.setText(text);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
