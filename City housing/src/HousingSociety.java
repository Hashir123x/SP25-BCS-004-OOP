public class HousingSociety{

          Block blocks[];
          String societyname;
          Block b=new Block();
          char blockID[]={'A','B','C','D','E','F','G','H','I','J','K','L','M'};

   	HousingSociety(String societyname){
		this.societyname=societyname;
		blocks=new Block[3];
                namingblocks();
		}
HousingSociety(){}
	public String toString(){
		StringBuilder str=new StringBuilder();                
                str.append(String.format("\n%40s",societyname));
		for(int i=0;i<blocks.length;i++){
			str.append("\n"+blocks[i].toString());
			}
                    return str.toString();
}
 public void namingblocks(){
                    for(int i=0;i<blocks.length;i++){
 			blocks[i]=new Block(String.format("Block-%c",blockID[i]));
}
}

  public String getSocietyName(){
	return societyname;
}

  public void AddBlock(int addstreets){
        Block newblocks[]=new Block[blocks.length+1];
        for(int j=0;j<newblocks.length;j++){
	  if(j==blocks.length){
 			newblocks[j]=new Block(String.format("Block-%c",blockID[j]),addstreets);  
                         }
          else{
		newblocks[j]=blocks[j];
}
        }
        blocks=newblocks;

}

public Block findBlockByName(String name){
 	for(int i=0;i<blocks.length;i++) {
               if(blocks[i].blockname.equals(name)) {
               return blocks[i];}
               else
                  return null; 
}
                  return null;
}

  public boolean book(String blockName, String plotId){ 
	Block b = findBlockByName(blockName);
       if(b==null) 
         {return false;}
        return 
         b.booking(plotId); }
 
  public boolean cancel(String blockName, String plotId){
	 Block b = findBlockByName(blockName); 
	if(b==null){
          return false;}
           return b.CancelBooking(plotId); 
}

    public void printSummary(){ 
            System.out.println("Society: " + societyname); 
             for(int i=0;i<blocks.length;i++){
               Block b1=blocks[i];
               System.out.println(" Block "+b1.blockname+": total="+ b1.totalPlots()+", available=" +b1.availablePlots());
        }
    }

}
