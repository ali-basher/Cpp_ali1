/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforexample2;

/**
 *
 * @author hassouna
 */
public class NestedForExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int row, sp, ast, roundSP, roundAst, discount = 0;
        for( row = 1 ; row <= 9 ; row++ ){            
            roundSP = (row<=5)? 5-row : row-5;
            
            for( sp = 1 ; sp <= roundSP ; sp++ )
                System.out.print(" ");
            
            if(row>5) discount += 4;
            
            roundAst = (row<=5)? row*2-1:row*2-1-discount;
            
            for(ast = 1 ; ast <= roundAst ; ast++)
                System.out.print("*");
            
            System.out.println();
        }
        
    }
    
}
