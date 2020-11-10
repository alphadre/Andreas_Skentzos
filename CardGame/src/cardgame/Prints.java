
package cardgame;


 class Prints {
     
     public void callMe(){
         CardGame cg1 = new Poker();
        CardGame cg2 = new Palermo();
        
        System.out.println(cg1.message());
        System.out.println(cg1.shuffle());
        System.out.println("Cards dealt: " + cg1.deal());
        System.out.println("Rules: " + cg1.displayRules());
        System.out.println("Scoring: " + cg1.keepScore() + "\n");
        
        System.out.println(cg2.message());
        System.out.println(cg2.shuffle());
        System.out.println("Cards dealt: " + cg2.deal());
        System.out.println("Rules: " + cg2.displayRules());
        System.out.println("Scoring: " + cg2.keepScore());
     }
    
}
