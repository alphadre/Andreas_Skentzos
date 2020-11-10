package cardgame;

interface CardGame {
    
    public default String shuffle(){
        return "First you shuffle the cards then, deal";
    }
    
    public int deal();
            
    public String displayRules();
            
    public String keepScore();
    
    public String message();
    
}
