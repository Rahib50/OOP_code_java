public class Dog {
    String name = "A dog";
    String color = "";
    public String bark(){
        if (!(this.name.equals("A dog")) && !(this.color.equals(""))){
            return (this.name + " the " + this.color + " dog is barking");
        }

        else if(!(this.name.equals("A dog")) && this.color.equals("")){
            return (this.name + " is barking");
        }

        else if(this.name.equals("A dog") && !(this.color.equals(""))){
            return (this.color + " dog is barking");
        }

        else{
            return ("A dog is barking");
        } 

    }

    public void changeName (String new_name){
        this.name = new_name;
    }

    public void changeColor(String new_color){
        this.color = new_color;
        if(this.name.equals("A dog")){
            System.out.println("This dog is " + this.color);
        }
        else{
            System.out.println(this.name + " is " + this.color);
        }
    }



}
