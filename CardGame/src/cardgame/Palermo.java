
package cardgame;


class Palermo implements CardGame{
    
    public String message(){
        return "...This is a Palermo card game...";
    }
    
    public int deal(){
        return 1;
    }
    
    public String displayRules(){
        String rules = "There are two teams, Citizens and Mob bosses "+
                        "and two roles, the snitch and the whore.\n"+
                        "Citizens must find Mobb bosses with the snitch's help "+
                        "while the whore is trying to desorganize the citizens.\n"+
                        "Each night a player 'dies'";
        return rules;
    }
    
    public String keepScore(){
        return "Winning by 'killing' the other team";
        
    }
    
    
    
    
    
    
    
    
}
