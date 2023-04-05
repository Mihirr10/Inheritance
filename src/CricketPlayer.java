 class CricketPlayer extends Player{

  String type;

   public String getType() {
     return type;
   }

   public void setType(String type) {
     this.type = type;
   }

   @Override
   public void score() {
     System.out.println("Run scored !!");
   }


 }
