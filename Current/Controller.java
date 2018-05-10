package application;

import ecdev456.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;


public class Controller {

	static Model user;
    //@FXML
    public void onClick(MouseEvent e)
    {
        Circle c = (Circle) e.getSource();
        String name = c.getId();
        switch(name){
            case "circle00":
                if(user.CheckActive(0,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(0, 0, 0);// making it inactive
                    System.out.println(user.CheckActive(0,0));
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(0, 0, 1);// making it inactive
                  System.out.println(user.CheckActive(0,0));
                }
                break;
            case "circle01":
                if(user.CheckActive(0,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(0, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(0, 1, 1);
                }
                break;
            case "circle02":
                if(user.CheckActive(0,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(0, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(0, 2, 1);
                }
                break;
            case "circle03":
                if(user.CheckActive(0,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(0, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(0, 3, 1);
                }
                break;
            case "circle04":
                if(user.CheckActive(0,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(0, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(0, 4, 1);
                }
                break;
            case "circle10":
                if(user.CheckActive(1,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(1, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(1, 0, 1);
                }
                break;
            case "circle11":
                if(user.CheckActive(1,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(1, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(1, 1, 1);
                }
                break;
            case "circle12":
                if(user.CheckActive(1,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(1, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(1, 2, 1);
                }
                break;
            case "circle13":
                if(user.CheckActive(1,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(1, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(1, 3, 1);
                }
                break;
            case "circle14":
                if(user.CheckActive(1,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(1, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(1, 4, 1);
                }
                break;
            case "circle20":
                if(user.CheckActive(2,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(2, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(2, 0, 1);
                }
                break;
            case "circle21":
                if(user.CheckActive(2,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(2, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(2, 1, 1);
                }
                break;
            case "circle22":
                if(user.CheckActive(2,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(2, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(2, 2, 1);
                }
                break;
            case "circle23":
                if(user.CheckActive(2,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(2, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(2, 3, 1);
                }
                break;
            case "circle24":
                if(user.CheckActive(2,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(2, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(2, 4, 1);
                }
                break;
            case "circle30":
                if(user.CheckActive(3,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(3, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(3, 0, 1);
                }
                break;
            case "circle31":
                if(user.CheckActive(3,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(3, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(3, 1, 1);
                }
                break;
            case "circle32":
                if(user.CheckActive(3,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(3, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(3, 2, 1);
                }
                break;
            case "circle33":
                if(user.CheckActive(3,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(3, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(3, 3, 1);
                }
                break;
            case "circle34":
                if(user.CheckActive(3,4) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(3, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(3, 4, 1);
                }
                break;
            case "circle40":
                if(user.CheckActive(4,0) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(4, 0, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(4, 0, 1);
                }
                break;
            case "circle41":
                if(user.CheckActive(4,1) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(4, 1, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(4, 1, 1);
                }
                break;
            case "circle42":
                if(user.CheckActive(4,2) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(4, 2, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(4, 2, 1);
                }
                break;
            case "circle43":
                if(user.CheckActive(4,3) == 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(4, 3, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(4, 3, 1);
                }
                break;
            case "circle44":
                if(user.CheckActive(4, 4)== 1)
                {
                    c.setFill(Color.YELLOW);
                    user.SetActive(4, 4, 0);
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    user.SetActive(4, 4, 1);
                }
                break;
            default:
                break;
        }
        
        //A CheckWin can be set here
        user.CheckMath();
        boolean result;
        result = user.CheckWin();
        if(result == true)
        {
        	System.out.println("You WON!");
        }
        //System.out.println("End of the action");
    }

}

