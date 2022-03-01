public class Soil {
    
public String calculMoisture ( float moistureValue, int soilType){
    String answer = "Soil type not found";
    switch (soilType) {
            case 1:
                System.out.println("FineClay");
                answer = this.calcFineClay(moistureValue);
                break;
            case 2:
                System.out.println("MediumLoamy");
                answer =  this.calcloamyMedium(moistureValue);
                
                break;
            case 3:
                System.out.println("SandyCoarse");
                answer = this.calcSandyCoarse(moistureValue);
                
                break;
            default:
            answer = "Soil type not found";
                break;
        }
    return answer;
  }

    private String calcloamyMedium (float moisture){
      String answer = "Error";
        if (moisture<70){
          answer = "DANGER! Critical condition";
          
    }else if (moisture >=70 && moisture<88 ){
        answer = "ATTENTION! Irrigation to be applied";
    }else if (moisture >=88 && moisture<100){
        answer = "It's good! No Irrigation Needed";
    }else if (moisture >= 100 ){
        answer = "Containment water may be needed";
        
    }
    return answer;
    }

    private String calcFineClay(float moisture) {
       String answer = "Error";
        if (moisture < 60){
          answer = "DANGER! Critical condition";
          
    }else if (moisture >=60 && moisture <80 ){
        answer = "ATTENTION! Irrigation to be applied";
    }else if (moisture  >=80 && moisture <100){
        answer = "It's good! No Irrigation Needed";
    }else if (moisture >=100){
         answer = "Containment water may be needed";
    }
        return answer;
    }

    private String calcSandyCoarse(float moisture) {
       String answer = "Error";
        if (moisture < 80){
          answer = "DANGER! Critical condition";
          
    }else if (moisture >=80 && moisture<90 ){
        answer = "ATTENTION! Irrigation to be applied";
    }else if (moisture>=90 && moisture<100){
        answer = "It's good! No Irrigation Needed.";
      
    
    }else if (moisture>=100){
        answer = "Containment water may be needed";
    }
   
        return answer;
    
    }  
}
