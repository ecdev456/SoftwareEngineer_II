package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.input.MouseButton;
import javafx.scene.shape.Circle;


public class Controller {

    int c00 = 0;
    int c01 = 0;
    int c02 = 0;
    int c03 = 0;
    int c04 = 0;
    int c10 = 0;
    int c11 = 0;
    int c12 = 0;
    int c13 = 0;
    int c14 = 0;
    int c20 = 0;
    int c21 = 0;
    int c22 = 0;
    int c23 = 0;
    int c24 = 0;
    int c30 = 0;
    int c31 = 0;
    int c32 = 0;
    int c33 = 0;
    int c34 = 0;
    int c40 = 0;
    int c41 = 0;
    int c42 = 0;
    int c43 = 0;
    int c44 = 0;
    //@FXML
    public void onClick(MouseEvent e)
    {
        Circle c = (Circle) e.getSource();
        String name = c.getId();
        switch(name){
            case "circle00":
                if(c00 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c00 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c00 = 0;
                }
                break;
            case "circle01":
                if(c01 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c01 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c01 = 0;
                }
                break;
            case "circle02":
                if(c02 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c02 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c02 = 0;
                }
                break;
            case "circle03":
                if(c03 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c03 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c03 = 0;
                }
                break;
            case "circle04":
                if(c04 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c04 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c04 = 0;
                }
                break;
            case "circle10":
                if(c10 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c10 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c10 = 0;
                }
                break;
            case "circle11":
                if(c11 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c11 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c11 = 0;
                }
                break;
            case "circle12":
                if(c12 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c12 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c12 = 0;
                }
                break;
            case "circle13":
                if(c13 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c13 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c13 = 0;
                }
                break;
            case "circle14":
                if(c14 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c14 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c14 = 0;
                }
                break;
            case "circle20":
                if(c20 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c20 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c20 = 0;
                }
                break;
            case "circle21":
                if(c21 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c21 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c21 = 0;
                }
                break;
            case "circle22":
                if(c22 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c22 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c22 = 0;
                }
                break;
            case "circle23":
                if(c23 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c23 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c23 = 0;
                }
                break;
            case "circle24":
                if(c24 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c24 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c24 = 0;
                }
                break;
            case "circle30":
                if(c30 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c30 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c30 = 0;
                }
                break;
            case "circle31":
                if(c31 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c31 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c31 = 0;
                }
                break;
            case "circle32":
                if(c32 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c32 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c32 = 0;
                }
                break;
            case "circle33":
                if(c33 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c33 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c33 = 0;
                }
                break;
            case "circle34":
                if(c34 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c34 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c34 = 0;
                }
                break;
            case "circle40":
                if(c40 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c40 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c40 = 0;
                }
                break;
            case "circle41":
                if(c41 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c41 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c41 = 0;
                }
                break;
            case "circle42":
                if(c42 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c42 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c42 = 0;
                }
                break;
            case "circle43":
                if(c43 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c43 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c43 = 0;
                }
                break;
            case "circle44":
                if(c44 == 0)
                {
                    c.setFill(Color.YELLOW);
                    c44 = 1;
                }
                else
                {
                    c.setFill(Color.DODGERBLUE);
                    c44 = 0;
                }
                break;
            default:
                break;
        }

    }

}

