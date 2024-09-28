public class SmartPhoneTester{
     public static void main(String[] args) {
       Smartphone s1 = new Smartphone();
       System.out.println("1===================");
       s1.addFeature("Display", "6.1 inch");
       System.out.println("2===================");
       s1.updateName("Samsung Note 20");
       s1.addFeature("Display", "6.1 inch");
       s1.printDetail();
       System.out.println("3===================");
       Smartphone s2 = new Smartphone("Iphone 12 Pro");
       s2.addFeature("Display", "6.2 inch");
       s2.addFeature("Ram", "6 GB");
       System.out.println("4===================");
       s2.printDetail();
       s2.addFeature("Display", "Amoled panel");
       s2.addFeature("Ram", "DDR5");
       System.out.println("5===================");
       s2.printDetail();
       System.out.println("6===================");
     }
}
 
class Smartphone{
     int count = 0;
     String[] feature = new String[10];
     String [] f2 = new String[10];
     String name;

     public Smartphone(){}
     public Smartphone(String nam){
          name = nam;
     }

     public void addFeature(String f1, String f2){
          if(name != null){
               int idx =0;
               boolean flag = false;
               
               for(int i = 0; i < feature.length; i++){
               
               if( feature[i] != null && feature[i].equals(f1)){
                    idx = i; flag = true; break;
               }
               
               }
               if(!flag){
               for(int i = 0; i < feature.length; i++){
                    if(feature[i] == null){
                         idx = i;  break;
                    }
               }
               }
               
               if(flag){
               this.f2[idx] += ", " + f2;
               }
               
               else{
               feature[idx] = f1;
               this.f2[idx] = f2;
               count++;
               }
               
          }
          else{
               System.out.println("Feature can not be added without phone name");
          }
     }

     public void updateName(String nam){
          name = nam;
     }

     public void printDetail(){
          System.out.println("Phone Name: " + this.name);
          for(int i = 0; i < count; i++){
               System.out.println(feature[i] + ": " + f2[i]);
          }
     }

}
