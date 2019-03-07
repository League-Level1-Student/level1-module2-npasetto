
public class TeaParty {
	

	       public String welcome(String name, boolean isWoman, boolean isKnighted)
	       {
               if(isWoman==false) {
            	   if(isKnighted==false) {
            		   return "Hello Mr. "+name;
            	   }else {
            		  return "Hello Sir "+name;
            	   }
               }else {
            	   if(isKnighted==false) {
            		   return "Hello Ms. "+name;
            	   }else {
            		   return "Hello Lady "+name;
            	   }
               }
	       }

	
}
