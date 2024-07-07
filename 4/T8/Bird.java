public class Bird {
    String name = null;
    private int h = 0; //initial height of the bird
    public void flyUp(int height){
        System.out.println(name + " has flown up " + height + " feet.");
        h += height;
    }
    
    public void flyDown(int height){
        if(!(h-height < 0)){
            h -= height;
            if(h == 0){
                System.out.println(name + " has flown down " + height + " feet and landed.");
            }
            else{
                System.out.println(name + " has flown down " + height + " feet.");
            }
        }
        else{
            System.out.println(name + " cannot fly down " + height + " feet.");
        }
    }

    public void makeNoise(){
        if(name.equals("Parrot")){
            System.out.println("Squawk");
        }
        if(name.equals("Eagle")){
            System.out.println("Squee");
        }
    }
}
