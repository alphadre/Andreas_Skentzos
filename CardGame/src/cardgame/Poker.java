package cardgame;


class Poker implements CardGame{
    
    public int deal(){
        return 2;
    }
    
    public String displayRules(){
        return "In order to play a round you must create combinations of five cards";
    }
    
    public String keepScore(){
        return "The more money you have the more higher your score is";
    }
    
    public String message(){
        return "...This is a Poker game...";
    }
    
}
