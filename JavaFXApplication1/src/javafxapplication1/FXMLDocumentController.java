package javafxapplication1;
import periodic.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.Separator;
//import javafx.scene.control.TextField;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
//import javafx.scene.text.Text;
import javafx.stage.Stage;
//import static javafxapplication1.FXMLDocumentController.h;
/**
 *
 * @author anchit
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button naya;
//    private Label label;
////    @FXML
////    private Button Li;
//    @FXML
//    private Button Be;
//    @FXML
//    private Button la;
//    @FXML
//    private Button ce;
//    @FXML
//    private Button pr;
//    @FXML
//    private Button nd;
//    @FXML
//    private Button pm;
//    @FXML
//    private Button eu;
//    @FXML
//    private Button gd;
//    @FXML
//    private Button tb;
//    @FXML
//    private Button dy;
//    @FXML
//    private Button ho;
//    @FXML
//    private Button er;
//    @FXML
//    private Button tm;
//    @FXML
//    private Button yb;
//    @FXML
//    private Button lu;
//    @FXML
//    private Button ac;
//    @FXML
//    private Button th;
//    @FXML
//    private Button pa;
//    @FXML
//    private Button u;
//    @FXML
//    private Button np;
//    @FXML
//    private Button pu;
//    @FXML
//    private Button am;
//    @FXML
//    private Button cm;
//    @FXML
//    private Button bk;
//    @FXML
//    private Button cf;
//    @FXML
//    private Button es;
//    @FXML
//    private Button fm;
//    @FXML
//    private Button md;
//    @FXML
//    private Button no;
//    @FXML
//    private Button lr;
//    @FXML
//    private Button p1;
//    @FXML
//    private Button p2;
//    @FXML
//    private Button p3;
//    @FXML
//    private Button p4;
//    @FXML
//    private Button p5;
//    @FXML
//    private Button p6;
//    @FXML
//    private Button p7;
//    @FXML
//    private Button g1;
//    
//    @FXML
//    private Button na;
//    @FXML
//    private Button k;
//    @FXML
//    private Button rb;
//    @FXML
//    private Button cs;
//    @FXML
//    private Button fr;
//    @FXML
//    private Button g2;
//    @FXML
//    private Button mg;
//    @FXML
//    private Button ca;
//    @FXML
//    private Button sr;
//    @FXML
//    private Button ba;
//    @FXML
//    private Button ra;
//    @FXML
//    private Button g3;
//    @FXML
//    private Button sc;
//    @FXML
//    private Button ty;
//    @FXML
//    private Button g4;
//    @FXML
//    private Button ti;
//    @FXML
//    private Button zr;
//    @FXML
//    private Button hf;
//    @FXML
//    private Button rf;
//    @FXML
//    private Button g5;
//    @FXML
//    private Button v;
//    @FXML
//    private Button nb;
//    @FXML
//    private Button ta;
//    @FXML
//    private Button db;
//    @FXML
//    private Button g6;
//    @FXML
//    private Button cr;
//    @FXML
//    private Button mo;
//    @FXML
//    private Button w;
//    @FXML
//    private Button sg;
//    @FXML
//    private Button g7;
//    @FXML
//    private Button mn;
//    @FXML
//    private Button tc;
//    @FXML
//    private Button re;
//    @FXML
//    private Button bh;
//    @FXML
//    private Button g8;
//    @FXML
//    private Button fe;
//    @FXML
//    private Button ru;
//    @FXML
//    private Button os;
//    @FXML
//    private Button hs;
//    @FXML
//    private Button g9;
//    @FXML
//    private Button co;
//    @FXML
//    private Button rh;
//    @FXML
//    private Button ir;
//    @FXML
//    private Button mt;
//    @FXML
//    private Button g10;
//    @FXML
//    private Button ni;
//    @FXML
//    private Button pd;
//    @FXML
//    private Button pt;
//    @FXML
//    private Button ds;
//    @FXML
//    private Button g11;
//    @FXML
//    private Button cu;
//    @FXML
//    private Button ag;
//    @FXML
//    private Button au;
//    @FXML
//    private Button rg;
//    @FXML
//    private Button g12;
//    @FXML
//    private Button zn;
//    @FXML
//    private Button cd;
//    @FXML
//    private Button hg;
//    @FXML
//    private Button cn;
//    @FXML
//    private Button g13;
//    @FXML
//    private Button b;
//    @FXML
//    private Button al;
//    @FXML
//    private Button ga;
//    @FXML
//    private Button in;
//    @FXML
//    private Button tl;
//    @FXML
//    private Button nh;
//    @FXML
//    private Button g14;
//    @FXML
//    private Button c;
//    @FXML
//    private Button si;
//    @FXML
//    private Button ge;
//    @FXML
//    private Button sn;
//    @FXML
//    private Button pb;
//    @FXML
//    private Button fl;
//    @FXML
//    private Button g15;
//    @FXML
//    private Button n;
//    @FXML
//    private Button p;
//    @FXML
//    private Button as;
//    @FXML
//    private Button sb;
//    @FXML
//    private Button bi;
//    @FXML
//    private Button mc;
//    @FXML
//    private Button g16;
//    @FXML
//    private Button o;
//    @FXML
//    private Button s;
//    @FXML
//    private Button se;
//    @FXML
//    private Button te;
//    @FXML
//    private Button po;
//    @FXML
//    private Button lv;
//    @FXML
//    private Button g17;
//    @FXML
//    private Button f;
//    @FXML
//    private Button cl;
//    @FXML
//    private Button br;
//    @FXML
//    private Button i;
//    @FXML
//    private Button at;
//    @FXML
//    private Button ts;
//    @FXML
//    private Button g18;
//    @FXML
//    private Button he;
//    @FXML
//    private Button ne;
//    @FXML
//    private Button ar;
//    @FXML
//    private Button kr;
//    @FXML
//    private Button xe;
//    @FXML
//    private Button rn;
//    @FXML
//    private Button og;
//    @FXML
//    private Button Hydrogen;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

//    @FXML
//    private void onHPress(ActionEvent event) throws IOException {
//        JavaFXApplication1.onHPress();
//    }
//
    //    @FXML
    //    private void onHPress(MouseEvent event) throws IOException {
    //        JavaFXApplication1.onHPress();
    //    }
    //            @FXML
    //            public void ohHpress() {
    //            Hydrogen.setOnAction(new EventHandler<ActionEvent>() {
    //                @Override
    //                public void handle(ActionEvent ae) {
    //                    try{
//                    Stage newStage = new Stage();
//                    System.out.println("H button pressed");
//                    FXMLLoader loader1 = new FXMLLoader();
//                    loader1.setLocation(JavaFXApplication1.class.getResource("display.fxml"));
//                        Pane  pane = loader1.load();
//                        DisplayController dc = (DisplayController)loader1.getController();
//                        Element obj = searchName.searchname("Hydrogen");
//                        dc.setTexttoatomicNo(obj.id);
//                        dc.setTexttoSymbol(obj.Symbol);
//                        dc.setTexttoName(obj.name);
//                        dc.setTexttoMass(obj.A);
//                        dc.setTexttoGroup(obj.Group);
//                        dc.setTexttoPeriod(obj.Period);
//                        dc.setTexttoBlock(obj.block);
//                        dc.setTexttoEc(obj.EC);
//                        dc.setTexttoStp(obj.PAS);
//                        dc.setTexttoMp(obj.MP);
//                        dc.setTexttoBp(obj.BP);
//                        dc.setTexttoDensity(obj.Density);
//                        dc.setTexttoDesc(obj.Desc);
//                        dc.setTexttoDiscovery(obj.Discovery);
//                                            
//                    Scene scene1 = new Scene(pane);
//                    newStage.setTitle("Hydrogen");
//                    newStage.setScene(scene1);
//                    newStage.show();
//                    }catch(Exception ex){
//                        System.out.println(ex);
//                    }
//                }
//            });
//    }
            @FXML
            public void onButtonPress(ActionEvent event){
                ((Button)event.getTarget()).setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent ae) {
                        try{
                            String s = ((Button)event.getSource()).getId();
                            Stage newStage = new Stage();
                            System.out.println(s+" button pressed");
                            
                            FXMLLoader loader1 = new FXMLLoader();
                            loader1.setLocation(JavaFXApplication1.class.getResource("display.fxml"));
                            Pane pane = loader1.load();
                            DisplayController dc = (DisplayController)loader1.getController();
                        Element obj = searchName.searchname(s);
                        dc.setTexttoatomicNo(obj.id);
                        dc.setTexttoSymbol(obj.Symbol);
                        dc.setTexttoName(obj.name);
                        dc.setTexttoMass(obj.A);
                        dc.setTexttoGroup(obj.Group);
                        dc.setTexttoPeriod(obj.Period);
                        dc.setTexttoBlock(obj.block);
                        dc.setTexttoEc(obj.EC);
                        dc.setTexttoStp(obj.PAS);
                        dc.setTexttoMp(obj.MP);
                        dc.setTexttoBp(obj.BP);
                        dc.setTexttoDensity(obj.Density);
                        dc.setTexttoDesc(obj.Desc);
                        dc.setTexttoDiscovery(obj.Discovery);
                            Scene scene1 = new Scene(pane);
                            newStage.setScene(scene1);
                            newStage.show();
                        }catch(Exception ex){
                            System.out.println("Error"+ex);
                        }
                    }
                });
            }
            
            

                public void ohNewPress() {
                naya.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent ae) {
                        try{
                    Stage newStage = new Stage();
                    System.out.println("New button pressed");
                    FXMLLoader loader1 = new FXMLLoader();
                    loader1.setLocation(JavaFXApplication1.class.getResource("addEle.fxml"));
                        Pane  pane = loader1.load();
                        Scene scene1 = new Scene(pane);
                    newStage.setTitle("addElement");
                    newStage.setScene(scene1);
                    newStage.show();
                    }catch(Exception ex){
                        System.out.println(ex);
                    }
                }
            });
    }

//    @FXML
//    private void onButtonPress(ActionEvent event) {
//    }
}
            
