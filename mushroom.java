/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourchoice;

/**
 *
 * @author ornella
 */
public class mushroom {
    public String getmush(char gills,char forest,char ring,char cup ){
        
  if(gills=='n'){
      return("the mushroom is cepe de bordeaux");
  }
     else if(forest=='n'&&ring=='y'){
          return("the mushroom is Coprin chevelu");
      }
    else  if(forest=='n'&&ring=='y'){
    return("the mushroom is Amanite tue-mouche");      
      }
    else if(forest=='n'&&ring=='y'){
        return("The mushroom is Convex cup");
    }
    else{
        return("the mushroom is Girolle");
    }
        }
    }
    

