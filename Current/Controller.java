package application;

import java.util.Optional;

import ecdev456.Model;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
//import javafx.scene.paint.Paint;
//import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;


public class Controller {
	
    //@FXML
    public void onClick(MouseEvent e)
    {
    	
    	
    	//CH
        Circle c = (Circle) e.getSource();
        String name = c.getId();        
        switch(name){
            case "circle00":
                if(Model.CheckActive(0,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(0, 0, 0);// making it inactive
                //    System.out.println(Model.CheckActive(0,0));
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(0, 0, 1);// making it inactive
                  System.out.println(Model.CheckActive(0,0));
                }
                break;
            case "circle01":
                if(Model.CheckActive(0,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(0, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(0, 1, 1);
                }
                break;
            case "circle02":
                if(Model.CheckActive(0,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(0, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(0, 2, 1);
                }
                break;
            case "circle03":
                if(Model.CheckActive(0,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(0, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(0, 3, 1);
                }
                break;
            case "circle04":
                if(Model.CheckActive(0,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(0, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(0, 4, 1);
                }
                break;
            case "circle10":
                if(Model.CheckActive(1,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(1, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(1, 0, 1);
                }
                break;
            case "circle11":
                if(Model.CheckActive(1,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(1, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(1, 1, 1);
                }
                break;
            case "circle12":
                if(Model.CheckActive(1,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(1, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(1, 2, 1);
                }
                break;
            case "circle13":
                if(Model.CheckActive(1,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(1, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(1, 3, 1);
                }
                break;
            case "circle14":
                if(Model.CheckActive(1,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(1, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(1, 4, 1);
                }
                break;
            case "circle20":
                if(Model.CheckActive(2,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(2, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(2, 0, 1);
                }
                break;
            case "circle21":
                if(Model.CheckActive(2,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(2, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(2, 1, 1);
                }
                break;
            case "circle22":
                if(Model.CheckActive(2,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(2, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(2, 2, 1);
                }
                break;
            case "circle23":
                if(Model.CheckActive(2,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(2, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(2, 3, 1);
                }
                break;
            case "circle24":
                if(Model.CheckActive(2,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(2, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(2, 4, 1);
                }
                break;
            case "circle30":
                if(Model.CheckActive(3,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(3, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(3, 0, 1);
                }
                break;
            case "circle31":
                if(Model.CheckActive(3,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(3, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(3, 1, 1);
                }
                break;
            case "circle32":
                if(Model.CheckActive(3,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(3, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(3, 2, 1);
                }
                break;
            case "circle33":
                if(Model.CheckActive(3,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(3, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(3, 3, 1);
                }
                break;
            case "circle34":
                if(Model.CheckActive(3,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(3, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(3, 4, 1);
                }
                break;
            case "circle40":
                if(Model.CheckActive(4,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(4, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(4, 0, 1);
                }
                break;
            case "circle41":
                if(Model.CheckActive(4,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(4, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(4, 1, 1);
                }
                break;
            case "circle42":
                if(Model.CheckActive(4,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(4, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(4, 2, 1);
                }
                break;
            case "circle43":
                if(Model.CheckActive(4,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(4, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(4, 3, 1);
                }
                break;
            case "circle44":
                if(Model.CheckActive(4, 4)== 1)
                {
                    c.setFill(Color.YELLOW);
                    Model.SetActive(4, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    Model.SetActive(4, 4, 1);
                }
                break;
            default:
                break;
        }
        
        //CheckMath:  Will do the sum of both Horizontal and Vertical to test if sum is correct.
        Model.CheckMath();
        
        //After CheckMath, CheckWin will check if User has managed to win the Rullo game.
       if(Model.CheckWin() == true)
       {
           Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
           alert .setTitle("Done!");
           alert.setHeaderText("Hooray, you won Rullo");
           alert.setContentText("Now go beat your time.");
                   	
           	//Creating option, if "Okay" close entire game, for user to restart
           		//			, if "Cancel" go back to the game
           	ButtonType Okay = new ButtonType("Okay");
           	ButtonType Cancel = new ButtonType("Cancel");
           	alert.getButtonTypes().setAll(Okay, Cancel);
           	
           	Optional<ButtonType> result = alert.showAndWait();
if(result.get() == Okay) {
	System.exit(0);
}
       }
       

   }

}

