class NamedCow extends Cow
{
     protected String myType;     
     protected String mySound;
     private String myName;
		public NamedCow(String type,String name, String sound)     {         
         myType = type;         
         mySound = sound; 
         myName=name;    
     }     
     public NamedCow()     {         
         myType = "unknown";         
         mySound = "unknown";
         myName="unknown";     
     }  
		     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     public String getName(){return myName;}    
}
