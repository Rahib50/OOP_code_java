//Task3
public class LightControllerTester {
    public static void main(String args []){
        LightController c1 = new LightController();
        c1.showLightStatus();
        System.out.println("1---------------");
        c1.adjustBrightness(4);
        c1.switchLight();
        System.out.println("2---------------");
        c1.showLightStatus();
        System.out.println("3---------------");
        c1.adjustBrightness(4);
        System.out.println("4---------------");
        c1.showLightStatus();
        System.out.println("5---------------");
        c1.adjustBrightness(-2);
        c1.adjustBrightness(9);
        System.out.println("6---------------");
        c1.showLightStatus();
        System.out.println("7---------------");
        System.out.println(c1.resetSettings());
        c1.showLightStatus();
        System.out.println("8---------------");
        c1.switchLight();
        System.out.println("9---------------");
        c1.showLightStatus();
      }    
}

//Task 3
class LightController{
    int bright = 0;
    boolean stat = false;

    public void showLightStatus(){
        System.out.print("Light Status: ");
        if(stat){
            System.out.print("ON\n");
        }
        else{
            System.out.println("OFF");
        }
        System.out.println("Brightness Level: " + bright);
    }

    public void switchLight(){
        if(stat){
            stat = false;
            bright = 0;
            System.out.println("Lights are now OFF.");
        }
        else{
            stat = true;
            if(bright == 0){
                bright = 1;
            }
            System.out.println("Lights are now ON.");
        }
    }

    public void adjustBrightness(int n){
        if (!stat){
            System.out.println("Please turn on the light first!");
        }
        else{
            if(bright + n >= 0 && bright + n <= 10){
                bright += n;
                System.out.println("Brightness adjusted.");
            }
            else{
                System.out.println("Brightness out of range. Set between 0 to 10.");
            }
        }
    }

    public String resetSettings(){
        if(stat){
            bright = 1;
        }
        else{
            bright = 0;
        }
        return ("Light settings have been reset.");
    }

}
