/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookLibrary;

/**
 *
 * @author taloh
 */
public class BookLibrary {
    Float Lib;
    
    public Float getLib(){
        return Lib;
    }
    
    public BookLibrary(){
        Lib = 0.0f;
    }
    
    public void Bought(Float amount){
        Lib += amount;
    }
    
    public void Sold(Float amount){
        Lib -= amount;
    }
}
