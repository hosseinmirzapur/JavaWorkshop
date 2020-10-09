public class Fee {
    public double sum=0;
    Costs costs=new Costs();
    Services services=new Services();
    public void finalCalculation(){
        sum+=services.SMS()*costs.smsCost;
        sum+=services.inCallsInLine()*costs.inCallsInLine;
        sum+=services.inCallsOutLine()*costs.inCallsOutLine;
        sum+=services.outCalls()*costs.outCalls;
        sum+=services.gigaBytes()* costs.gigaByteCost;
        System.out.println("Your fee costs:"+(sum*costs.taxesCoefficiency)+" Rials");
    }
}
