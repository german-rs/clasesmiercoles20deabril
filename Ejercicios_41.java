
package ClasesMiercoles20;


public class Ejercicios_41 
{
    
    public void _3()
    {
        
        int[][][][] nmbr = new int[3][4][5][6];
        int element = 2;
        
        
        for (int fil = 0; fil < 3; fil++) 
            
            for (int col = 0; col < 4; col++) 
                
                for (int x = 0; x < 5; x++) 
                    
                    for (int y = 0; y < 6; y++) 
                    {
                        
                        nmbr[fil][col][x][y] = element;
                        element += 2;
                    }

        
        //Cloning...
        
        int[][][][] nmbr_2 = nmbr.clone();
        
        System.out.println("Array elements: ");
        
        for (int fil = 0; fil < 3; fil++) 
            
            for (int col = 0; col < 4; col++) 
                
                for (int x = 0; x < 5; x++) 
                    
                    for (int y = 0; y < 6; y++) 
 
                        System.out.println(nmbr[fil][col][x][y]);
                    
        
        
        System.out.println("Array (clone) elements: ");
        
        for (int fil = 0; fil < 3; fil++) 
            
            for (int col = 0; col < 4; col++) 
                
                for (int x = 0; x < 5; x++) 
                    
                    for (int y = 0; y < 6; y++) 
 
                        System.out.println(nmbr_2[fil][col][x][y]);        
        
        
    }//..
    
    public void _2()
    {
        int[][][] prs = new int[2][3][4];
        int counter = 0;
        int pr = 2;
        
        for (int fil = 0; fil < 2; fil++) 
            
            for (int col = 0; col < 3; col++) 
                
                for (int z = 0; z < 4; z++) 
                {
                    
                    prs[fil][col][z] = pr;
                    pr += 2; 
                }
            
        
        //Cloning..
        
        int[][][] prsClone = prs.clone();
        
        System.out.println("Array (clone) elements: ");
        
        for (int fil = 0; fil < 2; fil++) 
            
            for (int col = 0; col < 3; col++) 
                
                for (int z = 0; z < 4; z++) 
                {
                    
                    System.out.println(prsClone[fil][col][z]);
                    pr += 2; 
                    counter ++;
                }
        
        
        System.out.println("Tot elements: " + counter);
        
    }//..
    
    public void _1()
    {
        
        String[][][] nms = new String[][][]
        {
            {{"Han", "Zizek"},{"Foucault", "Bourdieu"}},
            {{"Onfray", "Derrida"},{"Kant", "Hegel"}}
        };
        
        System.out.println(nms[0][0][0]);
        System.out.println(nms[1][1][1]);
        System.out.println(nms[1][0][0]);
    }//..
        
}//.
