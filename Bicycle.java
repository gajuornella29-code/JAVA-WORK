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
public class Bicycle {

    
    public String getRent(int sh, int eh){
          
      
       int h,total;
       h=eh-sh;
       if(sh<0||sh>23||eh<1||eh>24){
           return("stop there \n invalid hours");
       }
       else if((sh>eh)){
          
           return("can't work");
       }
       else if(sh>=0&&eh<=7||sh>=21&&eh<=24){
           total=500*h;
           return("the rent will be 500 RWF per hour"+"and your total:"+total);
       }
       else if(sh>=7&&eh<=14||sh>=19&&eh<=21){
           total=1000*h;
           return("the rent will be 1000 RWF per hour"+"and your total:"+total);
       }
       else if(sh>=14&&eh<=19){
           total=1500*h;
           return("the rent will be 1500 RWF per hour"+"and your total:"+total);
       }else{
           return("not working");
       }

    }}
    

